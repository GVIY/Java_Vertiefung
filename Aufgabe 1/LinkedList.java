public class LinkedList {

    //Attribute
    private ListElem head;
    private ListElem tail;

    private class ListElem {
        Film data;
        ListElem next;


        ListElem(Film data) {
            this.data = data;
            this.next = null;
        }

        ListElem(Film data, ListElem next) {
            this.data = data;
            this.next = next;
        }
    }

    //Konstruktor erzeugt eine leere Liste
    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Methoden
    public Film getHead(){
      if(head == null)
        return null;
      return head.data;
    }

    public Film getTail(){
      if(tail == null)
        return null;
      return tail.data;
    }

    public Film get(int pos){
      if(head == null)
        return null;
      ListElem gesucht = head;
      int i;
      for(i = 0;i < pos && gesucht.next != null;i++){
        gesucht = gesucht.next;
      }
      if(i < pos)
        return null;
      return gesucht.data;
    }

     public void addHead(Film val){
       head = new ListElem(val,head);
       if(tail == null)
        tail = head;
     }

     public void addTail(Film val){
       if(head == null){
        head = new ListElem(val,null);
        tail = head;
      }
      else{
        tail.next  = new ListElem(val,null);
        tail = tail.next;
      }
     }


     public void add(Film val, int pos){
       if(head == null){
         addHead(val);
         tail = head;
       }
       else{
       ListElem gesucht = head;
       int i;
       for(i = 0;i < pos-1 && gesucht.next.next != null;i++){
         gesucht = gesucht.next;
       }
       if(i < pos - 1)
         addTail(val);
       else
         gesucht.next = new ListElem(val,gesucht.next);
         }
     }

     public Film removeHead(){
       if(head == null)
        return null;
       ListElem temp;
       temp = head;
       head = head.next;
       if(head == null)
        tail = null;
       temp.next = null;
       return temp.data;

     }

     public Film removeTail(){
       if(head == null)
        return null;
       ListElem temp,gesucht;
       gesucht = head;
       temp = tail;
       if(head == tail){
         head = null;
         tail = null;
         return temp.data;
       }

       while(gesucht.next != temp){
         gesucht = gesucht.next;
       }
       tail = gesucht;
       gesucht.next = null;
       return temp.data;
     }

     public Film remove(int pos){
        if(head == null)
          return null;
        ListElem gesucht = head;
        int i;
        for(i = 0;i < pos-1 && gesucht.next.next != null;i++){
          gesucht = gesucht.next;
        }
        if(i < pos-1)
          return null;
        Film temp = gesucht.next.data;
        gesucht.next = gesucht.next.next;
        return temp;
     }

     boolean isEmpty(){
       if(head == null)
        return true;
      return false;
     }

      public int size(){
        if(isEmpty())
          return 0;
        int i = 1;
        ListElem gesucht = head;
        while(gesucht.next != null){
          i++;
          gesucht = gesucht.next;
        }
        return i;
      }

       public int find(Film obj){
         if(isEmpty())
          return -1;
         int i = 0;
         ListElem gesucht = head;
         while(gesucht.data != obj && gesucht.next != null){
           i++;
           gesucht = gesucht.next;
         }
         if(gesucht.data == obj)
          return i;
        return -1;
       }

}
