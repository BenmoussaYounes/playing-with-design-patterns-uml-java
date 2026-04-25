package behavioral.observer;

public class Main {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        ConcreteObserver obs1 = new ConcreteObserver(subject);
        ConcreteObserver obs2 = new ConcreteObserver(subject);

        subject.attach(obs1);
        subject.attach(obs2);

        subject.setState("active");
        System.out.println(obs1.observerState); // active
        System.out.println(obs2.observerState); // active

        subject.detach(obs2);

        subject.setState("inactive");
        System.out.println(obs1.observerState); // inactive
        System.out.println(obs2.observerState); // still active — was detached
    }
}