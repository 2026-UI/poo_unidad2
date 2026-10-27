package poounidad2;

public class Podcast extends ContenidoAudiovisual {
    private int numeroEpisodio;
    private String anfitrion;

    public Podcast(String titulo, int duracionEnMinutos, String genero, int numeroEpisodio, String anfitrion) {
        super(titulo, duracionEnMinutos, genero);
        this.numeroEpisodio = numeroEpisodio;
        this.anfitrion = anfitrion;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("\n[PODCAST] Título: " + getTitulo() + " | Duración: " + getDuracionEnMinutos() + " min | Ep #" + numeroEpisodio + " | Host: " + anfitrion);
    }
}
