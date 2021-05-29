public class CondicaoDeCorrida {
  public static void main(String[] args) throws InterruptedException {
    Atualizador atualizador = new Atualizador();
    Thread t1 = new Thread(atualizador);
    Thread t2 = new Thread(atualizador);
    t1.start();
    t2.start();
    t1.join();
    t2.join();
    System.out.println("Resultado: " + atualizador.variavel);
  }
}
