public class Student {
    String name;

    // Constructor
    Student() {
        name = "No Name Yet";
        System.out.println("Constructor called!");
    }

    public static void main(String[] args) {
        Student s1 = new Student();  // Constructor runs automatically
        System.out.println(s1.name);
    }
}
