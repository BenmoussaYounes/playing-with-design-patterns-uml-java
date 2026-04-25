package behavioral.state;

public class ConcreteStateA extends State {

    public ConcreteStateA(Context context) {
        super(context);
    }

    @Override
    public void handle() {
        System.out.println("AAAAA");
        context.setState(context.states.get("b")); 
    }
}
