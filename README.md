public class VariableDemo {

    // Static variable: Shared among all instances
    private static int staticCounter = 0;

    // Instance variable: Unique to each instance
    private int instanceCounter = 0;

    // Method to demonstrate the use of local variables
    public void demonstrateLocalVariable() {
        // Local variable: Only accessible within this method
        int localCounter = 0;
        localCounter++;
        System.out.println("Value of localCounter: " + localCounter);
    }

    // Method to demonstrate the use of instance variables
    public void demonstrateInstanceVariable() {
        // Increment the instance variable
        instanceCounter++;
        System.out.println("Value of instanceCounter: " + instanceCounter);
    }

    // Static method to demonstrate the use of static variables
    public static void demonstrateStaticVariable() {
        // Increment the static variable
        staticCounter++;
        System.out.println("Value of staticCounter: " + staticCounter);
    }

    public static void main(String[] args) {
        // Create instances of VariableDemo
        VariableDemo demo1 = new VariableDemo();
        VariableDemo demo2 = new VariableDemo();

        // Demonstrate local variable
        System.out.println("Demonstrating local variable:");
        demo1.demonstrateLocalVariable(); // Prints 1
        demo2.demonstrateLocalVariable(); // Prints 1 again, local variable is reinitialized

        // Demonstrate instance variable
        System.out.println("\nDemonstrating instance variable:");
        demo1.demonstrateInstanceVariable(); // Prints 1
        demo2.demonstrateInstanceVariable(); // Prints 1 again, instance variables are separate

        // Demonstrate static variable
        System.out.println("\nDemonstrating static variable:");
        VariableDemo.demonstrateStaticVariable(); // Prints 1
        VariableDemo.demonstrateStaticVariable(); // Prints 2, static variable is shared among all instances
    }
}
