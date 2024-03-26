abstract class Base {
    private int id;

    public Base() {
        this.id = 0;
    }

    public Base(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract void displayInfo();
}
