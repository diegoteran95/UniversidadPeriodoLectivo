/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.universidad.periodolectivo.services;

import ec.edu.espe.arquitectura.universidad.periodolectivo.dao.PrlCalificacionFacade;
import ec.edu.espe.arquitectura.universidad.periodolectivo.model.PrlCalificacion;
import ec.edu.espe.arquitectura.universidad.periodolectivo.model.PrlMatricula;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author diego
 */

@Stateless
@LocalBean
public class PrlCalificacionService {
    @EJB
    private PrlCalificacionFacade calificacionFacade;
    
    public List<PrlCalificacion> listarCalificacionEstudiante(String codNrc, String codPersona){
        return calificacionFacade.listarCalificacionEstudiante(codNrc, codPersona);
    }
    
    public void crearCalificacion(PrlCalificacion calificacion){
        this.calificacionFacade.create(calificacion);
    }
    
}
