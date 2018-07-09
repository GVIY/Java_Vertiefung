import java.util.LinkedList;

public class Queue<T>{
  private LinkedList<T> list;

  //Konstruktor
  public Queue(LinkedList<T> list){
    this.list = list;
  }

  public void enqueue(T elem){
    list.addLast(elem);
  }

  public T dequeue(){
    return list.pollFirst();
  }

  public T peek(){
    return list.peekFirst();
  }
}
