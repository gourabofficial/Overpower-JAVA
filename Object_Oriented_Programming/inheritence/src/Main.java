class Main{
    public static void main(String[] args) {
        programmer obj = new programmer();
        obj.salary();
        obj.code();
        obj.eat();
        obj.sleep();

        System.out.println("  ");

        dancer dancer = new dancer();
        dancer.salary();
        dancer.dance();
        dancer.eat();
        System.out.println("  ");

        farmer farmer = new farmer();
        farmer.ferming();
        farmer.eat();
        farmer.sleep();
        System.out.println("  ");

        devoloper devoloper = new devoloper();
        devoloper.devolop();
        devoloper.code();

        System.out.println(" ");
        System.out.println("persion class : ");

        persion p1 = new persion();

        System.out.println(p1.hashCode());
        System.out.println(p1.toString());
    }
}