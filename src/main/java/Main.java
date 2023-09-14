import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Entrenador entrenador1 = new Entrenador("Juan", "Perez", "juan@gmail.com", "10 años de experiencia", "Futbol");

        Deportista jugador1 = new Deportista("Carlos", "Gonzalez", "carlos@gmail.com", "+569 74322003", "Futbol", "Delantero");
        Deportista jugador2 = new Deportista("Laura", "Martinez", "laura@gmail.com", "+569 58590024", "Futbol", "Defensor");
        Deportista jugador3 = new Deportista("Pedro", "Ramirez", "pedro@gmail.com", "+569 53142352", "Baloncesto", "Base");

        Equipo equipoFutbol = new Equipo("Equipo de Futbol", entrenador1);
        Equipo equipoBaloncesto = new Equipo("Equipo de Baloncesto", entrenador1);

        equipoFutbol.agregarJugador(jugador1);
        equipoFutbol.agregarJugador(jugador2);
        equipoBaloncesto.agregarJugador(jugador3);

        Partido partido1 = new Partido("Equipo Local", "Equipo Visitante", "3-2", new Date(), "Estadio Principal");

        equipoFutbol.agregarPartido(partido1);

        Futbol futbol = new Futbol("Sintetico", true);
        Baloncesto baloncesto = new Baloncesto("Interior", 4);
        Tenis tenis = new Tenis("Cesped", false);

        System.out.println("Entrenador: " + entrenador1.getNombre());
        System.out.println("Jugadores en el equipo de Futbol:");
        for (Deportista jugador : equipoFutbol.getJugadores()) {
            System.out.println("- " + jugador.getNombre() + " (" + jugador.getDeportePractica() + ")");
        }

        System.out.println("Historial de partidos del equipo de Futbol:");
        for (Partido partido : equipoFutbol.getHistorialPartidos()) {
            System.out.println("- " + partido.getResultado() + " contra " + partido.getEquipoVisitante());
        }

        System.out.println("Detalles del deporte de Futbol:");
        System.out.println("- Tipo de cancha: " + futbol.getTipoCampo());
        System.out.println("- Es local: " + futbol.isEsLocal());

        System.out.println("Detalles del deporte de Baloncesto:");
        System.out.println("- Tipo de cancha: " + baloncesto.getTipoCancha());
        System.out.println("- Numero de tiempos jugados: " + baloncesto.getNumeroTiempos());

        System.out.println("Detalles del deporte de Tenis:");
        System.out.println("- Tipo de superficie de la cancha: " + tenis.getTipoSuperficie());
        System.out.println("- Es partido de dobles: " + tenis.isEsDobles());
    }
}
