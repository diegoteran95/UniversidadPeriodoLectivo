/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.universidad.periodolectivo.dao;

import ec.edu.espe.arquitectura.universidad.periodolectivo.model.PrlDetalleMatricula;
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
public class PrlDetalleMatriculaFacade extends AbstractFacade<PrlDetalleMatricula> {

    @PersistenceContext(unitName = "UniversidadPeriodoLectivo-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PrlDetalleMatriculaFacade() {
        super(PrlDetalleMatricula.class);
    }
    
    public List<PrlDetalleMatricula> listarNrcEstudiante(String codPeriodo, String codPersona) {
        Query q = this.em.createQuery("SELECT obj FROM PrlDetalleMatricula obj WHERE obj.prlMatricula.codPersona = ?1 AND obj.prlDetalleMatriculaPK.codPeriodo = ?2");
        q.setParameter(1, codPersona);
        q.setParameter(2, codPeriodo);
        return q.getResultList();
    }
    
}
