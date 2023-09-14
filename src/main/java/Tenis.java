public class Tenis extends Deporte {
    private String tipoSuperficie;
    private boolean esDobles;

    public Tenis(String tipoSuperficie, boolean esDobles) {
        super("Tenis");
        this.tipoSuperficie = tipoSuperficie;
        this.esDobles = esDobles;
    }

    public String getTipoSuperficie() {
        return tipoSuperficie;
    }

    public void setTipoSuperficie(String tipoSuperficie) {
        this.tipoSuperficie = tipoSuperficie;
    }

    public boolean isEsDobles() {
        return esDobles;
    }

    public void setEsDobles(boolean esDobles) {
        this.esDobles = esDobles;
    }

    @Override
    public String obtenerDetallesDeporte() {
        return null;
    }
}
