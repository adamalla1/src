package disque;

public class TestDisque {
    public static void main(String[] args) {
        Disque d1 = new Disque(2.5);
        Disque d2 = new Disque(5.6);
        
        System.out.println("=== Disque d1 ===");
        d1.afficher();
        
        System.out.println("\n=== Disque d2 ===");
        d2.afficher();
    }
}
