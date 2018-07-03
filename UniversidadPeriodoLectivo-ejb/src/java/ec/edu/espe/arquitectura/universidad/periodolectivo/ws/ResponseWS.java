/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.universidad.periodolectivo.ws;

/**
 *
 * @author diego
 */
public class ResponseWS {

    private String CodigoRetorno;
    private String MensajeRetorno;
    private Object Respuesta;

    public ResponseWS() {

    }

    public String getCodigoRetorno() {
        return CodigoRetorno;
    }

    public void setCodigoRetorno(String CodigoRetorno) {
        this.CodigoRetorno = CodigoRetorno;
    }

    public String getMensajeRetorno() {
        return MensajeRetorno;
    }

    public void setMensajeRetorno(String MensajeRetorno) {
        this.MensajeRetorno = MensajeRetorno;
    }

    public Object getRespuesta() {
        return Respuesta;
    }

    public void setRespuesta(Object Respuesta) {
        this.Respuesta = Respuesta;
    }

}
