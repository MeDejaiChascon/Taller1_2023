public class Deportista extends Persona{
    private String deportePractica;
    private String posicionRol;

    public Deportista(String nombre, String apellido, String correo, String numeroContacto, String deportePractica, String posicionRol) {
        super(nombre, apellido, correo, numeroContacto);
        this.deportePractica = deportePractica;
        this.posicionRol = posicionRol;
    }

    public String getDeportePractica() {
        return deportePractica;
    }

    public void setDeportePractica(String deportePractica) {
        this.deportePractica = deportePractica;
    }

    public String getPosicionRol() {
        return posicionRol;
    }

    public void setPosicionRol(String posicionRol) {
        this.posicionRol = posicionRol;
    }

}

