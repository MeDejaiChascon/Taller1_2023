public class Futbol extends Deporte {
    private String tipoCampo;
    private boolean esLocal;

    public Futbol(String tipoCampo, boolean esLocal) {
        super("Fútbol");
        this.tipoCampo = tipoCampo;
        this.esLocal = esLocal;
    }

    public String getTipoCampo() {
        return tipoCampo;
    }

    public void setTipoCampo(String tipoCampo) {
        this.tipoCampo = tipoCampo;
    }

    public boolean isEsLocal() {
        return esLocal;
    }

    public void setEsLocal(boolean esLocal) {
        this.esLocal = esLocal;
    }

    @Override
    public String obtenerDetallesDeporte() {
        return null;
    }
}

