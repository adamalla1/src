package disque;

public class Segment3D {
    private CPoint3D origine, extremite;
    
    // Constructeurs
    public Segment3D(double x1, double y1, double z1, double x2, double y2, double z2) {
        this.origine = new CPoint3D(x1, y1, z1);
        this.extremite = new CPoint3D(x2, y2, z2);
    }
    
    public Segment3D(CPoint3D origine, CPoint3D extremite) {
        this.origine = new CPoint3D(origine);
        this.extremite = new CPoint3D(extremite);
    }
    
    // Accesseurs
    public CPoint3D getOrigine() {
        return new CPoint3D(origine);
    }
    
    public CPoint3D getExtremite() {
        return new CPoint3D(extremite);
    }
    
    // Mutateurs
    public void setSegment(CPoint3D origine, CPoint3D extremite) {
        this.origine = new CPoint3D(origine);
        this.extremite = new CPoint3D(extremite);
    }
    
    // Méthodes
    public double longueur() {
        return origine.distance(extremite);
    }
    
    public void afficher() {
        System.out.print("Origine: ");
        origine.afficher();
        System.out.print("Extrémité: ");
        extremite.afficher();
        System.out.println("Longueur: " + longueur());
    }
}

// Classe de test pour Segment3D
public class TestSegment3D {
    public static void main(String[] args) {
        Segment3D s1 = new Segment3D(2.5, 4, 3, 13, 5.6, 2);
        
        System.out.println("=== Segment s1 ===");
        s1.afficher();
    }
}