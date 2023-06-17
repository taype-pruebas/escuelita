package certus.edu.escuelita;

public class CrearCursoApplication {
        private String nombre;
        private String descripcion;
        private int tiempo;
        public CrearCursoApplication(){
        }
        //constructor para crear cursos
    public CrearCursoApplication(String nombre, String descripcion, int tiempo) {
            this.nombre = nombre;
            this.descripcion = descripcion;
            this.tiempo = tiempo;
        }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
}
