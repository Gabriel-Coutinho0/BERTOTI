import java.util.LinkedList;

public class Teste {
    
    public static void main(String[] args) {
        Singleton biblioteca = Singleton.getInstance("Livro 1");

        biblioteca.addLivro("Livro 2");
        biblioteca.addLivro("Livro 3");

        LinkedList<String> livros = biblioteca.livros;
        System.out.println("Lista de livros da biblioteca: " + livros);

        Singleton outraBiblioteca = Singleton.getInstance("Livro 4");
        System.out.println("A mesma instância de Singleton? " + (biblioteca == outraBiblioteca));
    }
}
