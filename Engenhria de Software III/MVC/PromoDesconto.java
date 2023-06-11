import java.util.List;

public class PromoDesconto implements Observer {
    @Override
    public void update(List<Produto> l) {
        System.out.println("Você ganhou desconto!");
        for (Produto produto : l) {
            System.out.println(". " + produto.getNome());
        }
    }
}
