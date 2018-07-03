/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.universidad.periodolectivo.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author diego
 */
@Entity
@Table(name = "EVA_EVALUACION")
@NamedQueries({
    @NamedQuery(name = "EvaEvaluacion.findAll", query = "SELECT e FROM EvaEvaluacion e")})
public class EvaEvaluacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_EVALUACION")
    private String codEvaluacion;
    @Basic(optional = false)
    @Lob
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "evaEvaluacion", fetch = FetchType.LAZY)
    private List<EvaResultadoEvaluacion> evaResultadoEvaluacionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "evaEvaluacion", fetch = FetchType.LAZY)
    private List<EvaDetalleEvaluacon> evaDetalleEvaluaconList;

    public EvaEvaluacion() {
    }

    public EvaEvaluacion(String codEvaluacion) {
        this.codEvaluacion = codEvaluacion;
    }

    public EvaEvaluacion(String codEvaluacion, String descripcion) {
        this.codEvaluacion = codEvaluacion;
        this.descripcion = descripcion;
    }

    public String getCodEvaluacion() {
        return codEvaluacion;
    }

    public void setCodEvaluacion(String codEvaluacion) {
        this.codEvaluacion = codEvaluacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<EvaResultadoEvaluacion> getEvaResultadoEvaluacionList() {
        return evaResultadoEvaluacionList;
    }

    public void setEvaResultadoEvaluacionList(List<EvaResultadoEvaluacion> evaResultadoEvaluacionList) {
        this.evaResultadoEvaluacionList = evaResultadoEvaluacionList;
    }

    public List<EvaDetalleEvaluacon> getEvaDetalleEvaluaconList() {
        return evaDetalleEvaluaconList;
    }

    public void setEvaDetalleEvaluaconList(List<EvaDetalleEvaluacon> evaDetalleEvaluaconList) {
        this.evaDetalleEvaluaconList = evaDetalleEvaluaconList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codEvaluacion != null ? codEvaluacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EvaEvaluacion)) {
            return false;
        }
        EvaEvaluacion other = (EvaEvaluacion) object;
        if ((this.codEvaluacion == null && other.codEvaluacion != null) || (this.codEvaluacion != null && !this.codEvaluacion.equals(other.codEvaluacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.arquitectura.universidad.periodolectivo.model.EvaEvaluacion[ codEvaluacion=" + codEvaluacion + " ]";
    }
    
}
