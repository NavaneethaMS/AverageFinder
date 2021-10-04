package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Map {

    public static void main(String[] args)
    {
        HashMap<Integer,String> hmap=new HashMap<Integer,String>();
        hmap.put(1,"abc");
        hmap.put(2,"def");
        hmap.put(4,"dar");
        hmap.put(3,"abc");
       // hmap.put(3,"bhj");
        hmap.put(1,"abc");
        System.out.println("hmap="+hmap);
        Set set=hmap.entrySet();
        Iterator itr=set.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }


    }
}
