public class VariableDemo {

    private static int staticCounter = 0;

    private int instanceCounter = 0;

    public void demonstrateLocalVariable() {
        int localCounter = 0;
        localCounter++;
        System.out.println("Value of localCounter: " + localCounter);
    }

    public void demonstrateInstanceVariable() {
        instanceCounter++;
        System.out.println("Value of instanceCounter: " + instanceCounter);
    }

    public static void demonstrateStaticVariable() {
        staticCounter++;
        System.out.println("Value of staticCounter: " + staticCounter);
    }

    public static void main(String[] args) {
        VariableDemo demo1 = new VariableDemo();
        VariableDemo demo2 = new VariableDemo();

        System.out.println("Demonstrating local variable:");
        demo1.demonstrateLocalVariable(); 
        demo2.demonstrateLocalVariable(); 
        System.out.println("\nDemonstrating instance variable:");
        demo1.demonstrateInstanceVariable(); 
        demo2.demonstrateInstanceVariable();

       
        System.out.println("\nDemonstrating static variable:");
        VariableDemo.demonstrateStaticVariable(); 
        VariableDemo.demonstrateStaticVariable(); 
    }
}
