package Collections;

import java.util.ArrayList;
import java.util.List;

public class ListClass {

    public static void main(String[] args){
        ArrayList<String> ls = new ArrayList<String>();
        ls.add("abhishek");
        ls.add("gaur");

        for(String str : ls){
            System.out.println(str);
        }
    }


}
