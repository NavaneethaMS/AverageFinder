package Collections;
import java.util.*;
public class Set {


        public static void main(String args[]){

           HashSet<String> set=new HashSet<String>();
            set.add("Ravi");
            set.add("Vijay");
            set.add("Ravi");
            set.add("Ajay");

            Iterator<String> itr=set.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
           /* LinkedHashSet<String> set=new LinkedHashSet<String>();
            set.add("Ravi");
            set.add("Vijay");
            set.add("Ravi");
            set.add("Ajay");
            Iterator<String> itr=set.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }*/
          /*  TreeSet<String> set1=new TreeSet<String>();
            set1.add("Ravi");
            set1.add("Vijay");
            set1.add("Ravi");
            set1.add("Ajay");

            Iterator<String> itr2=set1.iterator();
            while(itr2.hasNext()){
                System.out.println(itr2.next());
            }*/
        }
    }
