public class TarjetaCredito {
   private String entidadBancaria;
   private String numero;
   private double saldo;
   private EntidadFinanciera entidadFinanciera;
   private Titular titular;

   public TarjetaCredito(String entidadBancaria, String numero, double saldo, EntidadFinanciera entidadFinanciera, Titular titular) {
      this.entidadBancaria = entidadBancaria;
      this.numero = numero;
      this.saldo = saldo;
      this.entidadFinanciera = entidadFinanciera;
      this.titular = titular;
   }
   @Override
   public String toString(){
      return "TarjetadeCredito{"+"entidadBancaria="+ entidadBancaria + ", numero="+numero+", saldo="+saldo + ", entidadFinanciera="+entidadFinanciera+", titular=" + titular + "}";
   }
   public boolean tieneSaldoDisponible(double montoFinal){
      return saldo>=montoFinal;
   }

   public void descontar(double monto){
      saldo=saldo-monto;
   }
   public String nombreCompletoDelTitular(){
      return titular.nombreCompleto();
   }

}
