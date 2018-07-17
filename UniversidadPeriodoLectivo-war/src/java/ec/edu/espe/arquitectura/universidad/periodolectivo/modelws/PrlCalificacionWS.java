/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.universidad.periodolectivo.modelws;

import java.math.BigDecimal;

/**
 *
 * @author diego
 */
public class PrlCalificacionWS {

    private String codMatricula;
    private String codNrc;
    private String codPeriodo;
    private Integer secCalificacion;
    private BigDecimal puntaje;
    private String codPersona;

    public PrlCalificacionWS() {
    }

    public String getCodPersona() {
        return codPersona;
    }

    public void setCodPersona(String codPersona) {
        this.codPersona = codPersona;
    }
    
    

    public String getCodMatricula() {
        return codMatricula;
    }

    public void setCodMatricula(String codMatricula) {
        this.codMatricula = codMatricula;
    }

    public String getCodNrc() {
        return codNrc;
    }

    public void setCodNrc(String codNrc) {
        this.codNrc = codNrc;
    }

    public String getCodPeriodo() {
        return codPeriodo;
    }

    public void setCodPeriodo(String codPeriodo) {
        this.codPeriodo = codPeriodo;
    }

    public Integer getSecCalificacion() {
        return secCalificacion;
    }

    public void setSecCalificacion(Integer secCalificacion) {
        this.secCalificacion = secCalificacion;
    }

    public BigDecimal getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(BigDecimal puntaje) {
        this.puntaje = puntaje;
    }
    
    
}
