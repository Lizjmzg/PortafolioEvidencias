public class Principal {
    public static void main(String[] args) {
        // Factura con RFC
        Factura facturaConRFC = new Factura(6800.0, "Servicio de consultoría", "ABCC010101XYZ");

        // Factura sin RFC (se pasa null)
        Factura facturaSinRFC = new Factura(1500.0, "Reparación de equipo", null);

        // Mostrar ambas facturas
        System.out.println(facturaConRFC.getResumen());
        System.out.println(facturaSinRFC.getResumen());
    }
}
