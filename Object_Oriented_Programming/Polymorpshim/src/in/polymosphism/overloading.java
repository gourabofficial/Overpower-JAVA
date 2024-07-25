package in.polymosphism;

import java.util.Objects;

public class overloading {
    public void show(int a){
        System.out.println("now i am in a:"+a);
    }
    public void show(String a,String b){
        System.out.println("now i am in a+b: " +a+b);
    }
    public int show(int a,int b){
        int result =a*b;
        System.out.println(result);
        return 0;
    }
    public boolean show(String goat){
        if(Objects.equals(goat, "ronaldo")){
            return  true;
        }
        else
            return false;

    }
}
