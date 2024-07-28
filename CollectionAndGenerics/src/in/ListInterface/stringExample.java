package in.ListInterface;

import java.util.ArrayList;
import java.util.List;

public class stringExample {
    public static void main(String[] args) {
        List<Integer> integer = new ArrayList<>();
        integer.add(1);
        integer.add(2);
        integer.add(3);
        integer.add(4);
        integer.add(5);
        integer.add(6);
        integer.add(7);

        for (Integer i : integer) {
            System.out.println("After Removing The list is : " +i);
        }

        System.out.println();
        System.out.println("The size of the list is : " +integer.size());
        System.out.println();

        System.out.println("Remove Element: " + integer.remove(0) + " at index 0 ");
        System.out.println("Remove Element: " + integer.remove(0) + " at index 1");
        System.out.println("Remove Element: " + integer.remove(0)+ " at index 2");
        System.out.println("Remove Element: " + integer.remove(0)+ " at index 3");

        System.out.println();
        for (Integer j : integer) {
            System.out.println("After Removing The list is : " +j);
        }




    }
}
