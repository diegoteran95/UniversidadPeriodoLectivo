/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.universidad.periodolectivo.rest;

import ec.edu.espe.arquitectura.universidad.periodolectivo.model.PrlNrc;
import ec.edu.espe.arquitectura.universidad.periodolectivo.modelws.PrlNrcWS;
import ec.edu.espe.arquitectura.universidad.periodolectivo.services.PrlNrcService;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author diego
 */
@Path("nrc")
@RequestScoped
public class NrcResource {

    @Context
    private UriInfo context;

    @Inject
    private PrlNrcService nrcService;

    /**
     * Creates a new instance of NrcResource
     */
    public NrcResource() {
    }

    /**
     * Retrieves representation of an instance of
     * ec.edu.espe.arquitectura.universidad.periodolectivo.rest.NrcResource
     *
     * @return an instance of java.lang.String
     */
    @POST
    @Path("listarNrcPorPeriodo")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response listarNrcPorPeriodo(PrlNrcWS nrcBuscar) {
        //TODO return proper representation object
        List<PrlNrcWS> nrcWs = new ArrayList<PrlNrcWS>();
        try {
            List<PrlNrc> nrcs = this.nrcService.listarNrcPorPeriodo(nrcBuscar.getCodPeriodo());
            if (nrcs != null && nrcs.size() > 0) {
                for (PrlNrc nrc : nrcs) {
                    PrlNrcWS nrcAux = new PrlNrcWS();
                    nrcAux.setCodNrc(nrc.getPrlNrcPK().getCodNrc());
                    nrcAux.setCodPeriodo(nrc.getPrlNrcPK().getCodPeriodo());
                    nrcAux.setCodAsignatura(nrc.getCodAsignatura());
                    nrcAux.setCodPersona(nrc.getCodPersona());
                    nrcWs.add(nrcAux);
                }
                return Response.ok(nrcWs).build();
            } else {
                return Response.ok(Response.Status.NOT_FOUND).build();
//            return Response.status(Response.Status.NOT_FOUND).build();
            }
        } catch (Exception ex) {
            return Response.serverError().build();
        }

    }

    @POST
    @Path("listarNrcPorDocente")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response listarNrcPorDocente(PrlNrcWS nrcBuscar) {
        //TODO return proper representation object
        List<PrlNrcWS> nrcWs = new ArrayList<PrlNrcWS>();
        try {
            List<PrlNrc> nrcs = this.nrcService.listarNrcDocente(nrcBuscar.getCodPeriodo(), nrcBuscar.getCodPersona());
            if (nrcs != null && nrcs.size() > 0) {
                for (PrlNrc nrc : nrcs) {
                    PrlNrcWS nrcAux = new PrlNrcWS();
                    nrcAux.setCodNrc(nrc.getPrlNrcPK().getCodNrc());
                    nrcAux.setCodPeriodo(nrc.getPrlNrcPK().getCodPeriodo());
                    nrcAux.setCodAsignatura(nrc.getCodAsignatura());
                    nrcAux.setCodPersona(nrc.getCodPersona());
                    nrcWs.add(nrcAux);
                }
                return Response.ok(nrcWs).build();
            } else {
                return Response.ok(Response.Status.NOT_FOUND).build();
//            return Response.status(Response.Status.NOT_FOUND).build();
            }
        } catch (Exception ex) {
            return Response.serverError().build();
        }
    }

    @PUT
    @Path("generarNrc")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response generarNrc(PrlNrcWS nrcBuscar) {
        try {
            this.nrcService.generarNrc(nrcBuscar.getCantidadNrc(), nrcBuscar.getCodPeriodo(), nrcBuscar.getCodAsignatura());
            return Response.ok(Response.Status.CREATED).build();
        } catch (Exception ex) {
            return Response.serverError().build();
        }
    }
    
    @POST
    @Path("asignarDocenteNrc")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response asignarDocenteNrc(PrlNrcWS nrcBuscar) {
        try {
            this.nrcService.asignarDocenteNRC(nrcBuscar.getCodPersona(), nrcBuscar.getCodNrc());
            return Response.ok(Response.Status.OK).build();
        } catch (Exception ex) {
            return Response.serverError().build();
        }
    }

//    @GET
//    @Produces("text/html")
//    public String getHtml() {
//        return "<html><body><h1>Hello, World!!</body></h1></html>";
//    }
}
