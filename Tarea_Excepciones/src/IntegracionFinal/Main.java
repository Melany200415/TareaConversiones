package IntegracionFinal;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversorMonedas conversor =
                new ConversorMonedas();
        try {
            System.out.print(
                    "Ingrese moneda origen (USD/EUR): ");
            String origen =
                    scanner.nextLine().toUpperCase();
            System.out.print(
                    "Ingrese moneda destino (USD/EUR: ");
            String destino =
                    scanner.nextLine().toUpperCase();
            System.out.print("Ingrese cantidad: ");
            String textoCantidad =
                    scanner.nextLine();
            // String -> doubl
            double cantidad =
                    Double.parseDouble(textoCantidad);
            // Conversion
            double resultado =
                    conversor.convertir(
                            origen,
                            destino,
                            cantidad);
            System.out.println(
                    "Resultado: "
                            + String.format("%.2f", resultado));

        } catch (MonedaNoSoportadaException e) {

            System.out.println(
                    "Error: " + e.getMessage());

        } catch (NumberFormatException e) {
            System.out.println(
                    "Debe ingresar una cantidad numerica valida");

        } finally {
            System.out.println(
                    "Programa finalizado correctamente");
        }
        scanner.close();
    }
}