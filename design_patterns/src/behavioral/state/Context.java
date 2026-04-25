package behavioral.state;

import java.util.HashMap;
import java.util.Map;

public class Context {
	private State state;
	public Map<String, State> states = new HashMap<>();

	public Context() {
		states.put("a", new ConcreteStateA(this));
		states.put("b", new ConcreteStateB(this));
		states.put("c", new ConcreteStateC(this));
		
		this.state = states.get("a");
	}

	public void setState(State state) {
		this.state = state;
	}

	public void request() {
		state.handle();
	}
}