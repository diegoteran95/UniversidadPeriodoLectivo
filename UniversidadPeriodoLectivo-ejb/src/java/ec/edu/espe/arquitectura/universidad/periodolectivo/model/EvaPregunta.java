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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author diego
 */
@Entity
@Table(name = "EVA_PREGUNTA")
@NamedQueries({
    @NamedQuery(name = "EvaPregunta.findAll", query = "SELECT e FROM EvaPregunta e")})
public class EvaPregunta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_PREGUNTA")
    private Integer codPregunta;
    @Basic(optional = false)
    @Column(name = "ENUNCIADO")
    private String enunciado;
    @JoinColumn(name = "COD_CUESTIONARIO", referencedColumnName = "COD_CUESTIONARIO")
    @ManyToOne(fetch = FetchType.LAZY)
    private EvaCuestionario codCuestionario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codPregunta", fetch = FetchType.LAZY)
    private List<EvaRespuestaPregunta> evaRespuestaPreguntaList;

    public EvaPregunta() {
    }

    public EvaPregunta(Integer codPregunta) {
        this.codPregunta = codPregunta;
    }

    public EvaPregunta(Integer codPregunta, String enunciado) {
        this.codPregunta = codPregunta;
        this.enunciado = enunciado;
    }

    public Integer getCodPregunta() {
        return codPregunta;
    }

    public void setCodPregunta(Integer codPregunta) {
        this.codPregunta = codPregunta;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public EvaCuestionario getCodCuestionario() {
        return codCuestionario;
    }

    public void setCodCuestionario(EvaCuestionario codCuestionario) {
        this.codCuestionario = codCuestionario;
    }

    public List<EvaRespuestaPregunta> getEvaRespuestaPreguntaList() {
        return evaRespuestaPreguntaList;
    }

    public void setEvaRespuestaPreguntaList(List<EvaRespuestaPregunta> evaRespuestaPreguntaList) {
        this.evaRespuestaPreguntaList = evaRespuestaPreguntaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codPregunta != null ? codPregunta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EvaPregunta)) {
            return false;
        }
        EvaPregunta other = (EvaPregunta) object;
        if ((this.codPregunta == null && other.codPregunta != null) || (this.codPregunta != null && !this.codPregunta.equals(other.codPregunta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.arquitectura.universidad.periodolectivo.model.EvaPregunta[ codPregunta=" + codPregunta + " ]";
    }
    
}
