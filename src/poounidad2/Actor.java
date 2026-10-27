package poounidad2;

public class Actor {
    private String nombre;
    private int edad;

    public Actor(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }

    public void mostrarInfo() {
        System.out.println("   - Actor: " + nombre + " (" + edad + " años)");
    }
}
