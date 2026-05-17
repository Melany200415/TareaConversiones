package Ejercicio2;

public class Main{
    public static void main(String[] args) {

        try {

            Estudiante e1 = new Estudiante("Ana", 20, 9.5);
            e1.mostrarDatos();
            Estudiante e2 = new Estudiante("Carlos", 18, 8.7);
            e2.mostrarDatos();
            Estudiante e3 = new Estudiante("Lucia", -5, 7.9);
            e3.mostrarDatos();

        } catch (EdadInvalidaException e) {
            System.out.println("Se produjo una excepción:");
            System.out.println(e.getMessage());

        }
        System.out.println("Programa finalizado.");
    }
}