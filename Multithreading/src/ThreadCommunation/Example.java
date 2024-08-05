class Example{
    public static void main(String[] args) throws InterruptedException {
        System.out.println("first statement");

        Thread.sleep(5000);

        System.out.println("After 5 seconds");
        System.out.println(  "HELLO ! " + " print this statement");
        
    }
}