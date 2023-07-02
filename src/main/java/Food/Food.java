package Food;

public class Food {

    public enum Urgency {Bassa, Media, Alta};

    private String name;
    private int quantity;
    private Urgency urgency;

    public Food() {}

    public Food(String name, int quantity, Urgency urgency) {
        this.name = name;
        this.quantity = quantity;
        this.urgency = urgency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Urgency getUrgency() {
        return urgency;
    }

    public void setUrgency(Urgency urgency) {
        this.urgency = urgency;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", urgency=" + urgency +
                '}';
    }

}
