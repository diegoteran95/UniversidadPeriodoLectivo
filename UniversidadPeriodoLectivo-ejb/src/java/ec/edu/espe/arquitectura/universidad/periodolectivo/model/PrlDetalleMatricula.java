/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.universidad.periodolectivo.model;

import ec.edu.espe.arquitectura.universidad.periodolectivo.enums.PrlDetalleMatriculaEnum;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author diego
 */
@Entity
@Table(name = "PRL_DETALLE_MATRICULA")
public class PrlDetalleMatricula implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrlDetalleMatriculaPK prlDetalleMatriculaPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "COSTO_NRC")
    private BigDecimal costoNrc;

    @Enumerated(EnumType.STRING)
    private PrlDetalleMatriculaEnum aprobacionNrc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "prlDetalleMatricula", fetch = FetchType.LAZY)
    private List<PrlCalificacion> prlCalificacionList;

    @JoinColumn(name = "COD_MATRICULA", referencedColumnName = "COD_MATRICULA", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private PrlMatricula prlMatricula;

    @JoinColumns({
        @JoinColumn(name = "COD_NRC", referencedColumnName = "COD_NRC", insertable = false, updatable = false)
        , @JoinColumn(name = "COD_PERIODO", referencedColumnName = "COD_PERIODO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private PrlNrc prlNrc;

    public PrlDetalleMatricula() {
    }

    public PrlDetalleMatricula(PrlDetalleMatriculaPK prlDetalleMatriculaPK) {
        this.prlDetalleMatriculaPK = prlDetalleMatriculaPK;
    }

    public PrlDetalleMatricula(PrlDetalleMatriculaPK prlDetalleMatriculaPK, PrlDetalleMatriculaEnum aprobacionNrc) {
        this.prlDetalleMatriculaPK = prlDetalleMatriculaPK;
        this.aprobacionNrc = aprobacionNrc;
    }

    public PrlDetalleMatricula(String codMatricula, String codNrc, String codPeriodo) {
        this.prlDetalleMatriculaPK = new PrlDetalleMatriculaPK(codMatricula, codNrc, codPeriodo);
    }

    public PrlDetalleMatriculaPK getPrlDetalleMatriculaPK() {
        return prlDetalleMatriculaPK;
    }

    public void setPrlDetalleMatriculaPK(PrlDetalleMatriculaPK prlDetalleMatriculaPK) {
        this.prlDetalleMatriculaPK = prlDetalleMatriculaPK;
    }

    public BigDecimal getCostoNrc() {
        return costoNrc;
    }

    public void setCostoNrc(BigDecimal costoNrc) {
        this.costoNrc = costoNrc;
    }

    public PrlDetalleMatriculaEnum getAprobacionNrc() {
        return aprobacionNrc;
    }

    public void setAprobacionNrc(PrlDetalleMatriculaEnum aprobacionNrc) {
        this.aprobacionNrc = aprobacionNrc;
    }

    public List<PrlCalificacion> getPrlCalificacionList() {
        return prlCalificacionList;
    }

    public void setPrlCalificacionList(List<PrlCalificacion> prlCalificacionList) {
        this.prlCalificacionList = prlCalificacionList;
    }

    public PrlMatricula getPrlMatricula() {
        return prlMatricula;
    }

    public void setPrlMatricula(PrlMatricula prlMatricula) {
        this.prlMatricula = prlMatricula;
    }

    public PrlNrc getPrlNrc() {
        return prlNrc;
    }

    public void setPrlNrc(PrlNrc prlNrc) {
        this.prlNrc = prlNrc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prlDetalleMatriculaPK != null ? prlDetalleMatriculaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrlDetalleMatricula)) {
            return false;
        }
        PrlDetalleMatricula other = (PrlDetalleMatricula) object;
        if ((this.prlDetalleMatriculaPK == null && other.prlDetalleMatriculaPK != null) || (this.prlDetalleMatriculaPK != null && !this.prlDetalleMatriculaPK.equals(other.prlDetalleMatriculaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.arquitectura.universidad.periodolectivo.model.PrlDetalleMatricula[ prlDetalleMatriculaPK=" + prlDetalleMatriculaPK + " ]";
    }
    
}
