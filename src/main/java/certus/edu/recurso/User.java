package certus.edu.recurso;

public class User {

    private String nombre;
    private String apellido;
    private Integer edad;
    private String email;
    private String contrasenia;

    User(String nombre, String apellido, Integer edad, String email, String contrasenia){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.email=email;
        this.contrasenia=contrasenia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
}
