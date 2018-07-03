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
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author diego
 */
@Entity
@Table(name = "PRL_RESTRICCION")
public class PrlRestriccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "COD_RESTRICCION", nullable = false, length = 3)
    private String codRestriccion;

    @Column(name = "DESCRIPCION", nullable = false, length = 50)
    private String descripcion;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "prlRestriccion", fetch = FetchType.LAZY)
    private List<PrlRestriccionPersona> prlRestriccionPersonaList;

    public PrlRestriccion() {
    }

    public PrlRestriccion(String codRestriccion) {
        this.codRestriccion = codRestriccion;
    }

    public PrlRestriccion(String codRestriccion, String descripcion) {
        this.codRestriccion = codRestriccion;
        this.descripcion = descripcion;
    }

    public String getCodRestriccion() {
        return codRestriccion;
    }

    public void setCodRestriccion(String codRestriccion) {
        this.codRestriccion = codRestriccion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<PrlRestriccionPersona> getPrlRestriccionPersonaList() {
        return prlRestriccionPersonaList;
    }

    public void setPrlRestriccionPersonaList(List<PrlRestriccionPersona> prlRestriccionPersonaList) {
        this.prlRestriccionPersonaList = prlRestriccionPersonaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codRestriccion != null ? codRestriccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrlRestriccion)) {
            return false;
        }
        PrlRestriccion other = (PrlRestriccion) object;
        if ((this.codRestriccion == null && other.codRestriccion != null) || (this.codRestriccion != null && !this.codRestriccion.equals(other.codRestriccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.arquitectura.universidad.periodolectivo.model.PrlRestriccion[ codRestriccion=" + codRestriccion + " ]";
    }
    
}
