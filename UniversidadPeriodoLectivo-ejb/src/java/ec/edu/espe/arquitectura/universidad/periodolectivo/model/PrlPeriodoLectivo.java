/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.universidad.periodolectivo.model;

import ec.edu.espe.arquitectura.universidad.periodolectivo.enums.PrlPeriodoLectivoEnum;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author diego
 */
@Entity
@Table(name = "PRL_PERIODO_LECTIVO")
public class PrlPeriodoLectivo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "COD_PERIODO", nullable = false, length = 6)
    private String codPeriodo;

    @Column(name = "SEMESTRE", nullable = false, length = 3)
    private String semestre;

    @Column(name = "FEHA_INICIO", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fehaInicio;

    @Column(name = "FECHA_FIN", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation

    @Column(name = "COSTO_CREDITO", nullable = false)
    private BigDecimal costoCredito;

    @Column(name = "COMPONENTES_EVALUACION", nullable = false)
    private int componentesEvaluacion;

    @Enumerated(EnumType.STRING)
    private PrlPeriodoLectivoEnum estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "prlPeriodoLectivo", fetch = FetchType.LAZY)
    private List<PrlNrc> prlNrcList;
    @OneToMany(mappedBy = "codPeriodo", fetch = FetchType.LAZY)
    private List<PrlMatricula> prlMatriculaList;

    public PrlPeriodoLectivo() {
    }

    public PrlPeriodoLectivo(String codPeriodo) {
        this.codPeriodo = codPeriodo;
    }

    public PrlPeriodoLectivo(String codPeriodo, String semestre, Date fehaInicio, Date fechaFin, BigDecimal costoCredito, int componentesEvaluacion, PrlPeriodoLectivoEnum estado) {
        this.codPeriodo = codPeriodo;
        this.semestre = semestre;
        this.fehaInicio = fehaInicio;
        this.fechaFin = fechaFin;
        this.costoCredito = costoCredito;
        this.componentesEvaluacion = componentesEvaluacion;
        this.estado = estado;
    }

    public String getCodPeriodo() {
        return codPeriodo;
    }

    public void setCodPeriodo(String codPeriodo) {
        this.codPeriodo = codPeriodo;
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

    public int getComponentesEvaluacion() {
        return componentesEvaluacion;
    }

    public void setComponentesEvaluacion(int componentesEvaluacion) {
        this.componentesEvaluacion = componentesEvaluacion;
    }

    public PrlPeriodoLectivoEnum getEstado() {
        return estado;
    }

    public void setEstado(PrlPeriodoLectivoEnum estado) {
        this.estado = estado;
    }

    public List<PrlNrc> getPrlNrcList() {
        return prlNrcList;
    }

    public void setPrlNrcList(List<PrlNrc> prlNrcList) {
        this.prlNrcList = prlNrcList;
    }

    public List<PrlMatricula> getPrlMatriculaList() {
        return prlMatriculaList;
    }

    public void setPrlMatriculaList(List<PrlMatricula> prlMatriculaList) {
        this.prlMatriculaList = prlMatriculaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codPeriodo != null ? codPeriodo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrlPeriodoLectivo)) {
            return false;
        }
        PrlPeriodoLectivo other = (PrlPeriodoLectivo) object;
        if ((this.codPeriodo == null && other.codPeriodo != null) || (this.codPeriodo != null && !this.codPeriodo.equals(other.codPeriodo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.arquitectura.universidad.periodolectivo.model.PrlPeriodoLectivo[ codPeriodo=" + codPeriodo + " ]";
    }
    
}
