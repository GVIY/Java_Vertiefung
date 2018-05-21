public class SortierenQuicksort {
    //Attribute zum Zaehlen der swap() und compareTo() Methoden
    private static int countTausch;
    private static int countCompare;
    //Aufruf quicksortAlgorithmus und Ausgabe der Haeufigkeit der Methoden
    public static void quickSort(Comparable[] f) {
        countCompare = 0;
        countTausch = 0;
        quicksortAlgo(f, 0, f.length-1);
        System.out.println("Die Methode compareTo() wurde " + countCompare + " mal aufgerufen.");
        System.out.println("Die Methode swap() wurde " + countTausch + " mal aufgerufen.");
    }
    //quicksortAlgorithmus und rekursiver Aufruf
    private static void quicksortAlgo(Comparable[] f, int low, int high) {
        if (high <= low) {
            return;
        } else {
            int part;
            part = partition(f, low, high);
            quicksortAlgo(f, low, part-1);
            quicksortAlgo(f, part+1, high);
        }
    }

    private static int partition(Comparable[] f, int low, int high) {
        int part = low;
        int pivot = getZufallsIndex(f, low, high);   // Wahl des Pivot.
        Comparable pivotElement = f[pivot];
        swap(f, pivot, high);     //Pivot am Ende des Arrys einsetzen.
        countTausch++;
        for (int i = low; i<high; i++) {      //Partitionieren
            if (f[i].compareTo(pivotElement) < 0) {
                swap(f, part, i);
                part++;
                countTausch++;
            }
            countCompare++;
        }
        swap(f, part, high);
        countTausch++;
        return part;
    }
    //Methode findet zufaelligen Index
    private static int getZufallsIndex(Comparable[] f, int x, int y) {
        int anzEl = y-x+1;
        int zufallszahl = (int) (Math.random()*anzEl);
        return x+zufallszahl;               //Pivotindex = Startindex + Zufallsindex
    }
    //Methode tauscht zwei Elemente eines Arrays
    private static void swap(Comparable[] f, int x, int y) {
        Comparable temp = f[x];
        f[x] = f[y];
        f[y] = temp;
    }
}
