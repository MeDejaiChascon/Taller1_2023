import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private List<Deportista> jugadores;
    private Entrenador entrenador;
    private List<Partido> historialPartidos;

    public Equipo(String nombre, Entrenador entrenador) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
        this.entrenador = entrenador;
        this.historialPartidos = new ArrayList<>();
    }

    public void agregarJugador(Deportista jugador) {
        jugadores.add(jugador);
    }

    public void agregarPartido(Partido partido) {
        historialPartidos.add(partido);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Deportista> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Deportista> jugadores) {
        this.jugadores = jugadores;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public List<Partido> getHistorialPartidos() {
        return historialPartidos;
    }

    public void setHistorialPartidos(List<Partido> historialPartidos) {
        this.historialPartidos = historialPartidos;
    }
}
