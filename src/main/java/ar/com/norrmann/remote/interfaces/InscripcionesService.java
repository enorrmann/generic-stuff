package ar.com.norrmann.remote.interfaces;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import modelo.matricula.InscripcionGrpCarrera;
import modelo.personas.Persona;

@Path("/inscripciones")
public interface InscripcionesService {

	@POST
	public InscripcionGrpCarrera inscribir(Persona alumno) ;

}
