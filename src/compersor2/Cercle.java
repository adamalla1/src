package compersor2;

public class Cercle extends ObjetGraphique {
    private int rayon;

    public Cercle() {
        super();
    }

    public Cercle(int x, int y, int rayon) {
        super(x, y, rayon * 2, rayon * 2); // largeur et hauteur = diamètre
        this.rayon = rayon;
    }
    
    public int getRayon() { return rayon; }
    public void setRayon(int rayon) { this.rayon = rayon; }

    public void dessiner() {
        System.out.println("Cercle [x=" + getX() + ", y=" + getY() +
                ", rayon=" + rayon + "]");
    }
}
