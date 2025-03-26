import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Le nom du plat: ");
        String nom = sc.nextLine();
        System.out.print("Le prix du plat: ");
        double prix = sc.nextInt();
        System.out.print("Le type du plat: ");
        String type = sc.next();

        Plat plat = new Plat(nom, prix, type);

        System.out.println(plat.toString());
    }
}