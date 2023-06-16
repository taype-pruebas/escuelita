package certus.edu.recurso;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.springframework.web.bind.annotation.RequestBody;

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

            String mensaje = "Datos verificado correctamente";
            return Response.status(Response.Status.OK).entity(mensaje).build();
        } else {
            return Response.status(Response.Status.BAD_REQUEST).entity("Usuario no encontrado").build();
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
}

