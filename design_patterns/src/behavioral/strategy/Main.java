package behavioral.strategy;


public class Main {
    public static void main(String[] args) {

        // stratégie A
        Context context = new Context(new ConcreteStrategyA());
        context.contextInterface();
        // A B C D ...

        // on change la stratégie à runtime
        context = new Context(new ConcreteStrategyB());
        context.contextInterface();
        // BI BO BA BO ....

        // encore une autre
        context = new Context(new ConcreteStrategyD());
        context.contextInterface();
        // DO RI MI FACOLA CIDO
    }
}