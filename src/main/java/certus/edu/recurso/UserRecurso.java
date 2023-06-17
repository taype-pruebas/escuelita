package certus.edu.recurso;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.List;

@Path("/user")
public class UserRecurso {
    List<User> users= new ArrayList<User>();
@GET
@Produces({MediaType.APPLICATION_JSON})
    public List<User> getUsers(){
        users.add(new User("Miguel","Taype",14,"usuario1@gmail.com","mipassword1"));
        users.add(new User("Juanito","Perez",15,"usuario2@gmail.com","mipassword2"));
        users.add(new User("Mabel","Noriega",16,"usuario3@gmail.com","mipassword3"));
        users.add(new User("Belen","Donayre",17,"usuario4@gmail.com","mipassword4"));

        return users;
    }
@POST
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
   public List<User> guardarUsers(User user){
       users.add(new User("Nicole","Casas",18,"usuario5@gmail.com","mipassword5"));
       users.add(user);

       return users;
   }

}
