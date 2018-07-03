/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.universidad.periodolectivo.model;

import ec.edu.espe.arquitectura.universidad.periodolectivo.enums.OrgAsignaturaEnum;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
@Table(name = "ORG_ASIGNATURA")
public class OrgAsignatura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "COD_ASIGNATURA", nullable = false, length = 5)
    private String codAsignatura;

    @Column(name = "NOMBRE", nullable = false, length = 30)
    private String nombre;

    @Column(name = "DESCRIPCION", nullable = false, length = 50)
    private String descripcion;

    @Column(name = "NUM_CREDITOS", nullable = false)
    private short numCreditos;

    @Enumerated(EnumType.STRING)
    private OrgAsignaturaEnum estado;

    @JoinColumn(name = "COD_DEPARTAMENTO", referencedColumnName = "COD_DEPARTAMENTO")
    @ManyToOne(fetch = FetchType.LAZY)
    private OrgDepartamento codDepartamento;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codAsignatura", fetch = FetchType.LAZY)
    private List<PrlNrc> prlNrcList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codAsignatura", fetch = FetchType.LAZY)
    private List<OrgDetalleMalla> orgDetalleMallaList;

    public OrgAsignatura() {
    }

    public OrgAsignatura(String codAsignatura) {
        this.codAsignatura = codAsignatura;
    }

    public OrgAsignatura(String codAsignatura, String nombre, String descripcion, short numCreditos) {
        this.codAsignatura = codAsignatura;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numCreditos = numCreditos;
    }

    public String getCodAsignatura() {
        return codAsignatura;
    }

    public void setCodAsignatura(String codAsignatura) {
        this.codAsignatura = codAsignatura;
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

    public short getNumCreditos() {
        return numCreditos;
    }

    public void setNumCreditos(short numCreditos) {
        this.numCreditos = numCreditos;
    }

    public OrgAsignaturaEnum getEstado() {
        return estado;
    }

    public void setEstado(OrgAsignaturaEnum estado) {
        this.estado = estado;
    }

    public OrgDepartamento getCodDepartamento() {
        return codDepartamento;
    }

    public void setCodDepartamento(OrgDepartamento codDepartamento) {
        this.codDepartamento = codDepartamento;
    }

    public List<PrlNrc> getPrlNrcList() {
        return prlNrcList;
    }

    public void setPrlNrcList(List<PrlNrc> prlNrcList) {
        this.prlNrcList = prlNrcList;
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
        hash += (codAsignatura != null ? codAsignatura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrgAsignatura)) {
            return false;
        }
        OrgAsignatura other = (OrgAsignatura) object;
        if ((this.codAsignatura == null && other.codAsignatura != null) || (this.codAsignatura != null && !this.codAsignatura.equals(other.codAsignatura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.arquitectura.universidad.periodolectivo.model.OrgAsignatura[ codAsignatura=" + codAsignatura + " ]";
    }
    
}
