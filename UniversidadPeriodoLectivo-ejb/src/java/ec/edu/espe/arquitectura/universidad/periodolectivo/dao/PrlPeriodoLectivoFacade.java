/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.universidad.periodolectivo.dao;

import ec.edu.espe.arquitectura.universidad.periodolectivo.model.PrlPeriodoLectivo;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author diego
 */
@Stateless
@LocalBean
public class PrlPeriodoLectivoFacade extends AbstractFacade<PrlPeriodoLectivo> {

    @PersistenceContext(unitName = "UniversidadPeriodoLectivo-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PrlPeriodoLectivoFacade() {
        super(PrlPeriodoLectivo.class);
    }
//    
//    public PrlPeriodoLectivo obtenerPeriodoPorId(String codPeriodo){
//        Query q = this.em.createQuery("SELECT obj FROM PrlPeriodoLectivo obj WHERE obj.codPeriodo = ?1");
//        q.setParameter(1, codPeriodo);
//        return q.getSingleResult();
//    }
    
}
