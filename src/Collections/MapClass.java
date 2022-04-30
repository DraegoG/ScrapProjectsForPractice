package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapClass {
    public static void main(String[] args){
        Map<Integer, String> mapImpl = new HashMap<>();
        mapImpl.put(1,"abhishek");
        mapImpl.put(2, "abhinav");
        mapImpl.put(3, "shreya");

        mapImpl.forEach((key, value) -> System.out.println("key: "+ key + " value: "+ value));
    }
}
