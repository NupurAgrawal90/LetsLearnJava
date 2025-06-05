package Practice;
//using THIS keyword to learn how to call one  constructor from another
public class CHome {

    String a;
    String b;
    int c;

    CHome() //default constructor is called as soon as the object is created

    {
        this(45);//2. control passes to one int parameterised constructor
        System.out.println("i will be printed second");//7. this gets printed last
    }

    CHome(String a)
    {
        System.out.println("haha I came first");//5. first print and goes to 4
    }
    CHome(int c)//3. control comes here
    {
        this("Amit");//4. this sends control to string constructor
        System.out.println("I should be printed first");//6. this gets printed goes down and goes back to default
    }

    public static void main(String[] args) {
        CHome c1= new CHome();//1.  object is created
    }
}
