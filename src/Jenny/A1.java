package Jenny;

import java.util.*;

public class A1 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
       /* things.put("Drinks", "Coffee");
        things.put("Animal","Koala");
        things.put("Car","Audi");

        //prints all the keys
        for (String i : things.keySet()){
            System.out.println(i);
        }
        //print all the values
        for(String i : things.values()){
            System.out.println(i);*/
        map.put(1, "English");
        map.put(2, "German");
        map.put(3, "Spanish");
        map.put(4, "Cantonese");
        System.out.println("Print");
        map.forEach((key, value) -> System.out.println(key + "" + value));
    }
}

