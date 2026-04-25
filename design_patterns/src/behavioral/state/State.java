package behavioral.state;

public abstract class State {
	public Context context;
	
    public State(Context context) {
        this.context = context;
    }

	
	abstract public void handle();
}
