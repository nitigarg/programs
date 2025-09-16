package blockingQueue;

public class Order {
    private int id; // order id
    private boolean isPoisonPill;

    public Order(boolean isPoisonPill, int id) {
        this.isPoisonPill = isPoisonPill;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public boolean isPoisonPill() {
        return isPoisonPill;
    }

    @Override
    public String toString() {
        return isPoisonPill?"[Poison Pill]":"Order Id "+ id;
    }
}
