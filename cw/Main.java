import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Entity car1 = new Car("Sedan", 1, 120, 50);
        Entity car2 = new Car("SUV", 2, 80, 70);
        Entity book1 = new Book("Java Programming", 3, "Author A", 300);
        Entity book2 = new Book("Design Patterns", 4, "Author B", 200);
        ArrayList<Entity> entities = new ArrayList<>();
        entities.add(car1);
        entities.add(car2);
        entities.add(book1);
        entities.add(book2);
        for (Entity entity : entities) {
            System.out.println(entity.getDetails());
            entity.performOperation();
        }
    }
}
