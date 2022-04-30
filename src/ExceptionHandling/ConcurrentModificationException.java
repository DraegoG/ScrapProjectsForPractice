package ExceptionHandling;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ConcurrentModificationException {
    public static void main(String[] args){
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"abhi");
        map.put(2,"anki");
        map.put(3,"kamal");

        Iterator<Integer> itr = map.keySet().iterator();

        while(itr.hasNext()){
            int key = itr.next();
            System.out.println(map.get(key));
            if(key==2){
//                map.remove(2);  //this causes ConcurrentModificationException
                itr.remove();
            }
        }
        System.out.println(map.size());
    }
}
