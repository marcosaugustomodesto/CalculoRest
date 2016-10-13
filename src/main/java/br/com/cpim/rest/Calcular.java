package br.com.cpim.rest;

/** 
 * @author Marcos Augusto Modesto
 */

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/Calcular")
public class Calcular {

	@GET
	@Path("/soma/{a}/{b}")
	@Produces(MediaType.APPLICATION_JSON)
	public Calculo adicao(@PathParam("a") int a, @PathParam("b") int b) {
		return new Calculo(a, b, 'a');
	}

	@GET
	@Path("/subtracao/{a}/{b}")
	@Produces(MediaType.APPLICATION_JSON)
	public Calculo subtracao(@PathParam("a") int a, @PathParam("b") int b) {
		return new Calculo(a, b, 's');
	}
	
	@GET
	@Path("/multiplicacao/{a}/{b}")
	@Produces(MediaType.APPLICATION_JSON)
	public Calculo multiplicacao(@PathParam("a") int a, @PathParam("b") int b) {
		return new Calculo(a, b, 'm');
	}
	@GET
	@Path("/divisao/{a}/{b}")
	@Produces(MediaType.APPLICATION_JSON)
	public Calculo divisao(@PathParam("a") int a, @PathParam("b") int b) {
		return new Calculo(a, b, 'd');
	}
}