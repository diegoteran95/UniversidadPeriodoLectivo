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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author diego
 */
@Entity
@Table(name = "EFH_UBICACION")
public class EfhUbicacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "COD_UBICACION", nullable = false, length = 3)
    private String codUbicacion;

    @Column(name = "DESCRIPCION", nullable = false, length = 50)
    private String descripcion;

    @OneToMany(mappedBy = "codUbicacionPadre", fetch = FetchType.LAZY)
    private List<EfhUbicacion> efhUbicacionList;

    @JoinColumn(name = "COD_UBICACION_PADRE", referencedColumnName = "COD_UBICACION")
    @ManyToOne(fetch = FetchType.LAZY)
    private EfhUbicacion codUbicacionPadre;

    @OneToMany(mappedBy = "codUbicacion", fetch = FetchType.LAZY)
    private List<EfhHorario> efhHorarioList;

    public EfhUbicacion() {
    }

    public EfhUbicacion(String codUbicacion) {
        this.codUbicacion = codUbicacion;
    }

    public EfhUbicacion(String codUbicacion, String descripcion) {
        this.codUbicacion = codUbicacion;
        this.descripcion = descripcion;
    }

    public String getCodUbicacion() {
        return codUbicacion;
    }

    public void setCodUbicacion(String codUbicacion) {
        this.codUbicacion = codUbicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<EfhUbicacion> getEfhUbicacionList() {
        return efhUbicacionList;
    }

    public void setEfhUbicacionList(List<EfhUbicacion> efhUbicacionList) {
        this.efhUbicacionList = efhUbicacionList;
    }

    public EfhUbicacion getCodUbicacionPadre() {
        return codUbicacionPadre;
    }

    public void setCodUbicacionPadre(EfhUbicacion codUbicacionPadre) {
        this.codUbicacionPadre = codUbicacionPadre;
    }

    public List<EfhHorario> getEfhHorarioList() {
        return efhHorarioList;
    }

    public void setEfhHorarioList(List<EfhHorario> efhHorarioList) {
        this.efhHorarioList = efhHorarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codUbicacion != null ? codUbicacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EfhUbicacion)) {
            return false;
        }
        EfhUbicacion other = (EfhUbicacion) object;
        if ((this.codUbicacion == null && other.codUbicacion != null) || (this.codUbicacion != null && !this.codUbicacion.equals(other.codUbicacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.arquitectura.universidad.periodolectivo.model.EfhUbicacion[ codUbicacion=" + codUbicacion + " ]";
    }
    
}
