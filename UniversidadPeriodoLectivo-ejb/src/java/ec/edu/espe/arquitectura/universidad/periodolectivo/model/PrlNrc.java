/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.universidad.periodolectivo.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author diego
 */
@Entity
@Table(name = "PRL_NRC")
public class PrlNrc implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrlNrcPK prlNrcPK;

    @Column(name = "COD_PERSONA", nullable = false, length = 20)
    private String codPersona;
    
    @Column(name = "COD_ASIGNATURA", nullable=false,length = 5)
    private String codAsignatura;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "prlNrc", fetch = FetchType.LAZY)
    private List<PrlDetalleMatricula> prlDetalleMatriculaList;
    @JoinColumn(name = "COD_PERIODO", referencedColumnName = "COD_PERIODO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private PrlPeriodoLectivo prlPeriodoLectivo;

    public PrlNrc() {
    }

    public PrlNrc(PrlNrcPK prlNrcPK) {
        this.prlNrcPK = prlNrcPK;
    }

    public PrlNrc(PrlNrcPK prlNrcPK, String codAsignatura) {
        this.prlNrcPK = prlNrcPK;
        this.codAsignatura = codAsignatura;
    }

    public PrlNrc(String codNrc, String codPeriodo) {
        this.prlNrcPK = new PrlNrcPK(codNrc, codPeriodo);
    }

    public PrlNrcPK getPrlNrcPK() {
        return prlNrcPK;
    }

    public void setPrlNrcPK(PrlNrcPK prlNrcPK) {
        this.prlNrcPK = prlNrcPK;
    }

    public String getCodPersona() {
        return codPersona;
    }

    public void setCodPersona(String codPersona) {
        this.codPersona = codPersona;
    }

    public String getCodAsignatura() {
        return codAsignatura;
    }

    public void setCodAsignatura(String codAsignatura) {
        this.codAsignatura = codAsignatura;
    }

    public List<PrlDetalleMatricula> getPrlDetalleMatriculaList() {
        return prlDetalleMatriculaList;
    }

    public void setPrlDetalleMatriculaList(List<PrlDetalleMatricula> prlDetalleMatriculaList) {
        this.prlDetalleMatriculaList = prlDetalleMatriculaList;
    }

    public PrlPeriodoLectivo getPrlPeriodoLectivo() {
        return prlPeriodoLectivo;
    }

    public void setPrlPeriodoLectivo(PrlPeriodoLectivo prlPeriodoLectivo) {
        this.prlPeriodoLectivo = prlPeriodoLectivo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prlNrcPK != null ? prlNrcPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrlNrc)) {
            return false;
        }
        PrlNrc other = (PrlNrc) object;
        if ((this.prlNrcPK == null && other.prlNrcPK != null) || (this.prlNrcPK != null && !this.prlNrcPK.equals(other.prlNrcPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.arquitectura.universidad.periodolectivo.model.PrlNrc[ prlNrcPK=" + prlNrcPK + " ]";
    }
    
}
