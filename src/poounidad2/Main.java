package poounidad2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ContenidoAudiovisual> contenidos = new ArrayList<>();

        // 1. Película + Actores (Agregación)
        Pelicula pelicula = new Pelicula("Inception", 148, "Ciencia Ficción", "Warner Bros");
        pelicula.agregarActor(new Actor("Leonardo DiCaprio", 49));
        pelicula.agregarActor(new Actor("Joseph Gordon-Levitt", 43));
        contenidos.add(pelicula);

        // 2. Serie de TV + Temporadas (Composición)
        SerieDeTV serie = new SerieDeTV("Breaking Bad", 47, "Drama");
        serie.agregarTemporada(1, 7);
        serie.agregarTemporada(2, 13);
        contenidos.add(serie);

        // 3. Documental + Investigadores (Agregación)
        Documental docu = new Documental("Our Planet", 50, "Naturaleza", "Biodiversidad");
        docu.agregarInvestigador(new Investigador("David Attenborough", "Biología Marina"));
        contenidos.add(docu);

        // 4. Subclase 1: VideoYouTube
        Canal miCanal = new Canal("TechExplained", 250000);
        VideoYouTube video = new VideoYouTube("Tutorial POO", 25, "Educación", "https://youtube.com/watch?v=123", miCanal);
        contenidos.add(video);

        // 5. Subclase 2: Podcast
        Podcast podcast = new Podcast("DevTalks", 45, "Tecnología", 12, "Jackson Romero");
        contenidos.add(podcast);

        // Demostración de Polimorfismo
        System.out.println("=================================================");
        System.out.println("   SISTEMA DE GESTIÓN DE CONTENIDOS AUDIOVISUALES");
        System.out.println("=================================================");
        for (ContenidoAudiovisual c : contenidos) {
            c.mostrarDetalles();
        }
    }
}
