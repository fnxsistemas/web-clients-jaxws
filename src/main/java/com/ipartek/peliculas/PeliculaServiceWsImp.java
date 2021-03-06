
package com.ipartek.peliculas;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "PeliculaServiceWsImp", targetNamespace = "PeliculaWs")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PeliculaServiceWsImp {


    /**
     * 
     * @return
     *     returns com.ipartek.peliculas.PeliculaMensaje
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerportodo", targetNamespace = "PeliculaWs", className = "com.ipartek.peliculas.Obtenerportodo")
    @ResponseWrapper(localName = "obtenerportodoResponse", targetNamespace = "PeliculaWs", className = "com.ipartek.peliculas.ObtenerportodoResponse")
    public PeliculaMensaje obtenerportodo();

    /**
     * 
     * @param arg0
     * @return
     *     returns com.ipartek.peliculas.PeliculaMensaje
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerporid", targetNamespace = "PeliculaWs", className = "com.ipartek.peliculas.Obtenerporid")
    @ResponseWrapper(localName = "obtenerporidResponse", targetNamespace = "PeliculaWs", className = "com.ipartek.peliculas.ObtenerporidResponse")
    public PeliculaMensaje obtenerporid(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

}
