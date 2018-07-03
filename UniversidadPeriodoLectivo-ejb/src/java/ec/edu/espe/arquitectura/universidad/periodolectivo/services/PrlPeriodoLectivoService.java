/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.universidad.periodolectivo.services;

import ec.edu.espe.arquitectura.universidad.periodolectivo.dao.PrlPeriodoLectivoFacade;
import ec.edu.espe.arquitectura.universidad.periodolectivo.model.PrlPeriodoLectivo;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author diego
 */
@Stateless
@LocalBean
public class PrlPeriodoLectivoService {

    @EJB
    private PrlPeriodoLectivoFacade periodoFacade;
    
    public List<PrlPeriodoLectivo> listarPeriodos(){
        return periodoFacade.findAll();
    }
    
    public PrlPeriodoLectivo buscarPeriodoPorId(String codPeriodo){
        return periodoFacade.find(codPeriodo);
    }
}
