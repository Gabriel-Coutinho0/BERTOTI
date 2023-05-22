package Facade;

public class Livro {
    public void adicionarLiv(String liv){
        System.out.println("Adicionando Livro: " + liv);
    }
    public void alugarLiv(String liv){
        System.out.println("Verificando Livro: " + liv);
    }
    public void guardaLiv(String liv){
        System.out.println("Guardando Livro: " + liv);
    }
}
