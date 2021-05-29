public class MinhaPrimeiraThread extends Thread{
  public void run(){
    System.out.println(Thread.currentThread().getName());
    System.out.println("Estou sendo executado por um thread diferente da principal");
  }
}