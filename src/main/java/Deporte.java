public abstract class Deporte {
    private String tipoCancha;

    public Deporte(String tipoCancha) {
        this.tipoCancha = tipoCancha;
    }

    public abstract String obtenerDetallesDeporte();
}
