/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.universidad.periodolectivo.modelws;

/**
 *
 * @author diego
 */
public class PrlNrcWS {
    private String codNrc;
    private String codPeriodo;
    private String codAsignatura;
    private String codPersona;
    private Integer cantidadNrc;

    public PrlNrcWS() {
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

    public String getCodAsignatura() {
        return codAsignatura;
    }

    public void setCodAsignatura(String codAsignatura) {
        this.codAsignatura = codAsignatura;
    }

    public String getCodPersona() {
        return codPersona;
    }

    public void setCodPersona(String codPersona) {
        this.codPersona = codPersona;
    }

    public Integer getCantidadNrc() {
        return cantidadNrc;
    }

    public void setCantidadNrc(Integer cantidadNrc) {
        this.cantidadNrc = cantidadNrc;
    }
}
