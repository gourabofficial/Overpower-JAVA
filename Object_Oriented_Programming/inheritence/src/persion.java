
public class persion {
    public String name;
    protected int salary;
    public String eat;
    public String sleep;

    public void eat() {
        System.out.println("Eating...");
    }

    public void sleep() {
        System.out.println("Sleeping...");
    }
}

    class programmer extends persion {
        void code() {
            System.out.println("Coding...");
        }

        void salary() {
            System.out.println("Salary is 50000");
        }
    }

    class dancer extends persion {
        void dance() {
            System.out.println("Dancing...");
        }

        void salary() {
            System.out.println("Salary is 30000");
        }
    }

    class farmer extends persion{
    void ferming(){
        System.out.println("Farming...");
      }
    }
    class devoloper extends programmer{
        void devolop(){
            System.out.println("Devoloping...");
        }
    }


