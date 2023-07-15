package certus.edu.recurso;

import certus.edu.escuelita.CrearCursoApplication;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.List;

@Path("/recursocurso")
public class RecursoCrearCurso {
    List<CrearCursoApplication> CrearCursoApplication=new ArrayList<CrearCursoApplication>();
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<CrearCursoApplication> getCrearCursoApplication(){
        CrearCursoApplication .add(new CrearCursoApplication("Python", "Introduccion", 6) );
        CrearCursoApplication .add(new CrearCursoApplication("JavaScript", "Avanzado", 3) );
        CrearCursoApplication .add(new CrearCursoApplication("Html", "Intermedio", 1) );
        CrearCursoApplication .add(new CrearCursoApplication("Css", "Basico", 2) );
        return CrearCursoApplication;
    }



}
