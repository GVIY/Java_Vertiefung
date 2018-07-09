public class Stack{
  private Film[] arr;

  //Konstruktor
  public Stack(){
    arr = new Film[4];
  }

  //Methoden

  public void push(Film f){
  //kapazitaet ueberpruefen
  // doppelt so großes Array erzeugen.
    if(arr[arr.length-1] !=null){
      Film[] temp = new Film[arr.length*2];
      for(int i = 0;i < arr.length;i++){
        temp[i] = arr[i];
      }
      int slot = arr.length;
      arr = temp;
      arr[slot] = f;
    }else{
      int slot = 0;
  //frei Platz suchen
      while(arr[slot] != null){
        slot++;
        }
      arr[slot] = f;
        }
    }


    public Film pop(){
  //leer array ueberpruefen
    if(arr[0] == null){
      System.out.println("Leer Array!");
      return null;
  }
  //oberste Filmobjekt suchen
    else{
        int slot = 0;
        while(slot < arr.length && arr[slot] !=null){
          slot++;
        }
        Film temp = arr[slot -1];
        arr[slot -1] = null;
        return temp;
      }
    }

    public Film top(){
      //leer array ueberpruefen
        if(arr[0] == null){
          System.out.println("Leer Array!");
          return null;
      }
      //oberste Filmobjekt suchen
        else{
            int slot = 0;
            while(slot < arr.length && arr[slot] !=null){
              slot++;
            }
        return arr[slot - 1];
      }
    }


}
