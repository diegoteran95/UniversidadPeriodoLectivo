/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.universidad.periodolectivo.dao;

import ec.edu.espe.arquitectura.universidad.periodolectivo.model.OrgAsignatura;
import ec.edu.espe.arquitectura.universidad.periodolectivo.model.PrlNrc;
import ec.edu.espe.arquitectura.universidad.periodolectivo.model.PrlPeriodoLectivo;
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
public class PrlNrcFacade extends AbstractFacade<PrlNrc> {

    @PersistenceContext(unitName = "UniversidadPeriodoLectivo-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PrlNrcFacade() {
        super(PrlNrc.class);
    }
    
    public List<PrlNrc> listarNrcAsignatura(OrgAsignatura codAsignatura) {
        Query q = this.em.createQuery("SELECT obj FROM PrlNrc obj WHERE obj.codAsignatura = ?1");
        q.setParameter(1, codAsignatura);
        return q.getResultList();
}

    public List<PrlNrc> listarNrcAsignaturaPeriodo(OrgAsignatura codAsignatura, PrlPeriodoLectivo codPeriodo) {
        Query q = this.em.createQuery("SELECT obj FROM PrlNrc obj WHERE obj.codAsignatura = ?1 AND obj.prlPeriodoLectivo = ?2");
        q.setParameter(1, codAsignatura);
        q.setParameter(2, codPeriodo);
        return q.getResultList();
    }

    public List<PrlNrc> listarNrcPorPeriodo(String periodo) {
        List<PrlNrc> nrcs = this.em.createQuery("SELECT n FROM PrlNrc n WHERE n.prlPeriodoLectivo=?1", PrlNrc.class)
                .setParameter(1, periodo).getResultList();
        return nrcs;
    }

    
    public List<PrlNrc> listarNrcPeriodo(PrlPeriodoLectivo codPeriodo) {
        Query q = this.em.createQuery("SELECT obj FROM PrlNrc obj WHERE obj.prlNrcPK.codPeriodo = ?1");
        q.setParameter(1, codPeriodo.getCodPeriodo());
        return q.getResultList();
    }
    
    public List<PrlNrc> listarNRCPorNombre(String nrc){
        Query q =this.em.createQuery("SELECT obj FROM PrlNrc obj WHERE obj.codAsignatura.nombre LIKE :nomBus");
        q.setParameter("nomBus", "%" + nrc + "%");
        return q.getResultList();
    }
    
    public List<PrlNrc> listarNrcDocente(String codPeriodo, String codDocente){
        Query q = this.em.createQuery("SELECT obj FROM PrlNrc obj WHERE obj.prlNrcPK.codPeriodo = ?1 AND obj.codPersona= ?2");
        q.setParameter(1, codPeriodo);
        q.setParameter(2, codDocente);
        return q.getResultList();
    }
    
}
