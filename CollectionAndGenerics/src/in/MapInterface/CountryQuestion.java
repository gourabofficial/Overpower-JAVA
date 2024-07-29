package in.MapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryQuestion {
    public static void main(String[] args) {
        Map <String,String> country = new HashMap<>();
        country.put("India","New Delhi");
        country.put("Japan","Tokyo");
        country.put("England","London");
        country.put("France","Paris");
        country.put("Banladesh","Dhaka");

        System.out.print("plesae enter the country " +
                "name to get the capital city: ");
        Scanner sc = new Scanner(System.in);
        String countryName = sc.nextLine();

        if(country.containsKey(countryName)){
            System.out.println("The capital of " + countryName + " is " + country.get(countryName));
        }else{
            System.out.println("The country is not in the list");
        }
    }
}
