import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - ristkylik, 2 - ring. Vali kujund: ");
        int valik = scanner.nextInt();

        if (valik == 1) {
            System.out.println("Sisesta ristkyliku pikkus: ");
            double pikkus = scanner.nextDouble();
            System.out.println("Sisesta ristkyliku laius: ");
            double laius = scanner.nextDouble();
            System.out.println("Sisesta ristkyliku kõrgus: ");
            double korgus = scanner.nextDouble();
            double ruumala = Ruumalad.ristkylikuRuumala(pikkus, laius, korgus);
            System.out.println("Ristkyliku ruumala on: " + ruumala);
        } else if (valik == 2) {
            System.out.println("Sisesta ringi raadius: ");
            double raadius = scanner.nextDouble();
            System.out.println("Sisesta ringi kõrgus: ");
            double korgus = scanner.nextDouble();
            double ruumala = Ruumalad.ringiRuumala(raadius, korgus);
            System.out.println("Ringi ruumala on: " + ruumala);
        } else {
            System.out.println("Vigane valik!");
        }

        scanner.close();
    }
}
