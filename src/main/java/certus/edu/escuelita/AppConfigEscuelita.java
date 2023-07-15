package certus.edu.escuelita;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@ApplicationPath("/api")
public class AppConfigEscuelita extends ResourceConfig {
    public  AppConfigEscuelita() {
        registerEndpoints();
        configureCors();
    }
    private void registerEndpoints() {
        // Registra tus clases de recursos Jersey aquí
        packages("certus.edu.recurso");
    }

    private void configureCors() {
        register(CorsFilter.class);
    }

    @Component
    public static class CorsFilter implements Filter {

      @Override
      public void init(FilterConfig filterConfig) throws ServletException {
        // No se requiere inicialización adicional
      }

      @Override
      public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
              throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        response.setHeader("Access-Control-Allow-Origin", "*"); // Permite el acceso desde cualquier origen
        response.setHeader("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT"); // Métodos permitidos
        response.setHeader("Access-Control-Allow-Headers", "Content-Type"); // Cabeceras permitidas

        filterChain.doFilter(servletRequest, servletResponse);
      }

      @Override
      public void destroy() {
        // No se requiere limpieza adicional
      }
    }
}
