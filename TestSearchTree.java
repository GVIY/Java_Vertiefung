public class TestSearchTree{
    public static void main(String[] args){
        SearchTree<String> tree = new SearchTree<String>();

        // 1-elementiger Baum
        System.out.println("----------------\n");
        System.out.println("1-elementiger Baum");
        tree.add(4,"Donnerstag");
        int n = 6;
        System.out.println("Baum:\n"+tree);
        System.out.println("Anzahl der Knoten < "+n+": "+ tree.countSmaller(n));
        System.out.println("Delete Knoten < "+n+":");
        tree.deleteSmaller(n);
        System.out.println(tree);

        // leerer Baum
        System.out.println("----------------\n");
        System.out.println("leerer Baum");
        n = 4;
        System.out.println("Baum:\n "+tree);
        System.out.println("Anzahl der Knoten < "+n+": "+ tree.countSmaller(n));
        System.out.println("Delete Knoten < "+n+":");
        tree.deleteSmaller(n);
        System.out.println(tree);

        // >= 6 Elementen
        System.out.println("----------------\n");
        System.out.println("mehrelementiger Baum");

        // Ihr Code
        tree.add(5,"AA");
        tree.add(4,"BB");
        tree.add(1,"CC");
        tree.add(6,"DD");
        tree.add(7,"EE");
        tree.add(9,"FF");

        System.out.println("Baum:\n"+tree);
        n = 6;
        System.out.println("Anzahl der Knoten < "+n+": "+ tree.countSmaller(n));
        System.out.println("Delete Knoten < "+n+":");
        tree.deleteSmaller(n);
        System.out.println(tree);
    }
}
