package Collections;

import java.util.HashSet;
import java.util.Set;

public class SetClass {

    public static void main(String[] args){
        Set<Integer> set1 = new HashSet<Integer>();
        set1.add(1);
        set1.add(12);
        set1.add(44);
        set1.add(0);

        for(int i: set1){
            System.out.println(i);
        }
        set1.forEach((str) -> System.out.println(str));

    }
}
