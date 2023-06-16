package certus.edu.escuelita;

import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import static org.springframework.core.annotation.AnnotationFilter.packages;

@Component
@ApplicationPath("/api")
public class AppConfigEscuelita extends ResourceConfig {
    public  AppConfigEscuelita() { packages("certus.edu.recurso");}
}
