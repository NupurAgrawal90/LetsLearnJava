package Practice;

public class TryNew {

    String name;
    String department;
    int rollno;

    public void setDetails(String SName,String DName,int RNum) {
        this.name = SName;
        this.department = DName;
        this.rollno = RNum;
    }
    public void display()
    {
        System.out.println("Student Name:");System.out.println("Student Name :"+this.name);
        System.out.println("Department: "+this.department);
        System.out.println("Roll number: "+this.rollno);

    }

    public static void main(String[] args) {
        TryNew s1 = new TryNew();
        TryNew s2 = new TryNew();
        TryNew s3 = new TryNew();
        TryNew s4 = new TryNew();

        s1.setDetails("Pawan","IT",1);
        s2.setDetails("Nupur","Teaching",2);
        s3.setDetails("Raghav","Grade 3",3);
        s4.setDetails("Cheeku","Drama",4);
        s1.display();
        s2.display();
        s3.display();
        s4.display();


    }
}
