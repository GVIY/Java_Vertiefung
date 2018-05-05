public class Auto implements Transportmittel{
  private float geschwindigkeit;

  //Konstruktor
  public Auto(float g){
    if(g < -50 || g > 100)
      geschwindigkeit = 0;
    else
      geschwindigkeit = g;
  }

  // Getter
  public float getGeschwindigkeit(){
    return geschwindigkeit;
  }

  public void beschleunigen(float geschwindigkeit){
    if(this.geschwindigkeit + geschwindigkeit >= -50 && this.geschwindigkeit +geschwindigkeit <= 100)
      this.geschwindigkeit += geschwindigkeit;
    else{
      System.out.println("Das Auto darf vorwaerts nicht schneller als 100 km/h und rueckwaerts nicht schneller als 50 km/h fahren.");
    }
  }



}
