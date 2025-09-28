package disque;

public class TestCPoint3D {
    public static void main(String[] args) {
        CPoint3D p1 = new CPoint3D(2, 5, 7);
        CPoint3D p2 = new CPoint3D(5, 9, 16);
        
        System.out.println("=== Point p1 ===");
        p1.afficher();
        
        System.out.println("=== Point p2 ===");
        p2.afficher();
        
        System.out.println("Distance entre p1 et p2: " + p1.distance(p2));
    }
} 