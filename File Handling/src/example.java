
import java.io.FileWriter;
import java.io.IOException;

public class example {

    public static void main(String[] args) {
        String filename = "suii.text";
        try {
            FileWriter write = new FileWriter(filename);

            for(int i=0; i<7; i++){
            write.write("SUIIIII\n");
            }
            write.flush();
            write.close();
            System.out.println("File created : " +filename );

        } catch (IOException e) {
            System.out.println("exception occord " + e.getMessage());
        }

    }
}
