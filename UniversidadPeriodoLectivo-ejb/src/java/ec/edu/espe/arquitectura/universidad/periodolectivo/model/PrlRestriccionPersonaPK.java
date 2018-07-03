/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.universidad.periodolectivo.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author diego
 */
@Embeddable
public class PrlRestriccionPersonaPK implements Serializable {

    @Column(name = "COD_RESTRICCION", nullable = false, length = 3)
    private String codRestriccion;

    @Column(name = "COD_PERSONA", nullable = false, length = 20)
    private String codPersona;

    public PrlRestriccionPersonaPK() {
    }

    public PrlRestriccionPersonaPK(String codRestriccion, String codPersona) {
        this.codRestriccion = codRestriccion;
        this.codPersona = codPersona;
    }

    public String getCodRestriccion() {
        return codRestriccion;
    }

    public void setCodRestriccion(String codRestriccion) {
        this.codRestriccion = codRestriccion;
    }

    public String getCodPersona() {
        return codPersona;
    }

    public void setCodPersona(String codPersona) {
        this.codPersona = codPersona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codRestriccion != null ? codRestriccion.hashCode() : 0);
        hash += (codPersona != null ? codPersona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrlRestriccionPersonaPK)) {
            return false;
        }
        PrlRestriccionPersonaPK other = (PrlRestriccionPersonaPK) object;
        if ((this.codRestriccion == null && other.codRestriccion != null) || (this.codRestriccion != null && !this.codRestriccion.equals(other.codRestriccion))) {
            return false;
        }
        if ((this.codPersona == null && other.codPersona != null) || (this.codPersona != null && !this.codPersona.equals(other.codPersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.arquitectura.universidad.periodolectivo.model.PrlRestriccionPersonaPK[ codRestriccion=" + codRestriccion + ", codPersona=" + codPersona + " ]";
    }
    
}
