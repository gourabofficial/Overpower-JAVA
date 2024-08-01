package in.testThread;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d* ", i);
        }

        System.out.println();
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d# ", i);
        }
        System.out.println();
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d& ", i);
        }
        System.out.println();
        long endTime = System.currentTimeMillis();

        System.out.println("Time taken: " + (endTime - startTime) + "ms");
    }
}