package ar.com.norrmann.remote.interfaces;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import modelo.organismos.Pais;

@Path("/pais")
public interface PaisService {

	@GET
	@Produces("application/json")
	public List<Pais> listar() ;

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Pais findPais(@PathParam("id") Long id) ;
	
	@PUT
	@Produces("application/json")
	@Consumes("application/json")
	public Pais actualizar(Pais pais);

	@POST
	@Produces("application/json")
	@Consumes("application/json")
	public Pais guardar(Pais pais);
	
	@DELETE
	@Path("/{id}")
	@Consumes("application/json")
	public String borrar(@PathParam("id") Long id) ;

	
}
