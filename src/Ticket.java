public class Ticket {
    /**
     * @author airam
     */
    private String nombreApellidos;
    private double montoTotal;
    private double montoPorCuota;

    /**
     *
     * @param nombreApellidos
     * @param montoTotal
     * @param montoPorCuota
     */
    public Ticket(String nombreApellidos, double montoTotal, double montoPorCuota){
        this.nombreApellidos= nombreApellidos;
        this.montoTotal=montoTotal;
        this.montoPorCuota=montoPorCuota;

    }

    /**
     *
     * @return double monto por cuota
     */
    public double getMontoPorCuota() {
        return montoPorCuota;
    }

    /**
     *
     * @param montoPorCuota
     */
    public void setMontoPorCuota(double montoPorCuota) {
        this.montoPorCuota = montoPorCuota;
    }

    /**
     *
     * @return String devuelve nombre y apellidos
     */
    public String getNombreApellidos() {
        return nombreApellidos;
    }

    /**
     *
     * @param nombreApellidos
     */
    public void setNombreApellidos(String nombreApellidos) {
        this.nombreApellidos = nombreApellidos;
    }

    /**
     *
     * @return double Nos devuelve la cantidad total
     */
    public double getMontoTotal() {
        return montoTotal;
    }

    /**
     *
     * @param montoTotal
     */
    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

}
