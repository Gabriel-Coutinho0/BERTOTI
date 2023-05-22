package Facade;

public class Main {
    public static void main(String[] args) {

        Livro livro = new Livro();
        Facade facade = new Facade(livro);

        facade.adicionarLivro("Harry Botter");
        facade.alugaLivro("Percy Jakson");
        facade.guardaLiv("Quincas Borba");

    }
}
