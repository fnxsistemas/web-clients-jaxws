/**
 * 
 */
package com.ipartek.formacion;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import com.ipartek.peliculas.Pelicula;
import com.ipartek.peliculas.PeliculaMensaje;
import com.ipartek.peliculas.PeliculaServiceWsImp;
import com.ipartek.peliculas.Peliculasservice;

/**
 * @author Raúl de Roba 10/03/17
 *
 */
public class Main {
	public static void main(String[] args){
		/* Se instancia el cliente del servicio de peliculas. */
		Peliculasservice cliente = new Peliculasservice(); 
		/* Se instancia el servicio Ws.*/
		PeliculaServiceWsImp clienteSoap = cliente.getPeliculaServiceWsImpPort();
		/* Se recoge el mapa que contiene el mapa del contexto de la respuesta.
		 * BindingProvider es quien une cliente y servidor.*/
		Map<String,Object> requestContext = ((BindingProvider) clienteSoap).getRequestContext();
		/* Se declara el mapa para enviar la cabecera del contexto.*/
		Map<String,List<String>> requestHeader = new HashMap<String, List<String>>();
		/* /* Se monta el mapa de la cabecera de la petición.*/
		requestHeader.put("sessionId", Collections.singletonList("ipsession"));		
		/* Se monta el mapa de la cabecera en el contexto.*/
		requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, requestHeader);
		/* Se recoge la clase de la pelicula. */
		PeliculaMensaje respuesta = clienteSoap.obtenerporid(1);
		/* Se crea un Array la recoger la lista de peliculas del SOAP.*/
		List<Pelicula> peliculas = respuesta.getPeliculas();
		/* Se recoge la pelicula en la posicion inicial.*/
		Pelicula pelicula = peliculas.get(0);
		/* Se comprueba si se ha recogido la pelicula. */
		if(pelicula == null){
			/* Se muestra por consola el mensaje del SOAP. */
			System.out.println(respuesta.getMensaje());			
		}else{
			System.out.println("La pelicula es " + pelicula.getNombre());			
		}
		
		/* Se recoge la clase de la pelicula. */
		respuesta = clienteSoap.obtenerportodo();
		
		/*Cabecera de listado.*/
		System.out.println("Listado de peliculas");
		
		for (Pelicula peliculaEnLista : respuesta.getPeliculas()) {
			System.out.println(peliculaEnLista.getNombre());		
			
		}
		
	}
}
