public class TestFloats{
  public static void main(String[] args){
    //Object-Array initizialisiern
    Floats[] a = new Floats[10];
    //for-schleife  der Instanziierung der Float-Objekte
    for(int i = 0;i < 10;i++){
      //drei-elementiges float-Array erzeugen
      float[] b = {1.1f + i,-i*9.5f,10-i+0.1f*i*i};
      a[i] = new Floats(b);
    }
    a[a.length-1].ausgabeRekursiv(0);
  }
}
