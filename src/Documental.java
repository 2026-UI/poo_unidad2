package poounidad2;

import java.util.ArrayList;
import java.util.List;

public class Documental extends ContenidoAudiovisual {
    private String tema;
    private List<Investigador> investigadores;

    public Documental(String titulo, int duracionEnMinutos, String genero, String tema) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
        this.investigadores = new ArrayList<>();
    }

    public void agregarInvestigador(Investigador inv) {
        investigadores.add(inv);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("\n[DOCUMENTAL] Título: " + getTitulo() + " | Duración: " + getDuracionEnMinutos() + " min | Tema: " + tema);
        if(!investigadores.isEmpty()) {
            System.out.println(" Investigadores participantes:");
            for (Investigador inv : investigadores) {
                inv.mostrarInfo();
            }
        }
    }
}
