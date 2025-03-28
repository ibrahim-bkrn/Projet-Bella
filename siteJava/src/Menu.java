import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Plat> plats;

    public Menu() {this.plats = new ArrayList<>();}

    // Cette fonction ajoute un plat au menu du restaurant avec ce qu'a initialiser le serveur.
    public void addPlat(Plat plat) {
        this.plats.add(plat);
    }

    // Cette fonction affiche le menu entier du restaurant.
    public void printMenu() {
        System.out.println("========Menu de BELLA TRIVOLA========");
        for (int i = 0; i < plats.size(); i++) {
            System.out.println(plats.get(i));
        }
        System.out.println("=====================================");
    }

    //Cette fonction retourne le plat recherché par son nom.
    public void returnPlat(String nomPlat){
        for (int i = 0; i < plats.size(); i++){
            if (nomPlat.equals(plats.get(i).getNom())){
                System.out.println("==================================");
                System.out.print("Le plat que vous cherché est : ");
                System.out.println("Le plat que vous cherché est : " + plats.get(i).getNom() + " - " + plats.get(i).getPrix() + "€ - " + plats.get(i).getType());
                System.out.println("==================================");
            }
        }
    }
}
