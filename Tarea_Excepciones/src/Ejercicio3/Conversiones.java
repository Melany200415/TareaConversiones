package Ejercicio3;

public class Conversiones {

    public static void main(String[] args) {
        System.out.println("=== PARTE A CONVERSION IMPLICITA ===");
        byte numeroByte = 5;
        short numeroShort = numeroByte;
        int numeroInt = numeroShort;
        long numeroLong = numeroInt;
        float numeroFloat = numeroLong;
        double numeroDouble = numeroFloat;
        System.out.println("byte: " + numeroByte);
        System.out.println("short: " + numeroShort);
        System.out.println("int: " + numeroInt);
        System.out.println("long: " + numeroLong);
        System.out.println("float: " + numeroFloat);
        System.out.println("double: " + numeroDouble);

        System.out.println("\n=== PARTE B CASTING EXPLICITO ===");
        double valor = 45.89;
        float valorFloat = (float) valor;
        int valorInt = (int) valor;
        short valorShort = (short) valor;
        byte valorByte = (byte) valor;
        System.out.println("double: " + valor);
        System.out.println("float: " + valorFloat);
        System.out.println("int: " + valorInt);
        System.out.println("short: " + valorShort);
        System.out.println("byte: " + valorByte);


        System.out.println("\n=== PARTE C  Strings ===");

        String texto1 = "2024";
        String texto2 = "98.6";
        String texto3 = "false";
        int numero = Integer.parseInt(texto1);
        double decimal = Double.parseDouble(texto2);
        boolean estado = Boolean.parseBoolean(texto3);
        System.out.println(numero);
        System.out.println(decimal);
        System.out.println(estado);
        String cadena1 = String.valueOf(numero);
        String cadena2 = Double.toString(decimal);
        String cadena3 = estado + "";
        System.out.println(cadena1);
        System.out.println(cadena2);
        System.out.println(cadena3);

    }
}
