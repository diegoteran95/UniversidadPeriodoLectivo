/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.universidad.periodolectivo.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author diego
 */
@Entity
@Table(name = "EVA_CUESTIONARIO")
@NamedQueries({
    @NamedQuery(name = "EvaCuestionario.findAll", query = "SELECT e FROM EvaCuestionario e")})
public class EvaCuestionario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_CUESTIONARIO")
    private String codCuestionario;
    @Basic(optional = false)
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;
    @Basic(optional = false)
    @Column(name = "ESTADO")
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "evaCuestionario", fetch = FetchType.LAZY)
    private List<EvaDetalleEvaluacon> evaDetalleEvaluaconList;
    @OneToMany(mappedBy = "codCuestionario", fetch = FetchType.LAZY)
    private List<EvaPregunta> evaPreguntaList;

    public EvaCuestionario() {
    }

    public EvaCuestionario(String codCuestionario) {
        this.codCuestionario = codCuestionario;
    }

    public EvaCuestionario(String codCuestionario, Date fechaCreacion, String estado) {
        this.codCuestionario = codCuestionario;
        this.fechaCreacion = fechaCreacion;
        this.estado = estado;
    }

    public String getCodCuestionario() {
        return codCuestionario;
    }

    public void setCodCuestionario(String codCuestionario) {
        this.codCuestionario = codCuestionario;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<EvaDetalleEvaluacon> getEvaDetalleEvaluaconList() {
        return evaDetalleEvaluaconList;
    }

    public void setEvaDetalleEvaluaconList(List<EvaDetalleEvaluacon> evaDetalleEvaluaconList) {
        this.evaDetalleEvaluaconList = evaDetalleEvaluaconList;
    }

    public List<EvaPregunta> getEvaPreguntaList() {
        return evaPreguntaList;
    }

    public void setEvaPreguntaList(List<EvaPregunta> evaPreguntaList) {
        this.evaPreguntaList = evaPreguntaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codCuestionario != null ? codCuestionario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EvaCuestionario)) {
            return false;
        }
        EvaCuestionario other = (EvaCuestionario) object;
        if ((this.codCuestionario == null && other.codCuestionario != null) || (this.codCuestionario != null && !this.codCuestionario.equals(other.codCuestionario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.arquitectura.universidad.periodolectivo.model.EvaCuestionario[ codCuestionario=" + codCuestionario + " ]";
    }
    
}
