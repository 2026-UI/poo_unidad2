package poounidad2;

public class Canal {
    private String nombreCanal;
    private int suscriptores;

    public Canal(String nombreCanal, int suscriptores) {
        this.nombreCanal = nombreCanal;
        this.suscriptores = suscriptores;
    }

    public String getNombreCanal() { return nombreCanal; }
    public int getSuscriptores() { return suscriptores; }

    public void mostrarInfo() {
        System.out.println("   - Canal de YouTube: " + nombreCanal + " (" + suscriptores + " subs)");
    }
}
