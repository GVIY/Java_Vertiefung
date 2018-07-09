public class TestLinkedList{

    // Bekommt eine LinkedList uebergeben und printet alle ELemente auf die Konsole
    public static void printList(LinkedList list) {
    	if(list.isEmpty())
        System.out.println("Das uebergeben list ist leer");
        for(int i = 0;i < list.size();i++){
          System.out.println(list.get(i).toString());
        }
    }

    // Bekommt eine LinkedList und einen Index uebergeben und entfernt (und printet)
    // aus der LinkedList das Element an Index i. Gibt ggf. eine Fehlermeldung aus.
    public static void removeAtIndex(LinkedList list, int index) {
      Film temp = list.remove(index);
      if(temp == null)
        System.out.println("Das gegebenen Index ist nicht gefunden");
      else
        System.out.println("Das geloescht Element ist " + temp.toString());
    }


    // Testet die statischen Methoden sowie die Listenmethoden direkt
    public static void main(String[] args){
        LinkedList filme = new LinkedList();
        Film a = new Film("A",1,1,"eins","201801");
        Film b = new Film("B",2,2,"zwei","201802");
        Film c = new Film("C",3,3,"drei","201803");
        Film d = new Film("D",4,4,"vier","201804");
        Film aa = new Film("AA",11,11,"einseins","20180101");
        Film bb = new Film("BB",22,22,"zweizwei","20180202");
        Film cc = new Film("CC",33,33,"dreidrei","20180303");
        Film dd = new Film("DD",44,44,"viervier","20180404");
        filme.addHead(a);
        filme.addTail(b);
        filme.add(c,2);
        filme.add(d,3);

        printList(filme);

        System.out.println("Das head-Element ist "+filme.getHead().toString());
        System.out.println("Das tail-Element ist "+filme.getTail().toString());
        System.out.println("Das Element mit index 1 ist "+filme.get(1).toString());
        System.out.println("Das Element mit index 2 ist "+filme.get(2).toString());


        System.out.println("Das Element aa wird auf head eingeseten.");
        filme.addHead(aa);
        System.out.println("Das Element dd wird auf tail eingeseten.");
        filme.addTail(dd);
        System.out.println("Das Element bb wird auf index 2 eingeseten.");
        filme.add(bb,2);
        System.out.println("Das Element cc wird auf index 4 eingeseten.");
        filme.add(cc,4);

        System.out.println("Das geaendert List ist ");
        printList(filme);



        System.out.println("Das head-Element wird entfernt.");
        filme.removeHead();
        System.out.println("Das tail-Element wird entfernt.");
        filme.removeTail();
        System.out.println("Das Element auf index 1 wird entfernt.");
        filme.remove(1);
        System.out.println("Das Element auf index 2 wird entfernt.");
        filme.remove(2);

        System.out.println("Das geaendert List ist ");
        printList(filme);

        System.out.println("Das Element mit inhalt c wird gesucht und der Index ist "+filme.find(c)+".");

        System.out.println("Es gibt jetzt "+filme.size()+" Elemente in der List.");


        System.out.println("Jetzt wir das removeAtIndex-Methode testet.");
        removeAtIndex(filme, 2);



    }

}
