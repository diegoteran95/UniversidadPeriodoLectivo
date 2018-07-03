/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.universidad.periodolectivo.rest;

import ec.edu.espe.arquitectura.universidad.periodolectivo.model.PrlNrc;
import ec.edu.espe.arquitectura.universidad.periodolectivo.model.PrlPeriodoLectivo;
import ec.edu.espe.arquitectura.universidad.periodolectivo.modelws.PrlNrcWS;
import ec.edu.espe.arquitectura.universidad.periodolectivo.modelws.PrlPeriodoLectivoWS;
import ec.edu.espe.arquitectura.universidad.periodolectivo.services.PrlNrcService;
import ec.edu.espe.arquitectura.universidad.periodolectivo.services.PrlPeriodoLectivoService;
import ec.edu.espe.arquitectura.universidad.periodolectivo.ws.ResponseWS;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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
        List<PrlNrc> nrcs = this.nrcService.listarNrcPorPeriodo(nrcBuscar.getCodPeriodo());
        ResponseWS respuesta=new ResponseWS();
        if (nrcs != null && nrcs.size()>0) {
            for (PrlNrc nrc : nrcs) {
                PrlNrcWS nrcAux = new PrlNrcWS();
                nrcAux.setCodNrc(nrc.getPrlNrcPK().getCodNrc());
                nrcAux.setCodPeriodo(nrc.getPrlNrcPK().getCodPeriodo());
                nrcAux.setCodAsignatura(nrc.getCodAsignatura().getCodAsignatura());
                nrcAux.setCodPersona(nrc.getCodPersona());
                nrcWs.add(nrcAux);
            }
            respuesta.setCodigoRetorno("OK");
            respuesta.setMensajeRetorno("Nrc obtenidos exitosamente");
            respuesta.setRespuesta(nrcWs);
            return Response.ok(respuesta).build();
        } else {
            respuesta.setCodigoRetorno("ERR");
            respuesta.setMensajeRetorno("Error al consultar Nrc por periodo");
            respuesta.setRespuesta(null);
            return Response.ok(respuesta).build();
//            return Response.status(Response.Status.NOT_FOUND).build();
        }

    }
    
    @POST
    @Path("listarNrcPorDocente")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response listarNrcPorDocente(PrlNrcWS nrcBuscar) {
        //TODO return proper representation object
        List<PrlNrcWS> nrcWs = new ArrayList<PrlNrcWS>();
        List<PrlNrc> nrcs = this.nrcService.listarNrcDocente(nrcBuscar.getCodPeriodo(),nrcBuscar.getCodPersona());
        ResponseWS respuesta=new ResponseWS();
        if (nrcs != null && nrcs.size()>0) {
            for (PrlNrc nrc : nrcs) {
                PrlNrcWS nrcAux = new PrlNrcWS();
                nrcAux.setCodNrc(nrc.getPrlNrcPK().getCodNrc());
                nrcAux.setCodPeriodo(nrc.getPrlNrcPK().getCodPeriodo());
                nrcAux.setCodAsignatura(nrc.getCodAsignatura().getCodAsignatura());
                nrcAux.setCodPersona(nrc.getCodPersona());
                nrcWs.add(nrcAux);
            }
            respuesta.setCodigoRetorno("OK");
            respuesta.setMensajeRetorno("Nrc de docente obtenidos exitosamente");
            respuesta.setRespuesta(nrcWs);
            return Response.ok(respuesta).build();
        } else {
            respuesta.setCodigoRetorno("ERR");
            respuesta.setMensajeRetorno("Error al consultar Nrc por docente");
            respuesta.setRespuesta(null);
            return Response.ok(respuesta).build();
//            return Response.status(Response.Status.NOT_FOUND).build();
        }

    }

    
//    @GET
//    @Produces("text/html")
//    public String getHtml() {
//        return "<html><body><h1>Hello, World!!</body></h1></html>";
//    }

}
