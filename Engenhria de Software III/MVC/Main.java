public class Main {
    public static void main(String[] args) {
        Livraria livraria = new Livraria();
        
        // Criação de produtos
        Produto produto1 = new Produto("Livro A", 29.99);
        Produto produto2 = new Produto("Livro B", 19.99);
        Produto produto3 = new Produto("Livro C", 9.99);
        
        // Criação de observadores
        PromoDesconto promoDesconto = new PromoDesconto();
        View view = new View();
        
        // Registro dos observadores na livraria
        livraria.registerObserver(promoDesconto);
        livraria.registerObserver(view);
        
        // Adição de produtos na livraria
        livraria.addProduto(produto1);
        livraria.addProduto(produto2);
        livraria.addProduto(produto3);
    }
}
