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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author diego
 */
@Entity
@Table(name = "ORG_DETALLE_MALLA")
public class OrgDetalleMalla implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_DETALLE_MALLA", nullable = false)
    private Integer codDetalleMalla;

    @Column(name = "NIVEL")
    private Short nivel;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codMatMalla", fetch = FetchType.LAZY)
    private List<OrgPrerrequisito> orgPrerrequisitoList;
    @OneToMany(mappedBy = "codMatPre", fetch = FetchType.LAZY)
    private List<OrgPrerrequisito> orgPrerrequisitoList1;
    @JoinColumn(name = "COD_ASIGNATURA", referencedColumnName = "COD_ASIGNATURA")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private OrgAsignatura codAsignatura;
    @JoinColumn(name = "COD_MALLA", referencedColumnName = "COD_MALLA")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private OrgMalla codMalla;

    public OrgDetalleMalla() {
    }

    public OrgDetalleMalla(Integer codDetalleMalla) {
        this.codDetalleMalla = codDetalleMalla;
    }

    public Integer getCodDetalleMalla() {
        return codDetalleMalla;
    }

    public void setCodDetalleMalla(Integer codDetalleMalla) {
        this.codDetalleMalla = codDetalleMalla;
    }

    public Short getNivel() {
        return nivel;
    }

    public void setNivel(Short nivel) {
        this.nivel = nivel;
    }

    public List<OrgPrerrequisito> getOrgPrerrequisitoList() {
        return orgPrerrequisitoList;
    }

    public void setOrgPrerrequisitoList(List<OrgPrerrequisito> orgPrerrequisitoList) {
        this.orgPrerrequisitoList = orgPrerrequisitoList;
    }

    public List<OrgPrerrequisito> getOrgPrerrequisitoList1() {
        return orgPrerrequisitoList1;
    }

    public void setOrgPrerrequisitoList1(List<OrgPrerrequisito> orgPrerrequisitoList1) {
        this.orgPrerrequisitoList1 = orgPrerrequisitoList1;
    }

    public OrgAsignatura getCodAsignatura() {
        return codAsignatura;
    }

    public void setCodAsignatura(OrgAsignatura codAsignatura) {
        this.codAsignatura = codAsignatura;
    }

    public OrgMalla getCodMalla() {
        return codMalla;
    }

    public void setCodMalla(OrgMalla codMalla) {
        this.codMalla = codMalla;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codDetalleMalla != null ? codDetalleMalla.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrgDetalleMalla)) {
            return false;
        }
        OrgDetalleMalla other = (OrgDetalleMalla) object;
        if ((this.codDetalleMalla == null && other.codDetalleMalla != null) || (this.codDetalleMalla != null && !this.codDetalleMalla.equals(other.codDetalleMalla))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.arquitectura.universidad.periodolectivo.model.OrgDetalleMalla[ codDetalleMalla=" + codDetalleMalla + " ]";
    }
    
}
