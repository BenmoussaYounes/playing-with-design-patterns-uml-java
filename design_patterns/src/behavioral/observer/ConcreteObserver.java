package behavioral.observer;

public class ConcreteObserver implements Observer{
	public String observerState;
	public ConcreteSubject subject;
	
	public ConcreteObserver(ConcreteSubject subject) {
		this.subject = subject;
		this.observerState = subject.getState();
	}

	@Override
	public void update() {
		observerState =  subject.getState();
	}
	
}
