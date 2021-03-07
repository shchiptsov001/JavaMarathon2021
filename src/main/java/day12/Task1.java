package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();

        myList.add("Volvo");
        myList.add("BMW");
        myList.add("Toyota");
        myList.add("Mercedes");
        myList.add("Nissan");

        System.out.println(myList);

        myList.add(2,"Audi");

        myList.remove(0);

        System.out.println(myList);
    }
}
