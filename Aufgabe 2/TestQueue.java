import java.util.LinkedList;
public class TestQueue{
  public static void main(String[] args){
    LinkedList<Integer> test = new LinkedList<Integer>();
    Queue<Integer> q = new Queue<Integer>(test);

    System.out.println("Einfuegen");
    q.enqueue(1);
    System.out.println("Das oberste Element des Stacks ist "+q.peek()+".");
    q.enqueue(2);
    System.out.println("Das oberste Element des Stacks ist "+q.peek()+".");
    q.enqueue(3);
    System.out.println("Das oberste Element des Stacks ist "+q.peek()+".");
    q.enqueue(4);
    System.out.println("Das oberste Element des Stacks ist "+q.peek()+".");
    q.enqueue(5);
    System.out.println("Das oberste Element des Stacks ist "+q.peek()+".");
    q.enqueue(6);


    System.out.println("Loeschen");
    System.out.println("Entfernt vom Queue :"+q.dequeue()+".");
    System.out.println("Das oberste Element des Stacks ist "+q.peek()+".");
    System.out.println("Entfernt vom Queue :"+q.dequeue()+".");
    System.out.println("Das oberste Element des Stacks ist "+q.peek()+".");
    System.out.println("Entfernt vom Queue :"+q.dequeue()+".");
    System.out.println("Das oberste Element des Stacks ist "+q.peek()+".");
    System.out.println("Entfernt vom Queue :"+q.dequeue()+".");
    System.out.println("Das oberste Element des Stacks ist "+q.peek()+".");
    System.out.println("Entfernt vom Queue :"+q.dequeue()+".");
    System.out.println("Das oberste Element des Stacks ist "+q.peek()+".");
    System.out.println("Entfernt vom Queue :"+q.dequeue()+".");
    System.out.println("Das oberste Element des Stacks ist "+q.peek()+".");
    System.out.println("Entfernt vom Queue :"+q.dequeue()+".");
    System.out.println("Das oberste Element des Stacks ist "+q.peek()+".");
  }
}
