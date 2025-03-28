import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean console = true;
        Menu menu = new Menu();
        System.out.println("Exit : Pour sortir de la console \nAdd : Ajouter un plat \nPrint : Voir le menu \nSearch : rechercher un plat \nCom : Prendre une commande ");
        while (console) {
            System.out.println("--------------------------");
            System.out.print("Que souhaitez vous faire : ");
            String input = sc.nextLine();
            System.out.println("--------------------------");
            switch (input) {
                case "Exit":
                    console = false;
                    break;
                case "Add":
                    System.out.print("Entre le nom du plat : ");
                    String nomPlat = sc.nextLine();
                    System.out.print("Entre le prix du plat : ");
                    double prixPlat = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Entre le type du plat : ");
                    String typePlat = sc.nextLine();
                    Plat plat = new Plat(nomPlat, prixPlat, typePlat);
                    menu.addPlat(plat);
                    break;
                case "Print":
                    menu.printMenu();
                    break;
                case "Search":
                    System.out.print("Entre le nom du plat que vous cherché : ");
                    String nomPlat1 = sc.nextLine();
                    menu.returnPlat(nomPlat1);
                    break;
                case "Com":
                    Commande commande = new Commande();
                    Plat platComTest1 = new Plat("pizza", 53, "plat");
                    commande.ajouterPlat(platComTest1);
                    Plat platComTest2 = new Plat("tiramisu", 5, "desert");
                    commande.ajouterPlat(platComTest2);
                    Plat platComTest3 = new Plat("salade", 4, "entrée");
                    commande.ajouterPlat(platComTest3);
                    System.out.println("    ExitCom : Sortir de la commande \n    Ajt : Ajouter un plat dans la commande \n    Prix : Voir le prix total de la commande \n    Voir : Voir la commande entière");
                    Boolean consoleCom = true;
                    while (consoleCom) {
                        System.out.println("--------------------------");
                        System.out.print("Que souhaitez vous faire dans la commande : ");
                        String inputCom = sc.nextLine();
                        System.out.println("--------------------------");
                        switch (inputCom) {
                            case "ExitCom":
                                consoleCom = false;
                                break;
                            case "Ajt":
                                System.out.print("Entre le nom du plat : ");
                                String nomPlatCom = sc.nextLine();
                                System.out.print("Entre le prix du plat : ");
                                double prixPlatCom = sc.nextDouble();
                                sc.nextLine();
                                System.out.print("Entre le type du plat : ");
                                String typePlatCom = sc.nextLine();
                                Plat platCom = new Plat(nomPlatCom, prixPlatCom, typePlatCom);
                                commande.ajouterPlat(platCom);
                                break;
                            case "Prix":
                                System.out.println(commande.calculerTotal());
                                break;
                            case "Voir":
                                commande.afficherCommande();
                                break;
                            default:
                                System.out.println("Invalid input pour la commande");
                        }
                    }
            }
        }
    }
}