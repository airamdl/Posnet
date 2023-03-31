/**
 * Clase Main
 */
public class Main {
    /**
     * @author airamdl
     */
    public static void main(String[] args) {
        System.out.println();
        Postnet postnet = new Postnet();
        Titular t = new Titular("Roberto", "de león", "9845877E", "631954837","robertdl2001@gmail.com");
        TarjetaCredito tarjetaCredito= new TarjetaCredito("FakeBank", "12255533344", 14000, EntidadFinanciera.BIRZA, t );

        System.out.println("Tarjeta antes del pago");
        System.out.println(tarjetaCredito);
        System.out.println();
        Ticket tickedGenerado = postnet.efectuarPago(tarjetaCredito, 10000, 5);
        System.out.println("Ticket generado...");
        System.out.println(tickedGenerado);

        System.out.println("Tarjeta después del pago");
        System.out.println(tarjetaCredito);

        
    }
}
