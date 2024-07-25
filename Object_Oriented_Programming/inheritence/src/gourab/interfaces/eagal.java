package gourab.interfaces;

public class eagal implements animal,bird,animal2 {
    public void eat(){
        System.out.println("Eagles eat meat");
    }
    public void sleep(){
        System.out.println("Eagles sleep on trees");
    }
    public void fly(){
        System.out.println("Eagles fly high");
    }

    @Override
    public void detail() {
        System.out.println("Eagles are birds");
    }
}
