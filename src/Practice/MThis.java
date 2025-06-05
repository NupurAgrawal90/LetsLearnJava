package Practice;

public class MThis {
    String a;



    MThis()
    {
        System.out.println("1. This is some weird world");
        this.a = "infinity World";
        System.out.println("2. "+this.a);
    }



    public void method1() {
        System.out.println("3. I am Method 1. where am I??");
        this.Lord();
        System.out.println("5. can someone tell me who is controlling");
        this.method2();

    }

    public void Lord() {
        System.out.println("4. you are in my control. I am Lord");
    }

    public void method2() {
        System.out.println("6. Stop it guys ");
    }

    public static void main(String[] args) {
         MThis m = new MThis();
         m.method1();

    }
}
