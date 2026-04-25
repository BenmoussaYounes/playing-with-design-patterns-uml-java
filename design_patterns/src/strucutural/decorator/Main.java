package strcutural.decorator;

public class Main {

	public static void main(String[] args) {
		
		Component component = new ConcreteComponent();
		component.operation();
		
		Component componentA = new ComponentDecoratorA(component);
		componentA.operation();
		
		Component componentB = new ComponentDecoratorB(componentA);
		componentB.operation();
	}

}
