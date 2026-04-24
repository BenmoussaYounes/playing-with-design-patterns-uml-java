package creational.singleton;

public class Main {

	public static void main(String[] args) {
		
		Singleton instance = Singleton.insttance();
		Singleton instance2 = Singleton.insttance();
		
		if(instance == instance2) {
			System.out.println("*** Singleton in action :)");
		} 

	}

}
