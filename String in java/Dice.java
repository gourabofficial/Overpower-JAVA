public class Dice {
    public static int Dice(){
        double random = Math.random() * 6;
        return (int) Math.ceil(random);
    }

    public static void main(String[] args) {
        Dice myDice = new Dice();
        for(int i=0; i<10; i++){
            int result = Dice.Dice();
            System.out.println(result);
        }
    }
}
