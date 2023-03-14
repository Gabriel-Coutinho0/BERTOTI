import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;
    private List<Observer> observers;

    public ShoppingCart() {
        this.items = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
        notifyObservers();
    }

    public void removeItem(Item item) {
        items.remove(item);
        notifyObservers();
    }

    public double calculateTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        double total = calculateTotal();
        for (Observer observer : observers) {
            observer.update(total);
        }
    }
}
