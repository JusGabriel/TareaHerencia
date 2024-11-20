package Ejercicio1;

public class Animal {
    private String nombre;
    private int edad;

    Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void hacerSonido() {
        System.out.println("Sonido");
    }

    public static void main (String [] args) {
        Perro p1 = new Perro("Bruno", 10);
        System.out.println("Nombre: " + p1.getNombre()+"\nEdad: " + p1.getEdad());
        p1.hacerSonido();
        Gato g1 = new Gato("Bola de Nieve", 2);
        System.out.println("Nombre: " + g1.getNombre()+"\nEdad: " + g1.getEdad());
        g1.hacerSonido();

    }
}
