public class TestPotenz{
  public static void main(String[]  args){
    double a1 = 2.2;
    int n1 = 10;
    double a2 = 3;
    int n2 = 0;
    double A1;
    double A2;

    System.out.println("Erast Ergebnis von Math.pow ist "+ Math.pow(a1,n1)+".");
    System.out.println("Zweite Ergebnis von Math.pow ist "+ Math.pow(a2,n2)+".");
    System.out.println();

    Potenz A3 = new Potenz();

    System.out.println("Erast Ergebnis von potenzIterativ ist "+ A3.potenzIterativ(a1,n1)+".");
    System.out.println("Zweite Ergebnis von potenzIterativ ist "+ A3.potenzIterativ(a2,n2)+".");
    System.out.println();


    System.out.println("Erast Ergebnis von potenzRekursiv ist "+ A3.potenzRekursiv(a1,n1)+".");
    System.out.println("Zweite Ergebnis von potenzRekursiv ist "+ A3.potenzRekursiv(a2,n2)+".");
    System.out.println();
    }
}
