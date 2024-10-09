abstract class AbstractObject {
    protected String name;
    protected String description;
    public AbstractObject(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public abstract void displayDetails();
    public double computeValue(double parameter) {
        return parameter * 10; 
    }
}
class TypeA extends AbstractObject {
    private String uniqueFeatureA;
    public TypeA(String name, String description, String uniqueFeatureA) {
        super(name, description);
        this.uniqueFeatureA = uniqueFeatureA;
    }
    public void displayDetails() {
        System.out.println("TypeA - Name: " + name + ", Description: " + description + ", Unique Feature: " + uniqueFeatureA);
    }
}
class TypeB extends AbstractObject {
    private String uniqueFeatureB;

    public TypeB(String name, String description, String uniqueFeatureB) {
        super(name, description);
        this.uniqueFeatureB = uniqueFeatureB;
    }
    public void displayDetails() {
        System.out.println("TypeB - Name: " + name + ", Description: " + description + ", Unique Feature: " + uniqueFeatureB);
    }
}
public class Main {
    public static void main(String[] args) {
        AbstractObject obj1 = new TypeA("Object A", "This is object A", "Feature A1");
        AbstractObject obj2 = new TypeB("Object B", "This is object B", "Feature B1");

        obj1.displayDetails();
        System.out.println("Computed Value: " + obj1.computeValue(5)); 

        obj2.displayDetails();
        System.out.println("Computed Value: " + obj2.computeValue(10)); 
    }
}
