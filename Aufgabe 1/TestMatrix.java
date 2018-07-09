class TestMatrix {
  public static void main(String[] args){
    String[][] str = new String[][]{
      {"ab","abc"},
      {"abcd","abcde"}
    };

    Matrix<String> m = new Matrix<String>(str);

    // die Anzahl der Matrix-Zeilen und -Spalten geben
    System.out.println("Die Matrix hat " + m.getNumRows() + " Zeile und " + m.getNumCols() + " Spalten");
    //Matrix-Element ändern
    System.out.println("Das zuaendern Element ist "+ m.get(0,0));
    m.set("ba",0,0);
    System.out.println("Das geaendert Element ist " + m.get(0,0));
    System.out.println("Die Komplette Matrix:");
    System.out.println();
    for(int i = 0;i<m.getNumRows();i++){
      for(int j = 0;j < m.getNumCols() ; j++){
        System.out.print(m.get(i,j)+" ");
      }
      System.out.println();
    }



  }
}
