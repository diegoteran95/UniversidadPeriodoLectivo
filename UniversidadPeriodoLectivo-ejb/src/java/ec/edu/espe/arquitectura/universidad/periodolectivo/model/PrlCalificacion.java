/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.universidad.periodolectivo.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author diego
 */
@Entity
@Table(name = "PRL_CALIFICACION")
public class PrlCalificacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrlCalificacionPK prlCalificacionPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PUNTAJE")
    private BigDecimal puntaje;

    @JoinColumns({
        @JoinColumn(name = "COD_MATRICULA", referencedColumnName = "COD_MATRICULA", insertable = false, updatable = false)
        , @JoinColumn(name = "COD_NRC", referencedColumnName = "COD_NRC", insertable = false, updatable = false)
        , @JoinColumn(name = "COD_PERIODO", referencedColumnName = "COD_PERIODO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private PrlDetalleMatricula prlDetalleMatricula;

    public PrlCalificacion() {
    }

    public PrlCalificacion(PrlCalificacionPK prlCalificacionPK) {
        this.prlCalificacionPK = prlCalificacionPK;
    }

    public PrlCalificacion(String codMatricula, String codNrc, String codPeriodo, int secCalificacion) {
        this.prlCalificacionPK = new PrlCalificacionPK(codMatricula, codNrc, codPeriodo, secCalificacion);
    }

    public PrlCalificacionPK getPrlCalificacionPK() {
        return prlCalificacionPK;
    }

    public void setPrlCalificacionPK(PrlCalificacionPK prlCalificacionPK) {
        this.prlCalificacionPK = prlCalificacionPK;
    }

    public BigDecimal getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(BigDecimal puntaje) {
        this.puntaje = puntaje;
    }

    public PrlDetalleMatricula getPrlDetalleMatricula() {
        return prlDetalleMatricula;
    }

    public void setPrlDetalleMatricula(PrlDetalleMatricula prlDetalleMatricula) {
        this.prlDetalleMatricula = prlDetalleMatricula;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prlCalificacionPK != null ? prlCalificacionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrlCalificacion)) {
            return false;
        }
        PrlCalificacion other = (PrlCalificacion) object;
        if ((this.prlCalificacionPK == null && other.prlCalificacionPK != null) || (this.prlCalificacionPK != null && !this.prlCalificacionPK.equals(other.prlCalificacionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.arquitectura.universidad.periodolectivo.model.PrlCalificacion[ prlCalificacionPK=" + prlCalificacionPK + " ]";
    }
    
}
