package compersor2;

public class Bouton extends Rectangle {
    private String texte;


    public Bouton() {
        super();
    }

    public Bouton(int x, int y, int largeur, int hauteur, String texte) {
        super(x, y, largeur, hauteur);
        this.texte = texte;
    }

   
    public String getTexte() { return texte; }
    public void setTexte(String texte) { this.texte = texte; }
    public void dessiner() {
        System.out.println("Bouton [x=" + getX() + ", y=" + getY() +
                ", largeur=" + getLargeur() + ", hauteur=" + getHauteur() +
                ", texte=" + texte + "]");
    }
}
