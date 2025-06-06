package Practice;

// Class representing a RoboCleaner that can do multiple household tasks
public class RoboCleaner {

    // Method to perform cleaning
    // It returns the same object (this) so other methods can be chained
    public RoboCleaner Clean() {
        System.out.println("Cleaning Done");
        return this; // Return the current object so another method can be called next
    }

    // Method to perform sweeping
    public RoboCleaner Sweep() {
        System.out.println("Sweeping started");
        return this; // Return the same object for chaining
    }

    // Method to do the dishes
    public RoboCleaner Dishes() {
        System.out.println("Dishes Done");
        return this; // Again return the current object to continue chaining
    }

    public static void main(String[] args) {
        // Creating a RoboCleaner object
        RoboCleaner r1 = new RoboCleaner();

        // Method chaining: call Dishes, then Sweep, then Clean using the same object
        r1.Dishes().Sweep().Clean();

        // Output will be:
        // Dishes Done
        // Sweeping started
        // Cleaning Done
    }
}
