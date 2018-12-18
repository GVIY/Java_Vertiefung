public class TestAuto{
  public static void main(String[] args){
    Auto auto = new Auto(0f);
    for(int i = 0;i < 15;i++){
      auto.beschleunigen(8f);
      System.out.println("Geschwindigkeit: "+auto.getGeschwindigkeit());
    }
  }
}
