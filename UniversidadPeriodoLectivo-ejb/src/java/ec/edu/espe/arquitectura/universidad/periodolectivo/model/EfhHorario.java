/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.universidad.periodolectivo.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author diego
 */
@Entity
@Table(name = "EFH_HORARIO")
@NamedQueries({
    @NamedQuery(name = "EfhHorario.findAll", query = "SELECT e FROM EfhHorario e")})
public class EfhHorario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_HORARIO")
    private String codHorario;
    @JoinColumn(name = "COD_FRANJA_MATRICULA", referencedColumnName = "COD_FRANJA_HORARIA")
    @ManyToOne(fetch = FetchType.LAZY)
    private EfhFranjaHoraria codFranjaMatricula;
    @JoinColumns({
        @JoinColumn(name = "COD_NRC", referencedColumnName = "COD_NRC")
        , @JoinColumn(name = "COD_PERIODO", referencedColumnName = "COD_PERIODO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private PrlNrc prlNrc;
    @JoinColumn(name = "COD_UBICACION", referencedColumnName = "COD_UBICACION")
    @ManyToOne(fetch = FetchType.LAZY)
    private EfhUbicacion codUbicacion;

    public EfhHorario() {
    }

    public EfhHorario(String codHorario) {
        this.codHorario = codHorario;
    }

    public String getCodHorario() {
        return codHorario;
    }

    public void setCodHorario(String codHorario) {
        this.codHorario = codHorario;
    }

    public EfhFranjaHoraria getCodFranjaMatricula() {
        return codFranjaMatricula;
    }

    public void setCodFranjaMatricula(EfhFranjaHoraria codFranjaMatricula) {
        this.codFranjaMatricula = codFranjaMatricula;
    }

    public PrlNrc getPrlNrc() {
        return prlNrc;
    }

    public void setPrlNrc(PrlNrc prlNrc) {
        this.prlNrc = prlNrc;
    }

    public EfhUbicacion getCodUbicacion() {
        return codUbicacion;
    }

    public void setCodUbicacion(EfhUbicacion codUbicacion) {
        this.codUbicacion = codUbicacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codHorario != null ? codHorario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EfhHorario)) {
            return false;
        }
        EfhHorario other = (EfhHorario) object;
        if ((this.codHorario == null && other.codHorario != null) || (this.codHorario != null && !this.codHorario.equals(other.codHorario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.arquitectura.universidad.periodolectivo.model.EfhHorario[ codHorario=" + codHorario + " ]";
    }
    
}
