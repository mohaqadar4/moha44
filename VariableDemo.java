public class VariableDemo {
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
