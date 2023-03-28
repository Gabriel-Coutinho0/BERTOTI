class Porta implements IntefaceComponent{
    String porta;

    @Override
    public void execute() {
        System.out.println(porta);
    }

    public void setName(String name){
        this.porta = name;
    }
}