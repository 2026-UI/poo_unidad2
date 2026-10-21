package poounidad2;

public class VideoYouTube extends ContenidoAudiovisual {
    private String url;
    private Canal canal;

    public VideoYouTube(String titulo, int duracionEnMinutos, String genero, String url, Canal canal) {
        super(titulo, duracionEnMinutos, genero);
        this.url = url;
        this.canal = canal;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("\n[VIDEO YOUTUBE] Título: " + getTitulo() + " | Duración: " + getDuracionEnMinutos() + " min | URL: " + url);
        if (canal != null) canal.mostrarInfo();
    }
}
