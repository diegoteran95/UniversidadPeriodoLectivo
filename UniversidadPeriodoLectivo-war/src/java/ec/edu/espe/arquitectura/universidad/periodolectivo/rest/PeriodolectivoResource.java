/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.universidad.periodolectivo.rest;

import ec.edu.espe.arquitectura.universidad.periodolectivo.model.PrlPeriodoLectivo;
import ec.edu.espe.arquitectura.universidad.periodolectivo.modelws.PrlPeriodoLectivoWS;
import ec.edu.espe.arquitectura.universidad.periodolectivo.services.PrlPeriodoLectivoService;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author diego
 */
@Path("periodolectivo")
@RequestScoped
public class PeriodolectivoResource {

    @Context
    private UriInfo context;
    
    
    @Inject
    private PrlPeriodoLectivoService periodoService;

    /**
     * Creates a new instance of PeriodolectivoResource
     */
    public PeriodolectivoResource() {
    }

    /**
     * Retrieves representation of an instance of ec.edu.espe.arquitectura.universidad.periodolectivo.rest.PeriodolectivoResource
     * @return an instance of java.lang.String
     */
    @GET
    @Path("listarPeriodos")
    @Produces("application/json")
    public Response listarPeriodos() {
        //TODO return proper representation object
        List<PrlPeriodoLectivoWS> per = new ArrayList<PrlPeriodoLectivoWS>();
        List<PrlPeriodoLectivo> periodos = this.periodoService.listarPeriodos();
//        List<PrlPeriodoLectivo> nrc = new ArrayList<PrlPeriodoLectivo>();
//        PrlPeriodoLectivo pr = new PrlPeriodoLectivo("201820", "PRI", new Date(), new Date(), BigDecimal.ZERO, 3, PrlPeriodoLectivoEnum.ACT);
//        nrc.add(pr);
//        PrlPeriodoLectivo pr2 = new PrlPeriodoLectivo("201810", "SEC", new Date(), new Date(), BigDecimal.ZERO, 3, PrlPeriodoLectivoEnum.ACT);
//        nrc.add(pr2);
//        GenericEntity<List<PrlPeriodoLectivo>> ge = new GenericEntity<List<PrlPeriodoLectivo>>(nrc) {
//            };
        if (periodos != null) {
            for (PrlPeriodoLectivo periodo : periodos) {
                PrlPeriodoLectivoWS perAux = new PrlPeriodoLectivoWS();
                perAux.setCodigo(periodo.getCodPeriodo());
                perAux.setSemestre(periodo.getSemestre());
                perAux.setFehaInicio(periodo.getFehaInicio());
                perAux.setFechaFin(periodo.getFechaFin());
                perAux.setCostoCredito(periodo.getCostoCredito());
                perAux.setComponentesEvaluacion(periodo.getComponentesEvaluacion());
                perAux.setEstado(perAux.getEstado());
                per.add(perAux);
            }
            return Response.ok(per).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    /**
     * PUT method for updating or creating an instance of PeriodolectivoResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
