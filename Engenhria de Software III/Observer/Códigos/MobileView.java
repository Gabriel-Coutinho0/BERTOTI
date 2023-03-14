public class MobileView implements Observer {
    private double total;

    public void update(double total) {
        this.total = total;
        display();
    }

    public void display() {
        System.out.println("Total: $" + total);
    }
}
