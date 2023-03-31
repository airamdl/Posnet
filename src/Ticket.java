public class Ticket {
    /**
     * @author airam
     */
    private String nombreApellidos;
    private double montoTotal;
    private double montoPorCuota;

    public Ticket(String nombreApellidos, double montoTotal, double montoPorCuota){
        this.nombreApellidos= nombreApellidos;
        this.montoTotal=montoTotal;
        this.montoPorCuota=montoPorCuota;

    }

    public double getMontoPorCuota() {
        return montoPorCuota;
    }

    public void setMontoPorCuota(double montoPorCuota) {
        this.montoPorCuota = montoPorCuota;
    }

    public String getNombreApellidos() {
        return nombreApellidos;
    }

    public void setNombreApellidos(String nombreApellidos) {
        this.nombreApellidos = nombreApellidos;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

}
