import java.util.ArrayList;
import java.util.List;

public class Livraria implements Subject {
    private List<Produto> produtos;
    private List<Observer> observers;

    public Livraria() {
        produtos = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(produtos);
        }
    }

    public void addProduto(Produto p) {
        produtos.add(p);
        notifyObservers();
    }

    public Produto buscarProduto(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null;
    }
}
