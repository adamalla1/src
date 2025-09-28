package comperson;

public class Personne {

protected String nom;
protected byte age;

 public Personne() {}

 public Personne(String nom, byte age) {
     this.nom = nom;
     this.age = age;
 }

 public Personne(Personne p) {
     this.nom = p.nom;
     this.age = p.age;
 }


 public String getNom() {
     return nom;
 }

 public void setNom(String nom) {
     this.nom = nom;
 }

 public byte getAge() {
     return age;
 }

 public void setAge(byte age) {
     this.age = age;
 }

 public String toString() {
     return "Nom : " + nom + ", Age : " + age;
 }
}

