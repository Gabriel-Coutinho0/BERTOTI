import java.util.List;

public class View implements Observer {
    @Override
    public void update(List<Produto> l) {
        System.out.println("Novos produtos adicionados:");
        for (Produto produto : l) {
            System.out.println(". " + produto.getNome());
        }
    }
}
