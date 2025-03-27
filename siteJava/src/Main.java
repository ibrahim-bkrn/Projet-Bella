import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean console = true;
        Menu menu = new Menu();
        System.out.println("Exit : Pour sortir de la console \nAdd : Ajouter un plat \nPrint : Voir le menu \nSearch : rechercher un plat ");
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
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}