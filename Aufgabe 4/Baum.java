public class Baum{
  private String[] knoten;

  //Konstruktor
  public Baum(String[] knoten){
    this.knoten = knoten;
  }

  public void printInorder(){
    if(knoten[0] != null){
      printInorder(0);
    }
  }

  public void printPreorder(){
    if(knoten[0] != null){
      printPreorder(0);
    }
  }

  public void printPostorder(){
    if(knoten[0] != null){
      printPostorder(0);
    }
  }


  private int getLeftChild(int index){
    return 2*index + 1;
  }

  private int getRightChild(int index){
    return 2*index + 2;
  }

  private void printInorder(int i){
    if(i < knoten.length){
    printInorder(getLeftChild(i));
    System.out.print(knoten[i]);
    printInorder(getRightChild(i));
    }
  }

  private void printPreorder(int i){
    if(i < knoten.length){
    System.out.print(knoten[i]);
    printPreorder(getLeftChild(i));
    printPreorder(getRightChild(i));
    }
  }

  private void printPostorder(int i){
    if(i < knoten.length){
    printPostorder(getLeftChild(i));
    printPostorder(getRightChild(i));
    System.out.print(knoten[i]);
    }
  }

}
