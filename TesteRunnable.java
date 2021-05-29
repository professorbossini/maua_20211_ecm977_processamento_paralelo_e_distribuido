public class TesteRunnable {
  public static void main(String[] args) {
    Thread thread = new Thread (new MinhaPrimeiraAtividade());
    thread.start();
    System.out.println("Encerrando a thread principal");
  }
}
