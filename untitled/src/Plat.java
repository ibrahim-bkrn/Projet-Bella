import java.util.Scanner;

public class Plat {
    private String nom;
    private double prix;
    private String type;

    Plat(String nom, double prix, String type) {
        this.nom = nom;
        this.prix = prix;
        this.type = type;
    }

    public String getNom() {return nom;}
    public double getPrix() {return prix;}
    public String getType() {return type;}

    public void setNom(String nom) { this.nom = nom; }
    public void setPrix(double prix) { this.prix = prix; }
    public void setType(String type) { this.type = type; }

    public String toString() {
        return nom + " - " + prix + "€ - " + type;
    }
}
