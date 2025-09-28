package comperson;

public class Personnel extends Personne {

 private String adresse;
 private float salaire;


 public Personnel() {
     
 }

 public Personnel(String nom, byte age, String adresse, float salaire) {
     super(nom, age);
     this.adresse = adresse;
     this.salaire = salaire;
 }

 public Personnel(Personnel p) {
     super(p.getNom(), p.getAge());
     this.adresse = p.adresse;
     this.salaire = p.salaire;
 }


 public String getAdresse() {
     return adresse;
 }

 public void setAdresse(String adresse) {
     this.adresse = adresse;
 }

 public float getSalaire() {
     return salaire;
 }

 public void setSalaire(float salaire) {
     this.salaire = salaire;
 }

 public String toString() {
     return super.toString() + ", Adresse : " + adresse + ", Salaire : " + salaire;
 }
}



