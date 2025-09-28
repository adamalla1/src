package disque;

public class CPoint3D {
    private double x, y, z;
    
    public CPoint3D() {
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
    }
    
    public CPoint3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public CPoint3D(CPoint3D autre) {
        this.x = autre.x;
        this.y = autre.y;
        this.z = autre.z;
    }
    

    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    
    public double getZ() {
        return z;
    }
    
 
    public void setPoint(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public void deplacer(double dx, double dy, double dz) {
        this.x += dx;
        this.y += dy;
        this.z += dz;
    }
    
    public double distance() {
        return Math.sqrt(x*x + y*y + z*z);
    }
    
    public double distance(CPoint3D autre) {
        double dx = this.x - autre.x;
        double dy = this.y - autre.y;
        double dz = this.z - autre.z;
        return Math.sqrt(dx*dx + dy*dy + dz*dz);
    }
    
    public boolean egal(CPoint3D autre) {
        return this.x == autre.x && this.y == autre.y && this.z == autre.z;
    }
    
    public void afficher() {
        System.out.println("Point3D(" + x + ", " + y + ", " + z + ")");
    }
}


