final class BaseFinalClass {
    public void displayMessage() {
        System.out.println("This is a final class and cannot be extended.");
    }
}
public class ParentClass {
    private String attribute1;
    private String attribute2;
    public ParentClass(String attribute1, String attribute2) {
        this.attribute1 = attribute1;
        this.attribute2 = attribute2;
    }
    public void showDetails() {
        System.out.println("Attribute1: " + attribute1 + ", Attribute2: " + attribute2);
    }
    public final void displayMessage() {
        System.out.println("This is a final method in ParentClass.");
    }
}
public class ChildClass1 extends ParentClass {
    private String additionalAttribute;
    public ChildClass1(String attribute1, String attribute2, String additionalAttribute) {
        super(attribute1, attribute2);
        this.additionalAttribute = additionalAttribute;
    }
        super.showDetails();
        System.out.println("Additional Attribute (ChildClass1): " + additionalAttribute);
    }
}
class ChildClass2 extends ParentClass {
    private int additionalNumber;
    public ChildClass2(String attribute1, String attribute2, int additionalNumber) {
        super(attribute1, attribute2);
        this.additionalNumber = additionalNumber;
    }
        super.showDetails();
        System.out.println("Additional Number (ChildClass2): " + additionalNumber);
    }
}
public class TypeChecker {
    public void identifyObjectType(ParentClass obj) {
        if (obj instanceof ChildClass1) {
            System.out.println("The object is of type ChildClass1.");
        } else if (obj instanceof ChildClass2) {
            System.out.println("The object is of type ChildClass2.");
        } else {
            System.out.println("The object is of unknown type.");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        ChildClass1 obj1 = new ChildClass1("Parent Attribute1", "Parent Attribute2", "Child Attribute1");
        ChildClass2 obj2 = new ChildClass2("Parent Attribute1", "Parent Attribute2", 42);
        obj1.showDetails();
        obj2.showDetails();
        TypeChecker checker = new TypeChecker();
        checker.identifyObjectType(obj1);
        checker.identifyObjectType(obj2);
    }
}
