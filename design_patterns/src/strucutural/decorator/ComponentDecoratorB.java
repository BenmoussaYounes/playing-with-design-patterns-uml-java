package strcutural.decorator;

public class ComponentDecoratorB extends Decorator{

	public ComponentDecoratorB(Component component) {
		super(component);
	}
	
	
	@Override
	public void operation() {
		super.operation();
		System.out.println("BI BI BO BO BA BA :)");
	}

}
