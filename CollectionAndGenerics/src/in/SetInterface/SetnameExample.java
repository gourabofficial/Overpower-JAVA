package in.SetInterface;

import java.util.HashSet;
import java.util.Set;

public class SetnameExample {
    public static void main(String[] args) {
        Set<String> name = new HashSet<>();
        name.add("Gourab");
        name.add("Ganguly");
        name.add("Sourav");
        name.add("Budda");
        name.add("Rahul");
        name.add("Debesh");

        System.out.println("Set size: " + name.size());

        for (String i : name) {
            System.out.println("The name is: " + i);
        }

        System.out.println();

        if (name.contains("Rahul")) {
            System.out.println("Removed: " + name.remove("Rahul"));
        } else {
            System.out.println("No Rahul");
        }
        System.out.println("Set size: " + name.size());

        System.out.println();

        if (name.contains("Debesh")) {
            System.out.println("Removed: " + name.remove("Debesh"));
        } else {
            System.out.println("No Debesh");
        }
        System.out.println("Set size: " + name.size());

        for (String i : name) {
            System.out.println("The name is: " + i);
        }
    }
}
