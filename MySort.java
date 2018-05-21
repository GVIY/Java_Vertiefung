public class MySort {
    //Selection Sort Algorithmus plus Ausgabe der Haeufigkeit der Methoden
    public static void mySort(Comparable[] f) {
        int countTausch = 0;
        int countCompare = 0;
        for (int i = 0; i<=f.length-1; i++) {
            int minIndex = i;
            for (int select = i+1; select<=f.length-1; select++) {
                if (((Film)f[select]).compareTo(f[minIndex]) < 0) {
                    minIndex = select;
                }
                countCompare++;
            }
            swap(f,i,minIndex);
            countTausch++;
        }
        System.out.println("Die Methode compareTo() wurde " + countCompare + " aufgerufen.");
        System.out.println("Die Methode swap() wurde " + countTausch + " aufgerufen.");
    }
    //Methode tauscht zwei Elemente eines Arrays
    private static void swap(Comparable[] f, int i, int min) {
        Comparable temp = f[i];
        f[i] = f[min];
        f[min] = temp;
    }
}
