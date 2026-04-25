package behavioral.state;

public class ConcreteStateC extends State {

    public ConcreteStateC(Context context) {
        super(context);
    }

    @Override
    public void handle() {
        System.out.println("CCCCC");
        context.setState(context.states.get("a"));
    }
}
