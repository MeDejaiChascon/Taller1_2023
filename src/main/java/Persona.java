public class Persona {
    private String nombre;
    private String apellido;
    private String correo;
    private String numeroContacto;

    // Constructor
    public Persona(String nombre, String apellido, String correo, String numeroContacto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.numeroContacto = numeroContacto;

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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

}
