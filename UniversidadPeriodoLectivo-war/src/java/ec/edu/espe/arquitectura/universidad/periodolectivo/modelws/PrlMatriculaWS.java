/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.universidad.periodolectivo.modelws;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author diego
 */
public class PrlMatriculaWS {
    private String codMatricula;
    private String codPeriodo;
    private String codPersona;
    private String codNrc;
    private BigDecimal promedio;
    private BigDecimal costoMatricula;
    private String pagado;
    private List<PrlDetalleMatriculaWS> detalleMatricula;

    public PrlMatriculaWS() {
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

    public String getCodPersona() {
        return codPersona;
    }

    public void setCodPersona(String codPersona) {
        this.codPersona = codPersona;
    }

    public BigDecimal getPromedio() {
        return promedio;
    }

    public void setPromedio(BigDecimal promedio) {
        this.promedio = promedio;
    }

    public BigDecimal getCostoMatricula() {
        return costoMatricula;
    }

    public void setCostoMatricula(BigDecimal costoMatricula) {
        this.costoMatricula = costoMatricula;
    }

    public String getPagado() {
        return pagado;
    }

    public void setPagado(String pagado) {
        this.pagado = pagado;
    }

    public String getCodNrc() {
        return codNrc;
    }

    public void setCodNrc(String codNrc) {
        this.codNrc = codNrc;
    }

    public List<PrlDetalleMatriculaWS> getDetalleMatricula() {
        return detalleMatricula;
    }

    public void setDetalleMatricula(List<PrlDetalleMatriculaWS> detalleMatricula) {
        this.detalleMatricula = detalleMatricula;
    }
    
    
}
