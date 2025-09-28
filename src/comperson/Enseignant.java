package comperson;


public class Enseignant extends Personnel {

 private String matiereEnseignant;


 public Enseignant() {
 }

 public Enseignant(String nom, byte age, String adresse, float salaire, String matiereEnseignant) {
     super(nom, age, adresse, salaire);
     this.matiereEnseignant = matiereEnseignant;
 }

 public Enseignant(Enseignant e) {
     super(e.getNom(), e.getAge(), e.getAdresse(), e.getSalaire());
     this.matiereEnseignant = e.matiereEnseignant;
 }


 public String getMatiereEnseignant() {
     return matiereEnseignant;
 }

 public void setMatiereEnseignant(String matiereEnseignant) {
     this.matiereEnseignant = matiereEnseignant;
 }

 public String toString() {
     return super.toString() + ", Matière : " + matiereEnseignant;
 }
 
}


