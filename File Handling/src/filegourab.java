import java.io.FileWriter;
import java.io.IOException;

public class filegourab {
    public static void main(String[] args) {
        String filename = "debesh.text";
        try{
            FileWriter file = new FileWriter(filename);
            file.write("about debesh: ");
            for(int i = 0; i <= 10; i++)
                file.write("\nDebesh is the nigga man ");
            file.flush();
            System.out.println("file create succesfully: " +filename);
        }catch(IOException e){
            System.out.println("Exception occourd" +e.getMessage());
        }
    }
}
