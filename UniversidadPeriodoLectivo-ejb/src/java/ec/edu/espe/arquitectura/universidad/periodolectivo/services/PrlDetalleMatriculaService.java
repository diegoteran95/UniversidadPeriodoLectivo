/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.universidad.periodolectivo.services;

import ec.edu.espe.arquitectura.universidad.periodolectivo.dao.PrlDetalleMatriculaFacade;
import ec.edu.espe.arquitectura.universidad.periodolectivo.model.PrlDetalleMatricula;
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
public class PrlDetalleMatriculaService {

    @EJB
    private PrlDetalleMatriculaFacade detalleMatFacade;
    
    public PrlDetalleMatricula obtenerDetalleMatriculaPorId(String codDetMat){
        return detalleMatFacade.find(codDetMat);
    }
    
    public void crearDetalleMatricula(PrlDetalleMatricula detalle){
        detalleMatFacade.create(detalle);
    }
    
    public List<PrlDetalleMatricula> obtenerDetallesMatricula(){
        return detalleMatFacade.findAll();
    }
    
    public List<PrlDetalleMatricula> listarNrcEstudiante(String codPeriodo,String codPersona){
        return detalleMatFacade.listarNrcEstudiante(codPeriodo, codPersona);
    }
}
