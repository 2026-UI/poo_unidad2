package poounidad2;

import java.util.ArrayList;
import java.util.List;

public class SerieDeTV extends ContenidoAudiovisual {
    private List<Temporada> temporadas;

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero) {
        super(titulo, duracionEnMinutos, genero);
        this.temporadas = new ArrayList<>();
    }

    public void agregarTemporada(int numeroTemporada, int numeroEpisodios) {
        this.temporadas.add(new Temporada(numeroTemporada, numeroEpisodios));
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("\n[SERIE DE TV] Título: " + getTitulo() + " | Duración Promedio: " + getDuracionEnMinutos() + " min | Género: " + getGenero());
        System.out.println(" Temporadas compuestas:");
        for (Temporada t : temporadas) {
            t.mostrarInfo();
        }
    }
}
