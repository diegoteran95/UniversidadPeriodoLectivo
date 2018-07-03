/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.universidad.periodolectivo.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author diego
 */
@Entity
@Table(name = "EFH_FRANJA_HORARIA")
public class EfhFranjaHoraria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "COD_FRANJA_HORARIA", nullable = false, length = 5)
    private String codFranjaHoraria;

    @Column(name = "INICIO_HORA", nullable = false)
    @Temporal(TemporalType.TIME)
    private Date inicioHora;

    @Column(name = "FIN_HORA", nullable = false)
    @Temporal(TemporalType.TIME)
    private Date finHora;

    @Column(name = "DIA", nullable = false, length = 2)
    private String dia;
    @OneToMany(mappedBy = "codFranjaMatricula", fetch = FetchType.LAZY)
    private List<EfhHorario> efhHorarioList;

    public EfhFranjaHoraria() {
    }

    public EfhFranjaHoraria(String codFranjaHoraria) {
        this.codFranjaHoraria = codFranjaHoraria;
    }

    public EfhFranjaHoraria(String codFranjaHoraria, Date inicioHora, Date finHora, String dia) {
        this.codFranjaHoraria = codFranjaHoraria;
        this.inicioHora = inicioHora;
        this.finHora = finHora;
        this.dia = dia;
    }

    public String getCodFranjaHoraria() {
        return codFranjaHoraria;
    }

    public void setCodFranjaHoraria(String codFranjaHoraria) {
        this.codFranjaHoraria = codFranjaHoraria;
    }

    public Date getInicioHora() {
        return inicioHora;
    }

    public void setInicioHora(Date inicioHora) {
        this.inicioHora = inicioHora;
    }

    public Date getFinHora() {
        return finHora;
    }

    public void setFinHora(Date finHora) {
        this.finHora = finHora;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
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
        hash += (codFranjaHoraria != null ? codFranjaHoraria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EfhFranjaHoraria)) {
            return false;
        }
        EfhFranjaHoraria other = (EfhFranjaHoraria) object;
        if ((this.codFranjaHoraria == null && other.codFranjaHoraria != null) || (this.codFranjaHoraria != null && !this.codFranjaHoraria.equals(other.codFranjaHoraria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.arquitectura.universidad.periodolectivo.model.EfhFranjaHoraria[ codFranjaHoraria=" + codFranjaHoraria + " ]";
    }
    
}
