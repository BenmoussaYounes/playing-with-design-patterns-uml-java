package behavioral.observer;

public class ConcreteSubject extends Subject{
	
	public String state = "";
	
	public void setState(String s) {
		state = s;
		super.notifyObservers();
	}
	
	public String getState() {
		return state;
	}

}
