import java.io.FileWriter;
import java.io.IOException;

public class filegourab {
    public static void main(String[] args) {
        String filename = "gourab.text";
        try{
            FileWriter file = new FileWriter(filename);
            file.write("exam start ...");
            for(int i = 0; i <= 100; i++)
                file.write("\n* preparation bro!");
            file.flush();
            System.out.println("file create succesfully: " +filename);
        }catch(IOException e){
            System.out.println("Exception occourd" +e.getMessage());
        }
    }
}
