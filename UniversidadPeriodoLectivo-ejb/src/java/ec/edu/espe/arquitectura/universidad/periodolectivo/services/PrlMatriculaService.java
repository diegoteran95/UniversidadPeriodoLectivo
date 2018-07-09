/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.universidad.periodolectivo.services;

import ec.edu.espe.arquitectura.universidad.periodolectivo.dao.PrlMatriculaFacade;
import ec.edu.espe.arquitectura.universidad.periodolectivo.enums.PrlDetalleMatriculaEnum;
import ec.edu.espe.arquitectura.universidad.periodolectivo.model.PrlDetalleMatricula;
import ec.edu.espe.arquitectura.universidad.periodolectivo.model.PrlDetalleMatriculaPK;
import static ec.edu.espe.arquitectura.universidad.periodolectivo.model.PrlDetalleMatricula_.prlDetalleMatriculaPK;
import ec.edu.espe.arquitectura.universidad.periodolectivo.model.PrlMatricula;
import ec.edu.espe.arquitectura.universidad.periodolectivo.model.PrlPeriodoLectivo;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author diego
 */
@Stateless
@LocalBean
public class PrlMatriculaService {

    @EJB
    private PrlMatriculaFacade matriculaFacade;

    @EJB
    private PrlPeriodoLectivoService periodoFacade;

    @EJB
    private PrlDetalleMatriculaService detalleMatriculaFacade;

    private Integer secuenciaMatricula;
    private List<PrlMatricula> matriculasExistentes;

    public List<PrlMatricula> obtenerMatriculas() {
        return matriculaFacade.findAll();
    }
    
    public List<PrlDetalleMatricula> obtenerDetalleMatricula() {
        return detalleMatriculaFacade.obtenerDetallesMatricula();
    }

    public void matriculacion(String codPeriodo, String codEstudiante, String codNrcs) {
        PrlPeriodoLectivo periodo = new PrlPeriodoLectivo(codPeriodo);;
//        List<PrlDetalleMatricula> detalleMatricula = new ArrayList<PrlDetalleMatricula>();
//        String[] detalles = codNrcs.split("\\*");
//        for (int i = 0; i < detalles.length; i++) {
//            PrlDetalleMatricula detMat = detalleMatriculaFacade.obtenerDetalleMatriculaPorId(detalles[i]);
//        }
        this.secuenciaMatricula = 0;
        this.matriculasExistentes = obtenerMatriculas();
        if (!this.matriculasExistentes.isEmpty()) {
            Integer ultimoHorario = this.matriculasExistentes.size();
            this.secuenciaMatricula = Integer.parseInt(this.matriculasExistentes.get(ultimoHorario - 1).getCodMatricula().split("M")[1]);
            this.secuenciaMatricula++;
        }
        DecimalFormat formateador = new DecimalFormat("000000000");
        try {
            PrlMatricula matricula = new PrlMatricula();
            String codMatricula = "M" + formateador.format(this.secuenciaMatricula);
            matricula.setCodMatricula(codMatricula);
            matricula.setCodPeriodo(periodo);
            matricula.setCostoMatricula(new BigDecimal("0"));
            matricula.setPromedio(new BigDecimal("0"));
            matricula.setPagado("NO");
            matricula.setCodPersona(codEstudiante);
            this.matriculaFacade.create(matricula);
            guardarDetalleMatricula(codPeriodo, codNrcs, codMatricula);
//            Messages.addFlashGlobalInfo("Se agregó el Nrc: " + nuevoNrc.getNrcPK().getCodNrc() + ", para la materia" + this.asignaturaSeleccionada.getNombre());
        } catch (Exception ex) {
            System.out.println("Ocurrí\u00f3 un error al guardar la matrícula");
        }
    }

    public void guardarDetalleMatricula(String codPeriodo, String codNrcs, String codMatricula) {
        String[] nrcs = codNrcs.split("\\*");
        PrlDetalleMatriculaPK detallePK = new PrlDetalleMatriculaPK();
        detallePK.setCodMatricula(codMatricula);
        detallePK.setCodPeriodo(codPeriodo);

        for (int i = 0; i < nrcs.length; i++) {
            PrlDetalleMatricula detalle = new PrlDetalleMatricula();
            detallePK.setCodNrc(nrcs[i]);
            detalle.setAprobacionNrc(PrlDetalleMatriculaEnum.NO);
            detalle.setPrlDetalleMatriculaPK(detallePK);
            try {
                this.detalleMatriculaFacade.crearDetalleMatricula(detalle);
            } catch (Exception ex) {
                System.out.println("Error al insertar el detalle de matricula");
            }
        }
    }
}
