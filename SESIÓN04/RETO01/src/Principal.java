public class Principal {
    public static void main(String[] args) {

        // Creamos dos facturas con el mismo folio
        Factura f1 = new Factura("FAC004", "Luis Morales", 1230.00);
        Factura f2 = new Factura("FAC004", "Comercial XYZ", 1230.00);

        // Mostramos ambas facturas con toString()
        System.out.println(f1);
        System.out.println(f2);

        // Comparamos si son iguales usando equals()
        System.out.println("¿Las facturas son iguales?: " + f1.equals(f2));
    }
}

