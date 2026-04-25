package strcutural.decorator;

public class ComponentDecoratorA extends Decorator {
	final String addedState = "off :(";
	
	public ComponentDecoratorA(Component component) {
		super(component);
	}
	
	@Override
	public void operation() {
		super.operation();
	}
}
