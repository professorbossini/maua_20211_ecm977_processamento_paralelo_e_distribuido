public class Atualizador implements Runnable {
  int variavel = 0;
  @Override
  public void run() {
    for (int i = 1; i <= 10000; i++){
      variavel++;
    }    
  }
}
