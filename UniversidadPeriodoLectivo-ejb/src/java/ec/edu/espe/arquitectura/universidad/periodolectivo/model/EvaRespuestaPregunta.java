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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author diego
 */
@Entity
@Table(name = "EVA_RESPUESTA_PREGUNTA")
@NamedQueries({
    @NamedQuery(name = "EvaRespuestaPregunta.findAll", query = "SELECT e FROM EvaRespuestaPregunta e")})
public class EvaRespuestaPregunta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "COD_REGISTRO_RESPUESTAS")
    private Integer codRegistroRespuestas;
    @Basic(optional = false)
    @Column(name = "COD_PERSONA")
    private String codPersona;
    @Basic(optional = false)
    @Column(name = "RESPUESTA")
    private int respuesta;
    @JoinColumn(name = "COD_PREGUNTA", referencedColumnName = "COD_PREGUNTA")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private EvaPregunta codPregunta;

    public EvaRespuestaPregunta() {
    }

    public EvaRespuestaPregunta(Integer codRegistroRespuestas) {
        this.codRegistroRespuestas = codRegistroRespuestas;
    }

    public EvaRespuestaPregunta(Integer codRegistroRespuestas, String codPersona, int respuesta) {
        this.codRegistroRespuestas = codRegistroRespuestas;
        this.codPersona = codPersona;
        this.respuesta = respuesta;
    }

    public Integer getCodRegistroRespuestas() {
        return codRegistroRespuestas;
    }

    public void setCodRegistroRespuestas(Integer codRegistroRespuestas) {
        this.codRegistroRespuestas = codRegistroRespuestas;
    }

    public String getCodPersona() {
        return codPersona;
    }

    public void setCodPersona(String codPersona) {
        this.codPersona = codPersona;
    }

    public int getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(int respuesta) {
        this.respuesta = respuesta;
    }

    public EvaPregunta getCodPregunta() {
        return codPregunta;
    }

    public void setCodPregunta(EvaPregunta codPregunta) {
        this.codPregunta = codPregunta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codRegistroRespuestas != null ? codRegistroRespuestas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EvaRespuestaPregunta)) {
            return false;
        }
        EvaRespuestaPregunta other = (EvaRespuestaPregunta) object;
        if ((this.codRegistroRespuestas == null && other.codRegistroRespuestas != null) || (this.codRegistroRespuestas != null && !this.codRegistroRespuestas.equals(other.codRegistroRespuestas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.arquitectura.universidad.periodolectivo.model.EvaRespuestaPregunta[ codRegistroRespuestas=" + codRegistroRespuestas + " ]";
    }
    
}
