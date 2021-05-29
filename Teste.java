public class Teste {
  public static void main(String[] args) {
    System.out.println(Thread.currentThread().getName());
    System.out.println("Começou o método main...");
    MinhaPrimeiraThread thread = new MinhaPrimeiraThread();
    //thread.run();
    thread.start();
    System.out.println("Terminou o método main...");
  }
}
