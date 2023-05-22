package Facade;

public class Facade {
    private Livro livro;

    public Facade(Livro livro ){
        this.livro = livro;
    }
    public void adicionarLivro(String liv){
        livro.adicionarLiv(liv);
    }
    public void alugaLivro (String liv){
        livro.alugarLiv(liv);
    }
    public void guardaLiv(String liv){
        livro.guardaLiv(liv);
    }
}
