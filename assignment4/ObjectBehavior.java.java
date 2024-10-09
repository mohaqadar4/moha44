interface ObjectBehavior {
    void performAction();
    void haltAction();
    int getAttribute();
    String getType();
}
class Type1 implements ObjectBehavior {
    private int attributeValue = 100;
    public void performAction() {
        System.out.println("Type1 is performing an action.");
    }
    public void haltAction() {
        System.out.println("Type1 has halted the action.");
    }
    public int getAttribute() {
        return attributeValue;
    }
    public String getType() {
        return "Type1";
    }
    public String getDetail1() {
        return "Detail1 for Type1";
    }
}
class Type2 implements ObjectBehavior {
    private int attributeValue = 200;
    public void performAction() {
        System.out.println("Type2 is performing an action.");
    }
    public void haltAction() {
        System.out.println("Type2 has halted the action.");
    }
    public int getAttribute() {
        return attributeValue;
    }
    public String getType() {
        return "Type2";
    }
    public String getDetail2() {
        return "Detail2 for Type2";
    }
}
class Type3 implements ObjectBehavior {
    private int attributeValue = 300;
    public void performAction() {
        System.out.println("Type3 is performing an action.");
    }
    public void haltAction() {
        System.out.println("Type3 has halted the action.");
    }
    public int getAttribute() {
        return attributeValue;
    }
    public String getType() {
        return "Type3";
    }
    public String getDetail3() {
        return "Detail3 for Type3";
    }
}
public class Main {
    public static void main(String[] args) {
        ObjectBehavior[] objects = {new Type1(), new Type2(), new Type3()};

        for (ObjectBehavior obj : objects) {
            obj.performAction();
            System.out.println("Attribute: " + obj.getAttribute());
            System.out.println("Type: " + obj.getType());
            if (obj instanceof Type1) {
                System.out.println(((Type1) obj).getDetail1());
            } else if (obj instanceof Type2) {
                System.out.println(((Type2) obj).getDetail2());
            } else if (obj instanceof Type3) {
                System.out.println(((Type3) obj).getDetail3());
            }
            obj.haltAction();
        }
    }
}
