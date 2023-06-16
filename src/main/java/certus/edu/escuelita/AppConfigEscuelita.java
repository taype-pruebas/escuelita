package certus.edu.escuelita;

import jakarta.ws.rs.Path;
import org.springframework.stereotype.Component;

import static org.springframework.core.annotation.AnnotationFilter.packages;

@Component
@Path("/api")
public class AppConfigEscuelita {
    public  AppConfigEscuelita() { packages("edu.certus.pe.recurso");}
}
