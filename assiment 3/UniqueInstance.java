public class UniqueInstance {
    private static int idCounter = 1; 
    private int uniqueId;  
    private String name;   
    {
        uniqueId = idCounter++;
    }
    public UniqueInstance(String name) {
        this.name = name;
    }
    public int getUniqueId() {
        return uniqueId;
    }
    public String getName() {
        return name;
    }
    public static void main(String[] args) {
        UniqueInstance instance1 = new UniqueInstance("Alice");
        UniqueInstance instance2 = new UniqueInstance("Bob");
        UniqueInstance instance3 = new UniqueInstance("Charlie");
        // Display the unique IDs and names
        System.out.println("Instance 1 - ID: " + instance1.getUniqueId() + ", Name: " + instance1.getName());
        System.out.println("Instance 2 - ID: " + instance2.getUniqueId() + ", Name: " + instance2.getName());
        System.out.println("Instance 3 - ID: " + instance3.getUniqueId() + ", Name: " + instance3.getName());
    }
}
