package in.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class mapExample {
    public static void main(String[] args) {
        Map<String , Integer> map = new HashMap<>();
        map.put("gourab",7);
        map.put("Budda", 10);
        map.put("Rahul", 12);
        map.put("Sourav",8);
        map.put("krishna",6);
        map.put("pallabi",7);

        System.out.println(map);
        System.out.println(map.get("gourab"));
        System.out.println(map.size());
        System.out.println(map.keySet());


        for(String s : map.keySet()){
            System.out.printf("%s : %d\n",s,map.get(s));
        }
        System.out.println();
        System.out.println("remover number : " +map.remove("pallabi"));
        System.out.println("Ater removeing the map size: " +map.size());
//        for(Integer value : map.values()){
//            System.out.println(value);
//        }
    }
}
