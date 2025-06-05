package Practice;

public class Learn {
    int a ;//global/instance/class variable
    int b = 10;
    int c;


    Learn()//constructor name same as class name
    {
        int a=7;//local variable
        System.out.println("learning is fun");// will be printed the moment object is created
        System.out.println(a);//this will print local a value
        this.a = a+5;//this always points global variable
        this.c = this.a+b;
        System.out.println(c);
    }
    public void trial()//method(); should have return type
    {
        System.out.println("will this work");
    }

    public static void main(String[] args) {//main method();
        Learn l1 = new Learn();//object creation
        l1.trial();//method is called object.method name();
        System.out.println(l1.a);
        System.out.println(l1.b);
        System.out.println(l1.c);
    }
}
