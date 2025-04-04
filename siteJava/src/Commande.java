import java.util.ArrayList;
import java.util.Random;

public class Commande {
    private ArrayList<Plat> plats;
    private Serveur serveur;

    // Le constructeur
    public Commande() {
        this.plats = new ArrayList<>();
        this.serveur = null; // pas encore assigné
    }

    //public void setServeur(Serveur serveur){this.serveur = serveur;} millestone 1

    // Cette fonction retourne l'id unique de la commande
    public int getId() {
        int min = 0;
        int max = 500;
        return (int)(Math.random() * (max - min + 1)) + min;
    }

    //Cette fonction ajout un plat à la commande
    public void ajouterPlat(Plat plat) {
        this.plats.add(plat);
        /*if (serveur != null) {
            //serveur.envoyerCommande(this);  millestone 1
        }*/
    }

    //Cette fonction calcule le total du prix de tout les plats choisis.
    public double calculerTotal() {
        double total = 0;
        for (Plat plat : plats) {
            total += plat.getPrix();
        }
        return total;
    }

    // Cette fonction affiche la commande dans son entièreté avec le prix total à la fin
    public void afficherCommande() {
        System.out.println("============== Votre commande =============");
        for (Plat plat : plats) {
            System.out.println(plat.getNom() + " " + plat.getPrix() + "€");
        }
        System.out.println("Prix total : " + calculerTotal() + "€");
        System.out.println("===========================================");
    }

    /*
    public String envoieCommande() {
        ArrayList<String> noms = new ArrayList<>();
        for (Plat p : plats) {
            noms.add(p.getNom());
        }
        return "À envoyer en cuisine : " + String.join(", ", noms);
    } à faire pour le millestone 1*/
}

