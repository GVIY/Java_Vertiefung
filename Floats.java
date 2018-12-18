public class Floats{
  private float[] werte;
  private float kleinstes;

//Konstruktor
  public Floats(float[] werte){
    this.werte = werte;
  }

  public float kleinere(float x,float y){
    if(Math.abs(x) < Math.abs(y))
      return x;
    else
      return y;
  }

 //Die Methode soll von aussen sichtbar sein
  public void setKleinstes(){
    //Arrayzustand pruefen
    if(this.werte.length == 0){
      System.out.println("Array werte ist leer.");
    }else if(this.werte.length == 1){
      this.kleinstes = werte[0];
    }else{
      this.kleinstes = this.werte[0];
       //Kleinstes Wert mit for-schleife aussuchen
      for(int i =0;i < this.werte.length;i++){
          this.kleinstes = kleinere(werte[i],this.kleinstes);
      }
    }
  }
  //Die Methode soll von aussen sichtbar sein
  public void ausgabeRekursiv(int i){
     //Indexgueltigkeit pruefen
    if(i+1 > this.werte.length){
      System.out.println("Falsch Index");
    }
      //Endzustand
    if(i+1 == this.werte.length){
      System.out.println(this.werte[i]);
    }
    else{
      System.out.println(werte[i]);
        ausgabeRekursiv(i+1);
    }

  }
}
