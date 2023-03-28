public class main {

    public static void main(String[] args) {
        Porta porta = new Porta();
        porta.setName("Carvalho");
        Composite composite = new Composite();
        composite.add(porta);
        composite.execute();
    }
}
