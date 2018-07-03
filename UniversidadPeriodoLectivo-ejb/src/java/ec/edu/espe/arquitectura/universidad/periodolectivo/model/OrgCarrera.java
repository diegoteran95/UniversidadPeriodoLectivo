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
@Table(name = "ORG_CARRERA")
public class OrgCarrera implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "COD_CARRERA", nullable = false, length = 5)
    private String codCarrera;

    @Column(name = "DESCRIPCION", nullable = false, length = 50)
    private String descripcion;

    @Column(name = "MODALIDAD", nullable = false, length = 20)
    private String modalidad;

    @Column(name = "NIVEL", nullable = false, length = 20)
    private String nivel;
    @JoinColumn(name = "COD_DEPARTAMENTO", referencedColumnName = "COD_DEPARTAMENTO")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private OrgDepartamento codDepartamento;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codCarrera", fetch = FetchType.LAZY)
    private List<OrgMalla> orgMallaList;

    public OrgCarrera() {
    }

    public OrgCarrera(String codCarrera) {
        this.codCarrera = codCarrera;
    }

    public OrgCarrera(String codCarrera, String descripcion, String modalidad, String nivel) {
        this.codCarrera = codCarrera;
        this.descripcion = descripcion;
        this.modalidad = modalidad;
        this.nivel = nivel;
    }

    public String getCodCarrera() {
        return codCarrera;
    }

    public void setCodCarrera(String codCarrera) {
        this.codCarrera = codCarrera;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public OrgDepartamento getCodDepartamento() {
        return codDepartamento;
    }

    public void setCodDepartamento(OrgDepartamento codDepartamento) {
        this.codDepartamento = codDepartamento;
    }

    public List<OrgMalla> getOrgMallaList() {
        return orgMallaList;
    }

    public void setOrgMallaList(List<OrgMalla> orgMallaList) {
        this.orgMallaList = orgMallaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codCarrera != null ? codCarrera.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrgCarrera)) {
            return false;
        }
        OrgCarrera other = (OrgCarrera) object;
        if ((this.codCarrera == null && other.codCarrera != null) || (this.codCarrera != null && !this.codCarrera.equals(other.codCarrera))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.arquitectura.universidad.periodolectivo.model.OrgCarrera[ codCarrera=" + codCarrera + " ]";
    }
    
}
