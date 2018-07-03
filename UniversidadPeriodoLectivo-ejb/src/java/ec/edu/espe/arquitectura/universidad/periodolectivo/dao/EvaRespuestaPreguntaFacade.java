/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.universidad.periodolectivo.dao;

import ec.edu.espe.arquitectura.universidad.periodolectivo.model.EvaRespuestaPregunta;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author diego
 */
@Stateless
public class EvaRespuestaPreguntaFacade extends AbstractFacade<EvaRespuestaPregunta> {

    @PersistenceContext(unitName = "UniversidadPeriodoLectivo-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EvaRespuestaPreguntaFacade() {
        super(EvaRespuestaPregunta.class);
    }
    
}
