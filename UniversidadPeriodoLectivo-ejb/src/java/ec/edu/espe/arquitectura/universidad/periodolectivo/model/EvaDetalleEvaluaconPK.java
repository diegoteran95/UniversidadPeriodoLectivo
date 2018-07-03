/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.universidad.periodolectivo.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author diego
 */
@Embeddable
public class EvaDetalleEvaluaconPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "COD_EVALUACION")
    private String codEvaluacion;
    @Basic(optional = false)
    @Column(name = "COD_CUESTIONARIO")
    private String codCuestionario;

    public EvaDetalleEvaluaconPK() {
    }

    public EvaDetalleEvaluaconPK(String codEvaluacion, String codCuestionario) {
        this.codEvaluacion = codEvaluacion;
        this.codCuestionario = codCuestionario;
    }

    public String getCodEvaluacion() {
        return codEvaluacion;
    }

    public void setCodEvaluacion(String codEvaluacion) {
        this.codEvaluacion = codEvaluacion;
    }

    public String getCodCuestionario() {
        return codCuestionario;
    }

    public void setCodCuestionario(String codCuestionario) {
        this.codCuestionario = codCuestionario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codEvaluacion != null ? codEvaluacion.hashCode() : 0);
        hash += (codCuestionario != null ? codCuestionario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EvaDetalleEvaluaconPK)) {
            return false;
        }
        EvaDetalleEvaluaconPK other = (EvaDetalleEvaluaconPK) object;
        if ((this.codEvaluacion == null && other.codEvaluacion != null) || (this.codEvaluacion != null && !this.codEvaluacion.equals(other.codEvaluacion))) {
            return false;
        }
        if ((this.codCuestionario == null && other.codCuestionario != null) || (this.codCuestionario != null && !this.codCuestionario.equals(other.codCuestionario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.arquitectura.universidad.periodolectivo.model.EvaDetalleEvaluaconPK[ codEvaluacion=" + codEvaluacion + ", codCuestionario=" + codCuestionario + " ]";
    }
    
}
