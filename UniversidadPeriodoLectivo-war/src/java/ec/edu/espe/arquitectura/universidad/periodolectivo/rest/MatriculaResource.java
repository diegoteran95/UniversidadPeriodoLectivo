/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.universidad.periodolectivo.rest;

import ec.edu.espe.arquitectura.universidad.periodolectivo.model.PrlDetalleMatricula;
import ec.edu.espe.arquitectura.universidad.periodolectivo.model.PrlMatricula;
import ec.edu.espe.arquitectura.universidad.periodolectivo.modelws.PrlDetalleMatriculaWS;
import ec.edu.espe.arquitectura.universidad.periodolectivo.modelws.PrlMatriculaWS;
import ec.edu.espe.arquitectura.universidad.periodolectivo.services.PrlDetalleMatriculaService;
import ec.edu.espe.arquitectura.universidad.periodolectivo.services.PrlMatriculaService;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author diego
 */
@Path("matricula")
@RequestScoped
public class MatriculaResource {

    @Context
    private UriInfo context;

    @Inject
    private PrlMatriculaService matriculaService;

    @Inject
    private PrlDetalleMatriculaService detalleMatriculaService;

    /**
     * Creates a new instance of MatriculaResource
     */
    public MatriculaResource() {
    }

    /**
     * Retrieves representation of an instance of
     * ec.edu.espe.arquitectura.universidad.periodolectivo.rest.MatriculaResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Path("obtenerMatriculas")
    @Produces(MediaType.APPLICATION_JSON)
    public Response obtenerMatriculas() {

        List<PrlMatriculaWS> matriculaWs = new ArrayList<PrlMatriculaWS>();
        try {
            List<PrlMatricula> matriculas = matriculaService.obtenerMatriculas();
            if (matriculas != null && matriculas.size() > 0) {
                for (PrlMatricula mat : matriculas) {
                    List<PrlDetalleMatriculaWS> detalleMatricula = new ArrayList<PrlDetalleMatriculaWS>();
                    PrlMatriculaWS matriculaAux = new PrlMatriculaWS();
                    matriculaAux.setCodMatricula(mat.getCodMatricula());
                    matriculaAux.setCodPeriodo(mat.getCodPeriodo().getCodPeriodo());
                    matriculaAux.setCodPersona(mat.getCodPersona());
                    matriculaAux.setPromedio(mat.getPromedio());
                    matriculaAux.setCostoMatricula(mat.getCostoMatricula());
                    matriculaAux.setPagado(mat.getPagado());
                    for (int i = 0; i < mat.getPrlDetalleMatriculaList().size(); i++) {
//                        if (mat.getPrlDetalleMatriculaList().get(i).getPrlDetalleMatriculaPK().getCodMatricula().equals(matriculaAux.getCodMatricula())) {
                        PrlDetalleMatriculaWS det = new PrlDetalleMatriculaWS();
                        det.setCodNrc(mat.getPrlDetalleMatriculaList().get(i).getPrlDetalleMatriculaPK().getCodNrc());
                        det.setCodPeriodo(mat.getPrlDetalleMatriculaList().get(i).getPrlDetalleMatriculaPK().getCodPeriodo());
                        det.setCodMatricula(mat.getPrlDetalleMatriculaList().get(i).getPrlDetalleMatriculaPK().getCodMatricula());
                        det.setCostoNrc(mat.getPrlDetalleMatriculaList().get(i).getCostoNrc());
                        det.setAprobacionNrc(mat.getPrlDetalleMatriculaList().get(i).getAprobacionNrc().getTexto());
                        detalleMatricula.add(det);
//                        }
                    }
                    matriculaAux.setDetalleMatricula(detalleMatricula);
                    matriculaWs.add(matriculaAux);
                }
                return Response.ok(matriculaWs).build();
            } else {
                return Response.ok(Response.Status.NOT_FOUND).build();
//            return Response.status(Response.Status.NOT_FOUND).build();
            }
        } catch (Exception ex) {
            return Response.serverError().build();
        }
    }

    @POST
    @Path("listarNrcEstudiante")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response listarNrcPorDocente(PrlMatriculaWS matriculaBuscar) {
        //TODO return proper representation object
        List<PrlMatriculaWS> matriculasWS = new ArrayList<>();
        List<PrlDetalleMatriculaWS> detalleMatriculaWs = new ArrayList<PrlDetalleMatriculaWS>();
        try {
            List<PrlMatricula> matricula = this.matriculaService.obtenerMatricula(matriculaBuscar.getCodPeriodo(), matriculaBuscar.getCodPersona());
            if (matricula != null) {
                for (PrlMatricula mat : matricula) {
                    detalleMatriculaWs = new ArrayList<PrlDetalleMatriculaWS>();
                    PrlMatriculaWS matriculaAux = new PrlMatriculaWS();
                    matriculaAux.setCodMatricula(mat.getCodMatricula());
                    matriculaAux.setCodPeriodo(mat.getCodPeriodo().getCodPeriodo());
                    matriculaAux.setCodPersona(mat.getCodPersona());
                    matriculaAux.setPromedio(mat.getPromedio());
                    matriculaAux.setCostoMatricula(mat.getCostoMatricula());
                    matriculaAux.setPagado(mat.getPagado());

                    List<PrlDetalleMatricula> detalles = this.detalleMatriculaService.listarNrcEstudiante(matriculaBuscar.getCodPeriodo(), matriculaBuscar.getCodPersona());
                    if (detalles != null && detalles.size() > 0) {
                        for (PrlDetalleMatricula det : detalles) {
                            PrlDetalleMatriculaWS detalleAux = new PrlDetalleMatriculaWS();
                            detalleAux.setCodMatricula(det.getPrlDetalleMatriculaPK().getCodMatricula());
                            detalleAux.setCodNrc(det.getPrlDetalleMatriculaPK().getCodNrc());
                            detalleAux.setCodPeriodo(det.getPrlDetalleMatriculaPK().getCodPeriodo());
                            detalleAux.setCostoNrc(det.getCostoNrc());
                            detalleAux.setAprobacionNrc(det.getAprobacionNrc().getTexto());
                            detalleMatriculaWs.add(detalleAux);
                        }
                        matriculaAux.setDetalleMatricula(detalleMatriculaWs);
                        matriculasWS.add(matriculaAux);

                    }
                }
                return Response.ok(matriculasWS).build();
            } else {
                return Response.ok(Response.Status.NOT_FOUND).build();
            }

        } catch (Exception ex) {
            return Response.serverError().build();
        }
    }

    /**
     * PUT method for updating or creating an instance of MatriculaResource
     *
     * @param content representation for the resource
     */
    @PUT
    @Path("matriculacion")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response matriculacion(PrlMatriculaWS matricula) {
        try {
            boolean band = this.matriculaService.matriculacion(matricula.getCodPeriodo(), matricula.getCodPersona(), matricula.getCodNrc());
            if (band) {
                return Response.ok(Response.Status.CREATED).build();
            } else {
                return Response.status(404).build();
            }

        } catch (Exception ex) {
            return Response.serverError().build();
        }
    }
}
