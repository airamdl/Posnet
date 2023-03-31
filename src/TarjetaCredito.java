/**
 * @author Airam
 */
public class TarjetaCredito {
   private String entidadBancaria;
   private String numero;
   private double saldo;
   private EntidadFinanciera entidadFinanciera;
   private Titular titular;

   /**
    *
    * @param entidadBancaria
    * @param numero
    * @param saldo
    * @param entidadFinanciera
    * @param titular
    */

   public TarjetaCredito(String entidadBancaria, String numero, double saldo, EntidadFinanciera entidadFinanciera, Titular titular) {
      this.entidadBancaria = entidadBancaria;
      this.numero = numero;
      this.saldo = saldo;
      this.entidadFinanciera = entidadFinanciera;
      this.titular = titular;
   }

   /**
    *
    * @return String datos de la tarjeta de crédito
    */
   @Override
   public String toString(){
      return "TarjetadeCredito{"+"entidadBancaria="+ entidadBancaria + ", numero="+numero+", saldo="+saldo + ", entidadFinanciera="+entidadFinanciera+", titular=" + titular + "}";
   }

   /**
    *
    * @param montoFinal
    * @return boolean comprueba si el saldo es mayor o igual al monto final
    */
   public boolean tieneSaldoDisponible(double montoFinal){
      return saldo>=montoFinal;
   }

   /**
    *
    * @param monto
    */
   public void descontar(double monto){
      saldo=saldo-monto;
   }

   /**
    *
    * @return String devuelve el nombre completo del titular
    */
   public String nombreCompletoDelTitular(){
      return titular.nombreCompleto();
   }

}
