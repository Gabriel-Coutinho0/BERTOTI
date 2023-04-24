import java.util.LinkedList;

public final class Singleton{
    public static Singleton biblioteca;
    
    public LinkedList<String> livros = new LinkedList<>();

    private Singleton(String value){
        livros.add(value);
    }

    public static Singleton getInstance(String livro){
        if (biblioteca == null){
            biblioteca = new Singleton(livro);
        }return biblioteca;
    }

    public void addLivro(String livro){
        livros.add(livro);
    }
}