package certus.edu.recurso;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Path("/auth")
public class LoginRecurso {
    //:TODO Hacer refrencia a CLASE USER

    List<UserLogin> usuariosLis = new ArrayList<>();

    /*Convertir a json*/
    ObjectMapper objectMapper = new ObjectMapper();


    UserLogin userLogin1 = new UserLogin("usuario1@gmail.com", "mipassword1");
    UserLogin userLogin2 = new UserLogin("usuario2@gmail.com", "mipassword2");
    UserLogin userLogin3 = new UserLogin("usuario3@gmail.com", "mipassword3");
    UserLogin userLogin4 = new UserLogin("usuario4@gmail.com", "mipassword4");

    @POST
    @Produces({MediaType.APPLICATION_JSON})
    @Path("/login")
    public Response setLogin(@RequestBody UserLogin userBody) {

        usuariosLis.add(userLogin1);
        usuariosLis.add(userLogin2);
        usuariosLis.add(userLogin3);
        usuariosLis.add(userLogin4);

        String userEmail = userBody.getEmail();
        String userPassword = userBody.getContrasenia();

        UserLogin userSearch = seachUser(usuariosLis, userEmail);


        if (userSearch != null && Objects.equals(userSearch.getContrasenia(), userPassword)) {


            String correo = userEmail;
            String mensaje = "Inicio de sesion exitoso";
            MiObjeto objeto = new MiObjeto();
            objeto.setMensaje(correo, mensaje);
            return Response.ok(objeto, MediaType.APPLICATION_JSON).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND)
                    .entity("Credenciales no válidos.")
                    .type(MediaType.TEXT_PLAIN)
                    .build();
        }
    }

    public static UserLogin seachUser(List<UserLogin> usuarios, String emailSearch) {
        for (UserLogin usuario : usuarios) {
            if (usuario.getEmail().equals(emailSearch)) {
                return usuario;
            }
        }
        return null;
    }


    // Clase de ejemplo para el objeto que deseas devolver
    public static class MiObjeto {
        private String mensaje;
        private String mensaje2;

        // Getter y setter

        public String getMensaje() {
            return mensaje;
        }

        public String getMensaje2() {
            return mensaje2;
        }

        public void setMensaje(String mensaje,String mensaje2 ) {
            this.mensaje = mensaje;
            this.mensaje2 = mensaje2;
        }
    }
}

