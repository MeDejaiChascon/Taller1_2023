class Entrenador extends Persona {
    private String experiencia;
    private String especialidadDeportiva;

    public Entrenador(String nombre, String apellido, String correo, String numeroContacto, String experiencia) {
        super(nombre, apellido, correo, numeroContacto);
        this.experiencia = experiencia;
        this.especialidadDeportiva = especialidadDeportiva;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getEspecialidadDeportiva() {
        return especialidadDeportiva;
    }

    public void setEspecialidadDeportiva(String especialidadDeportiva) {
        this.especialidadDeportiva = especialidadDeportiva;
    }
}

