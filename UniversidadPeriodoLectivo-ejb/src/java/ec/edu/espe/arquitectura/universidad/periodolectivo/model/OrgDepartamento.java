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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author diego
 */
@Entity
@Table(name = "ORG_DEPARTAMENTO")
public class OrgDepartamento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "COD_DEPARTAMENTO", nullable = false, length = 5)
    private String codDepartamento;

    @Column(name = "DESCRIPCION", nullable = false, length = 50)
    private String descripcion;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codDepartamento", fetch = FetchType.LAZY)
    private List<OrgCarrera> orgCarreraList;
    @OneToMany(mappedBy = "codDepartamento", fetch = FetchType.LAZY)
    private List<OrgAsignatura> orgAsignaturaList;
    @JoinColumn(name = "COD_UNIDAD", referencedColumnName = "COD_UNIDAD")
    @ManyToOne(fetch = FetchType.LAZY)
    private OrgUnidad codUnidad;

    public OrgDepartamento() {
    }

    public OrgDepartamento(String codDepartamento) {
        this.codDepartamento = codDepartamento;
    }

    public OrgDepartamento(String codDepartamento, String descripcion) {
        this.codDepartamento = codDepartamento;
        this.descripcion = descripcion;
    }

    public String getCodDepartamento() {
        return codDepartamento;
    }

    public void setCodDepartamento(String codDepartamento) {
        this.codDepartamento = codDepartamento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<OrgCarrera> getOrgCarreraList() {
        return orgCarreraList;
    }

    public void setOrgCarreraList(List<OrgCarrera> orgCarreraList) {
        this.orgCarreraList = orgCarreraList;
    }

    public List<OrgAsignatura> getOrgAsignaturaList() {
        return orgAsignaturaList;
    }

    public void setOrgAsignaturaList(List<OrgAsignatura> orgAsignaturaList) {
        this.orgAsignaturaList = orgAsignaturaList;
    }

    public OrgUnidad getCodUnidad() {
        return codUnidad;
    }

    public void setCodUnidad(OrgUnidad codUnidad) {
        this.codUnidad = codUnidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codDepartamento != null ? codDepartamento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrgDepartamento)) {
            return false;
        }
        OrgDepartamento other = (OrgDepartamento) object;
        if ((this.codDepartamento == null && other.codDepartamento != null) || (this.codDepartamento != null && !this.codDepartamento.equals(other.codDepartamento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.arquitectura.universidad.periodolectivo.model.OrgDepartamento[ codDepartamento=" + codDepartamento + " ]";
    }
    
}
