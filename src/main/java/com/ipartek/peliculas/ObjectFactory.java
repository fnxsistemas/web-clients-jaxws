
package com.ipartek.peliculas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ipartek.peliculas package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Obtenerportodo_QNAME = new QName("PeliculaWs", "obtenerportodo");
    private final static QName _Obtenerporid_QNAME = new QName("PeliculaWs", "obtenerporid");
    private final static QName _ObtenerporidResponse_QNAME = new QName("PeliculaWs", "obtenerporidResponse");
    private final static QName _ObtenerportodoResponse_QNAME = new QName("PeliculaWs", "obtenerportodoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ipartek.peliculas
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Obtenerporid }
     * 
     */
    public Obtenerporid createObtenerporid() {
        return new Obtenerporid();
    }

    /**
     * Create an instance of {@link ObtenerportodoResponse }
     * 
     */
    public ObtenerportodoResponse createObtenerportodoResponse() {
        return new ObtenerportodoResponse();
    }

    /**
     * Create an instance of {@link ObtenerporidResponse }
     * 
     */
    public ObtenerporidResponse createObtenerporidResponse() {
        return new ObtenerporidResponse();
    }

    /**
     * Create an instance of {@link Genero }
     * 
     */
    public Genero createGenero() {
        return new Genero();
    }

    /**
     * Create an instance of {@link Obtenerportodo }
     * 
     */
    public Obtenerportodo createObtenerportodo() {
        return new Obtenerportodo();
    }

    /**
     * Create an instance of {@link Pelicula }
     * 
     */
    public Pelicula createPelicula() {
        return new Pelicula();
    }

    /**
     * Create an instance of {@link PeliculaMensaje }
     * 
     */
    public PeliculaMensaje createPeliculaMensaje() {
        return new PeliculaMensaje();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Obtenerportodo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "PeliculaWs", name = "obtenerportodo")
    public JAXBElement<Obtenerportodo> createObtenerportodo(Obtenerportodo value) {
        return new JAXBElement<Obtenerportodo>(_Obtenerportodo_QNAME, Obtenerportodo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Obtenerporid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "PeliculaWs", name = "obtenerporid")
    public JAXBElement<Obtenerporid> createObtenerporid(Obtenerporid value) {
        return new JAXBElement<Obtenerporid>(_Obtenerporid_QNAME, Obtenerporid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerporidResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "PeliculaWs", name = "obtenerporidResponse")
    public JAXBElement<ObtenerporidResponse> createObtenerporidResponse(ObtenerporidResponse value) {
        return new JAXBElement<ObtenerporidResponse>(_ObtenerporidResponse_QNAME, ObtenerporidResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerportodoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "PeliculaWs", name = "obtenerportodoResponse")
    public JAXBElement<ObtenerportodoResponse> createObtenerportodoResponse(ObtenerportodoResponse value) {
        return new JAXBElement<ObtenerportodoResponse>(_ObtenerportodoResponse_QNAME, ObtenerportodoResponse.class, null, value);
    }

}
