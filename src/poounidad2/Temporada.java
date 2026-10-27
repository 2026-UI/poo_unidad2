package poounidad2;

public class Temporada {
    private int numeroTemporada;
    private int numeroEpisodios;

    public Temporada(int numeroTemporada, int numeroEpisodios) {
        this.numeroTemporada = numeroTemporada;
        this.numeroEpisodios = numeroEpisodios;
    }

    public void mostrarInfo() {
        System.out.println("   - Temporada " + numeroTemporada + ": " + numeroEpisodios + " episodios.");
    }
}
