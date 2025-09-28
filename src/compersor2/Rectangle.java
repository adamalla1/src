package compersor2;

public class Rectangle extends ObjetGraphique {
    public Rectangle() {
        super();
    }

    public Rectangle(int x, int y, int largeur, int hauteur) {
        super(x, y, largeur, hauteur);
    }

    // Redéfinition de dessiner()
    public void dessiner() {
        System.out.println("Rectangle [x=" + getX() + ", y=" + getY() +
                ", largeur=" + getLargeur() + ", hauteur=" + getHauteur() + "]");
    }
}

