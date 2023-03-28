import java.util.LinkedList;

public class Composite implements IntefaceComponent{
    LinkedList<IntefaceComponent> children = new LinkedList<>();

    @Override
    public void execute() {
        children.forEach(child ->child.execute() );
    }
    public void add(IntefaceComponent tipo){
        children.add(tipo);
    }
    
}
