import java.util.Iterator;

public class TestMatrixIterators{

  public static void main(String[] args){

    Matrix<Character> test1 = new Matrix<Character>(new Character[][] {{'a','b'},{'c','d'},{'e','f'},{'g','h'}});
    test1.setIteratorMode('b');
    Iterator<Character> i = test1.iterator();
    System.out.println("Backward-Iterator mit while-Schleife testen.");
    while(i.hasNext()){
      Character c = i.next();
      System.out.print("|"+c+"| ");
    }

    System.out.println();


    Integer[][] testM = {{1,2,3,4,5},{6,7,8,9,10}};
    Matrix<Integer> test2 = new Matrix<Integer>(testM);

    System.out.println("Forward-Iterator mit for-each-Schleife testen.");
    for(Integer a : test2){
      System.out.print("|"+a+"| ");
    }

  }
}
