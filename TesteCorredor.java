public class TesteCorredor {

  public static void main(String[] args) {
    Thread corredor1 = new Thread (new Corredor(Thread.currentThread()), "Senna");
    Thread corredor2 = new Thread (new Corredor(Thread.currentThread()), "Barrichello");
    Thread corredor3 = new Thread (new Corredor(Thread.currentThread()), "Mansell");
    Thread corredor4 = new Thread (new Corredor(Thread.currentThread()), "Piquet");
    Thread corredor5 = new Thread (new Corredor(Thread.currentThread()), "Hill");
    corredor1.start();
    corredor2.start();
    corredor3.start();
    corredor4.start();
    corredor5.start();
    System.out.println("Está valendo!!");
  }
}
