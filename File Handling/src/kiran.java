
import java.io.FileWriter;
import java.io.IOException;

class kiran {

    public static void main(String[] args) {
        String filename = "kiran.txt";
        try {
            FileWriter file = new FileWriter(filename);
            for (int i = 0; i < 2; i++) {
                file.write("kirin is now a best free fire player\n");
            }

            file.flush();
            file.close();

            System.err.println("file create succesfully " + filename);
        } catch (IOException e) {
            System.out.println("exception occered");

        }
    }
}
