/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.universidad.periodolectivo.services;

import ec.edu.espe.arquitectura.universidad.periodolectivo.dao.PrlNrcFacade;
import ec.edu.espe.arquitectura.universidad.periodolectivo.model.OrgAsignatura;
import ec.edu.espe.arquitectura.universidad.periodolectivo.model.PrlNrc;
import ec.edu.espe.arquitectura.universidad.periodolectivo.model.PrlNrcPK;
import ec.edu.espe.arquitectura.universidad.periodolectivo.model.PrlPeriodoLectivo;
import ec.edu.espe.arquitectura.universidad.periodolectivo.ws.ResponseWS;
import java.text.DecimalFormat;
import java.util.ArrayList;
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
public class PrlNrcService {

    @EJB
    private PrlNrcFacade nrcFacade;

    private Integer secuenciaNrc;
    private List<PrlNrc> nrcExistentes;
    private PrlPeriodoLectivoService periodoFacade;
    private List<PrlNrc> nrcGenerados;

    public List<PrlNrc> listarNrcs() {
        return this.nrcFacade.findAll();
    }

    public PrlNrc buscarNrcPorId(String id) {
        return this.nrcFacade.find(id);
    }

    public void generarNrc(Integer numNRC, String codPeriodo, String codAsignatura) {
//        PrlNrc nrc=this.nrcFacade.find("0");
//        this.nrcFacade.remove(nrc);
        PrlPeriodoLectivo periodo = new PrlPeriodoLectivo(codPeriodo);
        OrgAsignatura asignatura = new OrgAsignatura(codAsignatura);
        this.secuenciaNrc = 1;
        this.nrcGenerados = new ArrayList<PrlNrc>();
        this.nrcExistentes = listarNrcs();
        if (!this.nrcExistentes.isEmpty()) {
            Integer ultimoNrc = this.nrcExistentes.size();
            this.secuenciaNrc = Integer.parseInt(this.nrcExistentes.get(ultimoNrc - 1).getPrlNrcPK().getCodNrc().split("-")[1]);
            this.secuenciaNrc++;
        }
        Integer cantNRC = 0;
        cantNRC = numNRC;
        DecimalFormat formateador = new DecimalFormat("000");
        if (cantNRC > 0) {
            for (int j = 0; j < cantNRC; j++) {
                PrlNrc nuevoNrc = new PrlNrc();
                nuevoNrc.setPrlNrcPK(new PrlNrcPK("N-" + formateador.format(this.secuenciaNrc), periodo.getCodPeriodo()));
                nuevoNrc.setCodAsignatura(asignatura);
                nuevoNrc.setCodPersona(null);
                this.nrcGenerados.add(nuevoNrc);
                try {
                    this.nrcFacade.create(nuevoNrc);
                    System.out.println("Se agregó el Nrc: " + nuevoNrc.getPrlNrcPK().getCodNrc() + ", para la materia" + asignatura.getNombre());
                } catch (Exception ex) {
                    System.out.println("Ocurrí\u00f3 un error al generar los Nrc");
                }
                secuenciaNrc++;
            }
            // this.nrcExistentesAsignatura = this.nrcService.listarNrcAsignaturaPeriodo(asignaturaSeleccionada, periodoSeleccionado);
        }
    }

    public void asignarDocenteNRC(String codDocente, String codNrc) {
        PrlNrc nrc = listarInformacionNrc(codNrc);
        nrc.setCodPersona(codDocente);
        System.out.println("hola");
        nrcFacade.edit(nrc);
    }

//    public List<PrlNrc> listarNrcPorAsignatura(String codAsignatura){
//        OrgAsignatura asignatura=new OrgAsignatura(codAsignatura);
//        return nrcFacade.listarNrcAsignatura(asignatura);
//    }
    public List<PrlNrc> listarNrcAsignaturaPeriodo(String codAsignatura, String codPeriodo) {
        PrlPeriodoLectivo periodo = this.periodoFacade.buscarPeriodoPorId(codPeriodo);
        OrgAsignatura asignatura = new OrgAsignatura(codAsignatura);
        return nrcFacade.listarNrcAsignaturaPeriodo(asignatura, periodo);
    }

    public List<PrlNrc> listarNrcPorPeriodo(String codPeriodo) {
        PrlPeriodoLectivo periodo = new PrlPeriodoLectivo();
        periodo.setCodPeriodo(codPeriodo);
        return nrcFacade.listarNrcPeriodo(periodo);
    }

//    public ResponseWS listarNrcPorPeriodoWS(String codPeriodo) {
//        ResponseWS respuesta = new ResponseWS();
////        PrlPeriodoLectivo periodo = this.periodoFacade.buscarPeriodoPorId(codPeriodo);
//        PrlPeriodoLectivo periodo = new PrlPeriodoLectivo();
//        periodo.setCodPeriodo(codPeriodo);
//        List<PrlNrc> nrc = nrcFacade.listarNrcPeriodo(periodo);
//        if (!nrc.isEmpty()) {
//            respuesta.setCodigoRetorno("OK");
//            respuesta.setMensajeRetorno("Nrc obtenidos exitosamente");
//            respuesta.setRespuesta(nrc);
//        } else {
//            respuesta.setCodigoRetorno("ERR");
//            respuesta.setMensajeRetorno("Error al consultar Nrc por periodo");
//            respuesta.setRespuesta(nrc);
//        }
//        return respuesta;
//    }

    public List<PrlNrc> listarNRCPorNombre(String nrc) {
        return nrcFacade.listarNRCPorNombre(nrc);
    }

    public List<PrlNrc> listarNrcDocente(String codPeriodo, String codDocente) {
        return nrcFacade.listarNrcDocente(codPeriodo, codDocente);
    }
    
    public PrlNrc listarInformacionNrc(String codNrc){
        return nrcFacade.listarInformacionNrc(codNrc);
    }

}
