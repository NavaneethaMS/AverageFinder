package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class List
{
public static void main(String[] args) {

    ArrayList<Integer> temp2=new ArrayList<Integer>();
    ArrayList<String> temp = new ArrayList<String>();
    temp.add("Ravi");
    temp.add("teja");
    temp.add("Laks");
    temp2.add(1);
    temp2.add(2);
    temp2.add(3);
    temp2.clone();
    System.out.println("Arraylist=" + temp);
    System.out.println("Integer Arraylist=" + temp2);
    Iterator itr=temp.iterator();
    while(itr.hasNext())
    {
        System.out.println(itr.next());
    }
    LinkedList<String> al=new LinkedList<String>();
    al.add("Ravi");
    al.add("Vijay");
    al.add("Ravi");
    al.add("Ajay");
    Iterator<String> itr2=al.iterator();
    while(itr2.hasNext()){
        System.out.println(itr2.next());
    }

}
}
