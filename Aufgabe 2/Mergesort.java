public class Mergesort {
  //Methode,die Zusammenfügensverfahren von Mergesort führen
  public static void merge(int[] a,int[] b,int start,int end,int p){
    int i = start;
    int j = p;
    for(int k = start;k <= end;k++){
      if(i <= p-1 && j <= end){
        if(a[i] <= a[j])
          b[k] = a[i++];
        else
          b[k] = a[j++];
      }
      else{
        if(i <= p-1)
          b[k] = a[i++];
        else
          b[k] = a[j++];
      }

    }
    for(int k = start;k <= end;k++){
      a[k] = b[k];
    }
  }

  //Mrthode, die Mergesort rekuresiv aufrufen
  public static void mergesort(int[] a,int[] b,int start,int end){
    if(start < end){
    int p = (start + end +1)/2;
    mergesort(a,b,start,p-1);
    mergesort(a,b,p,end);
    merge(a,b,start,end,p);
  }
}



    // von aussen zugreifbare Sortier-Methode
    public static void sort(int[] a) {
      int[] b = new int[a.length];
      mergesort(a,b,0,a.length - 1);
    }
}
