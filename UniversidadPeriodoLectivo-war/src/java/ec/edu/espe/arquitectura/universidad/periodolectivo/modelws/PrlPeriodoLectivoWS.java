/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.universidad.periodolectivo.modelws;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author diego
 */
public class PrlPeriodoLectivoWS {

    private String codigo;
    private String semestre;
    private Date fehaInicio;
    private Date fechaFin;
    private BigDecimal costoCredito;
    private Integer componentesEvaluacion;
    private String estado;

    public PrlPeriodoLectivoWS() {

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public Date getFehaInicio() {
        return fehaInicio;
    }

    public void setFehaInicio(Date fehaInicio) {
        this.fehaInicio = fehaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public BigDecimal getCostoCredito() {
        return costoCredito;
    }

    public void setCostoCredito(BigDecimal costoCredito) {
        this.costoCredito = costoCredito;
    }

    public Integer getComponentesEvaluacion() {
        return componentesEvaluacion;
    }

    public void setComponentesEvaluacion(Integer componentesEvaluacion) {
        this.componentesEvaluacion = componentesEvaluacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
