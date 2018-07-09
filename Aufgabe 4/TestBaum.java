public class TestBaum{
  public static void main(String[] args){
    String[] test = {"O","G","N","C","F","J","M","A","B","D","E","H","I","K","L"};

    Baum b = new Baum(test);
    System.out.println();
    System.out.println("Inorder:");
    b.printInorder();
    System.out.println();
    System.out.println("Preorder:");
    b.printPreorder();
    System.out.println();
    System.out.println("Postorder:");
    b.printPostorder();
  }
}
