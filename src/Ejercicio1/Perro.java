package Ejercicio1;

public class Perro extends Animal {

    Perro(String nombre, int edad){
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra: Guau, guau!.");
    }
}
