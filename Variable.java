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
public class Variable {
    int instanceVar = 10;
    
    static int staticVar = 20;
    
    public void showVariables() {
        int localVar = 30;
        
        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }
    
    public static void main(String[] args) {
        VariableDemo demo = new VariableDemo();
        demo.showVariables();
    }
}
