public class Baloncesto extends Deporte {
    private String tipoCancha;
    private int numeroTiempos;

    public Baloncesto(String tipoCancha, int numeroTiempos) {
        super("Baloncesto");
        this.tipoCancha = tipoCancha;
        this.numeroTiempos = numeroTiempos;
    }


    public String getTipoCancha() {
        return tipoCancha;
    }

    public void setTipoCancha(String tipoCancha) {
        this.tipoCancha = tipoCancha;
    }

    public int getNumeroTiempos() {
        return numeroTiempos;
    }

    public void setNumeroTiempos(int numeroTiempos) {
        this.numeroTiempos = numeroTiempos;
    }
    @Override
    public String obtenerDetallesDeporte() {
        return null;
    }
}
