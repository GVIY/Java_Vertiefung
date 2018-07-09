public class TestStack{
  public static void main(String[] args){
    Stack stack = new Stack();
    Film a = new Film("A",10,1,"a","1901");
    Film b = new Film("B",20,2,"b","1902");
    Film c = new Film("C",30,3,"c","1903");
    Film d = new Film("D",40,4,"d","1904");
    Film e = new Film("E",50,5,"e","1905");

    System.out.println("Einfuegen");

    stack.push(a);
    System.out.println("Das oberste Element des Stacks ist "+stack.top().toString());
    stack.push(b);
    System.out.println("Das oberste Element des Stacks ist "+stack.top().toString());
    stack.push(c);
    System.out.println("Das oberste Element des Stacks ist "+stack.top().toString());
    stack.push(d);
    System.out.println("Das oberste Element des Stacks ist "+stack.top().toString());
    stack.push(e);
    System.out.println("Das oberste Element des Stacks ist "+stack.top().toString());

    System.out.println();

    Film test;
    System.out.println("loeschen");
    System.out.println("Das oberste Element des Stacks ist: ");
    test = stack.pop();
    if(test != null)
    System.out.println(test.toString());
    System.out.println("Das oberste Element des Stacks ist ");
    test = stack.pop();
    if(test != null)
    System.out.println(test.toString());
    System.out.println("Das oberste Element des Stacks ist ");
    test = stack.pop();
    if(test != null)
    System.out.println(test.toString());
    System.out.println("Das oberste Element des Stacks ist ");
    test = stack.pop();
    if(test != null)
    System.out.println(test.toString());
    System.out.println("Das oberste Element des Stacks ist ");
    test = stack.pop();
    if(test != null)
    System.out.println(test.toString());
    System.out.println("Das oberste Element des Stacks ist ");
    test = stack.pop();
    if(test != null)
    System.out.println(test.toString());
    System.out.println();

    System.out.println("top-Methode beim leerem Array testen:");
    stack.top();
  }
}
