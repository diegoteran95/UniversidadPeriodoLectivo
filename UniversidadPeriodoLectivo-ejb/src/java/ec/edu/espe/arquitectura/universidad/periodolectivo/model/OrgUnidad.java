/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.universidad.periodolectivo.model;

import java.io.Serializable;
import java.util.List;
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
@Table(name = "ORG_UNIDAD")
public class OrgUnidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "COD_UNIDAD", nullable = false, length = 5)
    private String codUnidad;

    @Column(name = "NOMBRE", nullable = false, length = 30)
    private String nombre;

    @Column(name = "DESCRIPCION", nullable = false, length = 50)
    private String descripcion;

    @OneToMany(mappedBy = "codUnidad", fetch = FetchType.LAZY)
    private List<OrgDepartamento> orgDepartamentoList;

    public OrgUnidad() {
    }

    public OrgUnidad(String codUnidad) {
        this.codUnidad = codUnidad;
    }

    public OrgUnidad(String codUnidad, String nombre, String descripcion) {
        this.codUnidad = codUnidad;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getCodUnidad() {
        return codUnidad;
    }

    public void setCodUnidad(String codUnidad) {
        this.codUnidad = codUnidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<OrgDepartamento> getOrgDepartamentoList() {
        return orgDepartamentoList;
    }

    public void setOrgDepartamentoList(List<OrgDepartamento> orgDepartamentoList) {
        this.orgDepartamentoList = orgDepartamentoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codUnidad != null ? codUnidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrgUnidad)) {
            return false;
        }
        OrgUnidad other = (OrgUnidad) object;
        if ((this.codUnidad == null && other.codUnidad != null) || (this.codUnidad != null && !this.codUnidad.equals(other.codUnidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.arquitectura.universidad.periodolectivo.model.OrgUnidad[ codUnidad=" + codUnidad + " ]";
    }
    
}
