/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.universidad.periodolectivo.rest;

import ec.edu.espe.arquitectura.universidad.periodolectivo.model.PrlCalificacion;
import ec.edu.espe.arquitectura.universidad.periodolectivo.model.PrlDetalleMatricula;
import ec.edu.espe.arquitectura.universidad.periodolectivo.model.PrlMatricula;
import ec.edu.espe.arquitectura.universidad.periodolectivo.modelws.PrlCalificacionWS;
import ec.edu.espe.arquitectura.universidad.periodolectivo.modelws.PrlDetalleMatriculaWS;
import ec.edu.espe.arquitectura.universidad.periodolectivo.modelws.PrlMatriculaWS;
import ec.edu.espe.arquitectura.universidad.periodolectivo.services.PrlCalificacionService;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

/**
 *
 * @author diego
 */
@Path("calificacion")
@RequestScoped
public class CalificacionResource {
    @Context
    private UriInfo context;
    
    @Inject
    private PrlCalificacionService calificacionService;
    
    @POST
    @Path("listarCalificacionesEstudiante")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response listarCalificacionesEstudiante(PrlCalificacionWS calificacionBuscar) {
        List<PrlCalificacionWS> calificacionWS = new ArrayList<>();
        try {
            List<PrlCalificacion> calificacion = this.calificacionService.listarCalificacionEstudiante(calificacionBuscar.getCodNrc(), calificacionBuscar.getCodPersona());
            if (calificacion.size() >0) {
                for (PrlCalificacion cal : calificacion) {
                    PrlCalificacionWS calificacionAux = new PrlCalificacionWS();
                    calificacionAux.setCodNrc(cal.getPrlCalificacionPK().getCodNrc());
                    calificacionAux.setCodMatricula(cal.getPrlCalificacionPK().getCodMatricula());
                    calificacionAux.setCodPersona(cal.getPrlDetalleMatricula().getPrlMatricula().getCodPersona());
                    calificacionAux.setCodPeriodo(cal.getPrlCalificacionPK().getCodPeriodo());
                    calificacionAux.setSecCalificacion(cal.getPrlCalificacionPK().getSecCalificacion());
                    calificacionAux.setPuntaje(cal.getPuntaje());
                    calificacionWS.add(calificacionAux);
                }
                return Response.ok(calificacionWS).build();
            } else {
                return Response.status(404).build();
            }

        } catch (Exception ex) {
            return Response.serverError().build();
        }
    }
    
}
