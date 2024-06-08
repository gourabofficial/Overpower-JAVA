import java.io.FileWriter;
import java.io.IOException;

public class fileWrite{
    public static void main(String[] args) {
        String filename = "ishow.text";
        try(FileWriter file = new FileWriter(filename)){
            file. write("suii me Ronaldo,tou r the best player in the world\n");
            file.write("i think messi better!");
            file.flush();
            System.out.println("File Created: " + filename);
        }catch (IOException e){
            System.out.println("Exception Occurred:" + e.getMessage());
        }
    }
}