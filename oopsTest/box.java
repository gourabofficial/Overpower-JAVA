public class box {
    int l;
    int b;
    int h;

   @Override
    public String toString() {
        return "l="  + l+ " b=" +b+ " h=" + h + " ";
    }

    box(int l,int b,int h){
   this.l = l;
   this.b = b;
   this.h = h;

}
public static class Box1{
    int L ;

    Box1(){
        int l;
    }

    @Override
    public String toString() {
        return " L = " +L;
    }
}
   public static void main(String[] args) {
        box b1 = new box(88,84,89);
       // Box1 b2 = new Box1();
        System.out.println(b1.toString());
      // System.out.println(b1.h);
        //System.out.println(b2);
    }
}
