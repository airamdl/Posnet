public class Postnet {
    public static final double RECARGA_POR_CUOTA = 0.03;
    public static final int MIN_CANT_CUOTAS = 1;
    public static final int MAX_CANT_CUOTAS = 6;


    /**
     *
     * @param tarjetaCredito
     * @param montoAAbonar
     * @param cantCuotas
     * @return ticket
     */
    public Ticket efectuarPago(TarjetaCredito tarjetaCredito, double montoAAbonar, int cantCuotas) {
        /**
         * @author Airamdl
         *
         */
        Ticket ticket= null;
        if (datosValidos(tarjetaCredito, montoAAbonar, cantCuotas)){
            double montoFinal=montoAAbonar+montoAAbonar*recargoSegunCuotas(cantCuotas);
            if (tarjetaCredito.tieneSaldoDisponible(montoFinal)){
                tarjetaCredito.descontar(montoFinal);
                String nomApe= tarjetaCredito.nombreCompletoDelTitular();
                double montoPorCuota=montoFinal/cantCuotas;
                ticket =new Ticket(nomApe,montoFinal,montoPorCuota);
            }
        }
        return ticket;
    }

    /**
     *
     * @param tarjetaCredito
     * @param monto
     * @param cant
     * @return boolean que todos los parámetros sean true
     */
    private boolean datosValidos(TarjetaCredito tarjetaCredito, double monto, int cant){
        boolean esTarjetaValida= tarjetaCredito != null;
        boolean esMontoValido= monto>0;
        boolean cantCuotaValida= cant >=MIN_CANT_CUOTAS && cant <= MAX_CANT_CUOTAS;
        return esTarjetaValida&&esMontoValido&&cantCuotaValida;
    }

    /**
     *
     * @param cantCuotas
     * @return double El cargo según las cuotas elegidas
     */
    private double recargoSegunCuotas(int cantCuotas){
        return (cantCuotas-1)* RECARGA_POR_CUOTA;
    }


}
