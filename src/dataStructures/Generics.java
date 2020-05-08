package dataStructures;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        //example without Generics
        List names = new ArrayList();
        names.add("Mira");
        String name = (String) names.get(0);
        System.out.println("First Name:" + name);

        //example with Generics
        List<String> names2 = new ArrayList<>();
        names2.add("Mira");
        String name2 = names2.get(0);
        System.out.println("First Name: " + name2);
    }
}
