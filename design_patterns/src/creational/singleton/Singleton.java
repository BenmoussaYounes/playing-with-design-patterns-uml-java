package creational.singleton;

public class Singleton {
	private static Singleton _instance = null;
	
	private Singleton() {}
	
	
	public static Singleton insttance() {
		if(_instance == null)  _instance = new Singleton();
		return _instance;
	}
}
