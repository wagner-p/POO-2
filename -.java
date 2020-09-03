public class Principal {
   public static void main(String[] args) {
      CaixaEletronico caixa = new CaixaEletronico();
      caixa.verificaFraude();
      caixa.sacar(10);
   }
}