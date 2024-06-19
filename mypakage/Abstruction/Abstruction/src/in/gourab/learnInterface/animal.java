package in.gourab.learnInterface;

public  interface animal {

    default void animal(){
        System.out.println("this is a normal method (using default)"); // if we create a simple method always use default
    }

    void maksound();
    void eat();
}

