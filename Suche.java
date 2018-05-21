public class Suche{

   public static int binaereSuche(Film suchObjekt, Film[] array){
     int index = -1;
     int start = 0;
     int end = array.length - 1;
     int s;

     while(index == -1 && start <= end){
       s = (end + start)/2;
       if( suchObjekt.compareTo(array[s]) == 0){
         index = s;
       }
       else if(suchObjekt.compareTo(array[s]) < 0)
         end = s-1;
       else
        start = s + 1;
     }
     return index;
   }
}
