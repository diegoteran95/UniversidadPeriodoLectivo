/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.universidad.periodolectivo.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author diego
 */
@Embeddable
public class PrlDetalleMatriculaPK implements Serializable {

    @Column(name = "COD_MATRICULA", nullable = false, length = 10)
    private String codMatricula;

    @Column(name = "COD_NRC", nullable = false, length = 5)
    private String codNrc;

    @Column(name = "COD_PERIODO", nullable = false, length = 6)
    private String codPeriodo;

    public PrlDetalleMatriculaPK() {
    }

    public PrlDetalleMatriculaPK(String codMatricula, String codNrc, String codPeriodo) {
        this.codMatricula = codMatricula;
        this.codNrc = codNrc;
        this.codPeriodo = codPeriodo;
    }

    public String getCodMatricula() {
        return codMatricula;
    }

    public void setCodMatricula(String codMatricula) {
        this.codMatricula = codMatricula;
    }

    public String getCodNrc() {
        return codNrc;
    }

    public void setCodNrc(String codNrc) {
        this.codNrc = codNrc;
    }

    public String getCodPeriodo() {
        return codPeriodo;
    }

    public void setCodPeriodo(String codPeriodo) {
        this.codPeriodo = codPeriodo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codMatricula != null ? codMatricula.hashCode() : 0);
        hash += (codNrc != null ? codNrc.hashCode() : 0);
        hash += (codPeriodo != null ? codPeriodo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrlDetalleMatriculaPK)) {
            return false;
        }
        PrlDetalleMatriculaPK other = (PrlDetalleMatriculaPK) object;
        if ((this.codMatricula == null && other.codMatricula != null) || (this.codMatricula != null && !this.codMatricula.equals(other.codMatricula))) {
            return false;
        }
        if ((this.codNrc == null && other.codNrc != null) || (this.codNrc != null && !this.codNrc.equals(other.codNrc))) {
            return false;
        }
        if ((this.codPeriodo == null && other.codPeriodo != null) || (this.codPeriodo != null && !this.codPeriodo.equals(other.codPeriodo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.arquitectura.universidad.periodolectivo.model.PrlDetalleMatriculaPK[ codMatricula=" + codMatricula + ", codNrc=" + codNrc + ", codPeriodo=" + codPeriodo + " ]";
    }
    
}
