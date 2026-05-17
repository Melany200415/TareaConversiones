package IntegracionFinal;

public class ConversorMonedas {
    public double convertir(String monedaOrigen,
                            String monedaDestino,
                            double cantidad)
            throws MonedaNoSoportadaException {
        // Validar monedas soportadas
        if ((!monedaOrigen.equals("USD") &&
                !monedaOrigen.equals("EUR")) ||
                (!monedaDestino.equals("USD") &&
                        !monedaDestino.equals("EUR"))) {
            throw new MonedaNoSoportadaException(
                    "Moneda no soportada");
        }
        double tasa = 0;
//Cambia de tipo de moneda
        if (monedaOrigen.equals("USD")
                && monedaDestino.equals("EUR")) {

            tasa = 0.92;
        }
//Cambia de tipo de moneda
        else if (monedaOrigen.equals("EUR")
                && monedaDestino.equals("USD")) {

            tasa = 1.09;
        }
        // Misma moneda
        else {

            tasa = 1;
        }
        return cantidad * tasa;
    }
}