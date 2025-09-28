package disque;

public class CSphere {
    private CPoint3D centre;
    private double rayon;
    
    public CSphere() {
        this.centre = new CPoint3D();
        this.rayon = 0.0;
    }
    
    public CSphere(double x, double y, double z, double rayon) {
        this.centre = new CPoint3D(x, y, z);
        this.rayon = rayon;
    }
    
    public CSphere(CPoint3D centre, double rayon) {
        this.centre = new CPoint3D(centre);
        this.rayon = rayon;
    }
    
  
    public double getRayon() {
        return rayon;
    }
    
    public CPoint3D getCentre() {
        return new CPoint3D(centre);
    }
    
 
    public void setSphere(CPoint3D centre, double rayon) {
        this.centre = new CPoint3D(centre);
        this.rayon = rayon;
    }
    

    public double surface() {
        return 4 * Math.PI * Math.pow(rayon, 2);
    }
    
    public double volume() {
        return (4.0/3.0) * Math.PI * Math.pow(rayon, 3);
    }
    
    public void afficher() {
        System.out.println("Sphère de rayon: " + rayon);
        System.out.print("Centre: ");
        centre.afficher();
        System.out.println("Surface: " + surface());
        System.out.println("Volume: " + volume());
    }
}


