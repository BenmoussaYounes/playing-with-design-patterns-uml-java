package behavioral.state;

public class Main {
    public static void main(String[] args) {
        Context context = new Context(); 

        context.request(); // AAAAA
        context.request(); // BBBBB
        context.request(); // CCCCC
        context.request(); // AAAAA
    }
}