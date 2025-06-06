package Practice;
//making a constructor to avoid adding values after object creation
//This keyword helps in assigning value to global variables where global and local variables have same name
public class TryNew {

    String name;
    String department;
    int rollno;

    public TryNew(String name,String department,int rollno) {
        this.name = name;//refers to the instance variable name of the current object.


        this.department = department;//Assign the value of the parameter to the object’s variable
        this.rollno = rollno;
    }
    public void display()
    {
       System.out.println("Student Name :"+this.name);
        System.out.println("Department: "+this.department);
        System.out.println("Roll number: "+this.rollno);
        System.out.println("");//cleaner look

    }

    public static void main(String[] args) {
        TryNew s1 = new TryNew("Pawan","IT",1);
        TryNew s2 = new TryNew("Nupur","Teaching",2);
        TryNew s3 = new TryNew("Raghav","Grade 3",3);
        TryNew s4 = new TryNew("Cheeku","Drama",4);
//Ensures that each object is created fully initialized.

        s1.display();
        s2.display();
        s3.display();
        s4.display();


    }
}
