abstract class Entity {
    protected String name;
    protected int id;
    public Entity(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract void performOperation();
    public String getDetails() {
        return "ID: " + id + ", Name: " + name;
    }
}
