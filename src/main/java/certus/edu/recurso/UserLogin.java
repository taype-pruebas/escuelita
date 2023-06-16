package certus.edu.recurso;

public class UserLogin {
        private String email;
        private String contrasenia;

        public UserLogin(String email, String contrasenia) {
            this.email = email;
            this.contrasenia = contrasenia;
        }

        public String getEmail() {
            return email;
        }

        public String getContrasenia() {
            return contrasenia;
        }

}
