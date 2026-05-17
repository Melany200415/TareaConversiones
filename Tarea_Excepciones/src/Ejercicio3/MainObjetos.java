package Ejercicio3;


public class MainObjetos {

    public static void main(String[] args) {

        Animal animal = new Perro();

        animal.hacerSonido();

        if (animal instanceof Perro) {

            Perro perro = (Perro) animal;

            perro.ladrar();
        }
    }
}