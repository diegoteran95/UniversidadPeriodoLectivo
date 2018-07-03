/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.universidad.periodolectivo.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author diego
 */
@Entity
@Table(name = "ORG_MALLA")
public class OrgMalla implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "COD_MALLA", nullable = false, length = 6)
    private String codMalla;

    @Column(name = "FECHA_ELABORACION")
    @Temporal(TemporalType.DATE)
    private Date fechaElaboracion;

    @Column(name = "FECHA_VIGENCIA")
    @Temporal(TemporalType.DATE)
    private Date fechaVigencia;

    @JoinColumn(name = "COD_CARRERA", referencedColumnName = "COD_CARRERA")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private OrgCarrera codCarrera;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codMalla", fetch = FetchType.LAZY)
    private List<OrgDetalleMalla> orgDetalleMallaList;

    public OrgMalla() {
    }

    public OrgMalla(String codMalla) {
        this.codMalla = codMalla;
    }

    public String getCodMalla() {
        return codMalla;
    }

    public void setCodMalla(String codMalla) {
        this.codMalla = codMalla;
    }

    public Date getFechaElaboracion() {
        return fechaElaboracion;
    }

    public void setFechaElaboracion(Date fechaElaboracion) {
        this.fechaElaboracion = fechaElaboracion;
    }

    public Date getFechaVigencia() {
        return fechaVigencia;
    }

    public void setFechaVigencia(Date fechaVigencia) {
        this.fechaVigencia = fechaVigencia;
    }

    public OrgCarrera getCodCarrera() {
        return codCarrera;
    }

    public void setCodCarrera(OrgCarrera codCarrera) {
        this.codCarrera = codCarrera;
    }

    public List<OrgDetalleMalla> getOrgDetalleMallaList() {
        return orgDetalleMallaList;
    }

    public void setOrgDetalleMallaList(List<OrgDetalleMalla> orgDetalleMallaList) {
        this.orgDetalleMallaList = orgDetalleMallaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codMalla != null ? codMalla.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrgMalla)) {
            return false;
        }
        OrgMalla other = (OrgMalla) object;
        if ((this.codMalla == null && other.codMalla != null) || (this.codMalla != null && !this.codMalla.equals(other.codMalla))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.arquitectura.universidad.periodolectivo.model.OrgMalla[ codMalla=" + codMalla + " ]";
    }
    
}
