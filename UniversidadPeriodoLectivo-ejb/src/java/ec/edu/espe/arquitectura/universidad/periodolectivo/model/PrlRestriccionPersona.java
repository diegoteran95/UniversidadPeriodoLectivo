/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.universidad.periodolectivo.model;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author diego
 */
@Entity
@Table(name = "PRL_RESTRICCION_PERSONA")
public class PrlRestriccionPersona implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrlRestriccionPersonaPK prlRestriccionPersonaPK;
    @JoinColumn(name = "COD_RESTRICCION", referencedColumnName = "COD_RESTRICCION", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private PrlRestriccion prlRestriccion;

    public PrlRestriccionPersona() {
    }

    public PrlRestriccionPersona(PrlRestriccionPersonaPK prlRestriccionPersonaPK) {
        this.prlRestriccionPersonaPK = prlRestriccionPersonaPK;
    }

    public PrlRestriccionPersona(String codRestriccion, String codPersona) {
        this.prlRestriccionPersonaPK = new PrlRestriccionPersonaPK(codRestriccion, codPersona);
    }

    public PrlRestriccionPersonaPK getPrlRestriccionPersonaPK() {
        return prlRestriccionPersonaPK;
    }

    public void setPrlRestriccionPersonaPK(PrlRestriccionPersonaPK prlRestriccionPersonaPK) {
        this.prlRestriccionPersonaPK = prlRestriccionPersonaPK;
    }

    public PrlRestriccion getPrlRestriccion() {
        return prlRestriccion;
    }

    public void setPrlRestriccion(PrlRestriccion prlRestriccion) {
        this.prlRestriccion = prlRestriccion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prlRestriccionPersonaPK != null ? prlRestriccionPersonaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrlRestriccionPersona)) {
            return false;
        }
        PrlRestriccionPersona other = (PrlRestriccionPersona) object;
        if ((this.prlRestriccionPersonaPK == null && other.prlRestriccionPersonaPK != null) || (this.prlRestriccionPersonaPK != null && !this.prlRestriccionPersonaPK.equals(other.prlRestriccionPersonaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.arquitectura.universidad.periodolectivo.model.PrlRestriccionPersona[ prlRestriccionPersonaPK=" + prlRestriccionPersonaPK + " ]";
    }
    
}
