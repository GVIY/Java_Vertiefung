public class TestMergesort {
  public static void main(String[] args){
    int[] a = new int[]{3,2,6,1,4,5};
    System.out.println("Die zusortierende Array ist:");

    for(int i = 0; i < a.length; i++){
      System.out.print(a[i] + " ");
    }
    System.out.println();
    
    Mergesort.sort(a);
    System.out.println("Die sortierte Array ist:");
    for(int i = 0; i < a.length; i++){
      System.out.print(a[i] + " ");
    }
  }

}
