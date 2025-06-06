package Practice;
//constructor overriding different parameterised
public class ConstHome {

    ConstHome()
    {
        System.out.println("My beautiful home");
    }

    ConstHome(String a,String b )
    {
        System.out.println("Why don't you visit the house of "+a+ " or "+b);
    }
    ConstHome(int a,int b)
    {
        int sum= a+b;
        System.out.println("This house costed us "+sum+" $");
    }

    public static void main(String[] args) {
        ConstHome h1 = new ConstHome(5,6);
        ConstHome h2 = new ConstHome();
        ConstHome h3 = new ConstHome("Shreya", "Nimesh");
    }
}
