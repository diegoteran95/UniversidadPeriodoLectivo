/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.universidad.periodolectivo.dao;

import ec.edu.espe.arquitectura.universidad.periodolectivo.model.PrlCalificacion;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author diego
 */
@Stateless
public class PrlCalificacionFacade extends AbstractFacade<PrlCalificacion> {

    @PersistenceContext(unitName = "UniversidadPeriodoLectivo-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PrlCalificacionFacade() {
        super(PrlCalificacion.class);
    }

    public List<PrlCalificacion> listarCalificacionEstudiante(String codNrc, String codPersona) {
        Query q = this.em.createQuery("SELECT obj FROM PrlCalificacion obj WHERE obj.prlDetalleMatricula.prlMatricula.codPersona = ?1 AND obj.prlCalificacionPK.codNrc = ?2");
        q.setParameter(1, codPersona);
        q.setParameter(2, codNrc);
        return q.getResultList();
    }

    public PrlCalificacion buscarNotaPorId(String codNrc, String codPersona, Integer secuencial) {
        Query q = this.em.createQuery("SELECT obj FROM PrlCalificacion obj WHERE obj.prlDetalleMatricula.prlMatricula.codPersona = ?1 AND obj.prlCalificacionPK.codNrc = ?2 AND obj.prlCalificacionPK.secCalificacion = ?3");
        q.setParameter(1, codPersona);
        q.setParameter(2, codNrc);
        q.setParameter(3, secuencial);
        return (PrlCalificacion) q.getSingleResult();
    }

}
