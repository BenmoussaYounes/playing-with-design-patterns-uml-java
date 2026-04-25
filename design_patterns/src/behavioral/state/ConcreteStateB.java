package behavioral.state;

public class ConcreteStateB extends State {

    public ConcreteStateB(Context context) {
        super(context);
    }

    @Override
    public void handle() {
        System.out.println("BBBBB");
        context.setState(context.states.get("c"));
    }
}
