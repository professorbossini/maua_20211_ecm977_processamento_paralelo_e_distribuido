public class Corredor implements Runnable{
  private static final double distanciaTotalDaCorrida = 200;
  private double distanciaTotalPercorrida = 0;
  private Thread main;
  public Corredor(Thread main){
    this.main = main;
  }
  @Override
  public void run() {
    try{
      main.join();
    }
    catch (InterruptedException e){
      e.printStackTrace();
    }
    while (distanciaTotalPercorrida <= distanciaTotalDaCorrida){
      distanciaTotalPercorrida += Math.random() * 20;
      System.out.printf("%s: %.2fm\n", Thread.currentThread().getName(), distanciaTotalPercorrida);
      if (distanciaTotalPercorrida > distanciaTotalDaCorrida){
        System.out.printf("%s acabou.", Thread.currentThread().getName());
      }
      else{
        //cláusula catch or declare
        try{
          Thread.sleep(2000 + (int)Math.random() * 10000);
        }
        catch (InterruptedException e){
          e.printStackTrace();
        }
      }

    }
  }  
  
}
