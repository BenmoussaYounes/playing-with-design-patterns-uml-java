package behavioral.iterator;

public class ConcreteAggregate implements Aggregate{

	@Override
	public Iterator createIterator() {
		return new ConcreteIterator();
	}
}
