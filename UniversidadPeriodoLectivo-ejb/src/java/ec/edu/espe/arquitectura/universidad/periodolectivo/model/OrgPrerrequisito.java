/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.universidad.periodolectivo.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author diego
 */
@Entity
@Table(name = "ORG_PRERREQUISITO")
public class OrgPrerrequisito implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_PRERREQUISITO", nullable = false)
    private Integer codPrerrequisito;

    @JoinColumn(name = "COD_MAT_MALLA", referencedColumnName = "COD_DETALLE_MALLA")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private OrgDetalleMalla codMatMalla;

    @JoinColumn(name = "COD_MAT_PRE", referencedColumnName = "COD_DETALLE_MALLA")
    @ManyToOne(fetch = FetchType.LAZY)
    private OrgDetalleMalla codMatPre;

    public OrgPrerrequisito() {
    }

    public OrgPrerrequisito(Integer codPrerrequisito) {
        this.codPrerrequisito = codPrerrequisito;
    }

    public Integer getCodPrerrequisito() {
        return codPrerrequisito;
    }

    public void setCodPrerrequisito(Integer codPrerrequisito) {
        this.codPrerrequisito = codPrerrequisito;
    }

    public OrgDetalleMalla getCodMatMalla() {
        return codMatMalla;
    }

    public void setCodMatMalla(OrgDetalleMalla codMatMalla) {
        this.codMatMalla = codMatMalla;
    }

    public OrgDetalleMalla getCodMatPre() {
        return codMatPre;
    }

    public void setCodMatPre(OrgDetalleMalla codMatPre) {
        this.codMatPre = codMatPre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codPrerrequisito != null ? codPrerrequisito.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrgPrerrequisito)) {
            return false;
        }
        OrgPrerrequisito other = (OrgPrerrequisito) object;
        if ((this.codPrerrequisito == null && other.codPrerrequisito != null) || (this.codPrerrequisito != null && !this.codPrerrequisito.equals(other.codPrerrequisito))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.arquitectura.universidad.periodolectivo.model.OrgPrerrequisito[ codPrerrequisito=" + codPrerrequisito + " ]";
    }
    
}
