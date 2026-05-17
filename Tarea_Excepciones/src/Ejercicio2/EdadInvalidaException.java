package Ejercicio2;

public class EdadInvalidaException extends Exception {

    private int edadIngresada;
    public EdadInvalidaException(int edadIngresada) {

        super("Error: la edad ingresada (" + edadIngresada +
                ") no es válida. Debe estar entre 0 y 120.");
        this.edadIngresada = edadIngresada;
    }
    public int getEdadIngresada() {
        return edadIngresada;
    }
}