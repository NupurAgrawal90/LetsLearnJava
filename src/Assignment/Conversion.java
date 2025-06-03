package Assignment;

public class Conversion {

    public static void main(String[] args)
    {
        int a = 54;
        float b = 34.34F;
        b = a;//Implicit conversion
        System.out.println("value of a is "+a );
        System.out.println("value of b is "+b);
        float c = 34.45F;
        int d = (int) c;
        System.out.println("value of c is "+c);
        System.out.println("value of d is "+d);
    }
}
