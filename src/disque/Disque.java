package disque;

public class Disque {
    private double diametre;
    
   
    public Disque() {
        this.diametre = 0.0;
    }
    
    public Disque(double diametre) {
        this.diametre = diametre;
    }
    
    public Disque(Disque autre) {
        this.diametre = autre.diametre;
    }
    

    public double getDiametre() {
        return diametre;
    }
    
    public void setDiametre(double diametre) {
        this.diametre = diametre;
    }
    

    public double rayon() {
        return diametre / 2.0;
    }
    
    public double perimetre() {
        return Math.PI * diametre;
    }
    
    public double surface() {
        return Math.PI * Math.pow(rayon(), 2);
    }
    

    public void afficher() {
        System.out.println("Disque de diamètre: " + diametre);
        System.out.println("Rayon: " + rayon());
        System.out.println("Périmètre: " + perimetre());
        System.out.println("Surface: " + surface());
    }
}


