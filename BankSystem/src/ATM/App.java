package ATM;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("---Banking System---");

        Banking b = new Banking();
        b.initiate();
    }
}