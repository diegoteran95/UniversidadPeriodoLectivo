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
public class PrlDetalleMatriculaWS {
    private String codMatricula;
    private String codPeriodo;
    private String codNrc;
    private BigDecimal costoNrc;
    private String aprobacionNrc;

    public PrlDetalleMatriculaWS() {
    }

    public String getCodMatricula() {
        return codMatricula;
    }

    public void setCodMatricula(String codMatricula) {
        this.codMatricula = codMatricula;
    }

    public String getCodPeriodo() {
        return codPeriodo;
    }

    public void setCodPeriodo(String codPeriodo) {
        this.codPeriodo = codPeriodo;
    }

    public String getCodNrc() {
        return codNrc;
    }

    public void setCodNrc(String codNrc) {
        this.codNrc = codNrc;
    }

    public BigDecimal getCostoNrc() {
        return costoNrc;
    }

    public void setCostoNrc(BigDecimal costoNrc) {
        this.costoNrc = costoNrc;
    }

    public String getAprobacionNrc() {
        return aprobacionNrc;
    }

    public void setAprobacionNrc(String aprobacionNrc) {
        this.aprobacionNrc = aprobacionNrc;
    }
    
    
}
