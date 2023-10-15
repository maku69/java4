import java.util.Scanner;

public class Ruumalad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - ristkylik, 2 - ring. Vali kujund: ");
        int valik = scanner.nextInt();

        if (valik == 1) {
            System.out.println("Sisesta ristkyliku pikkus: ");
            double pikkus = scanner.nextDouble();
            System.out.println("Sisesta ristkyliku laius: ");
            double laius = scanner.nextDouble();
            double pindala = Pindalad.ristkylikuPindala(pikkus, laius);
            System.out.println("Ristkyliku pindala on: " + pindala);
        } else if (valik == 2) {
            System.out.println("Sisesta ringi raadius: ");
            double raadius = scanner.nextDouble();
            double pindala = Pindalad.ringiPindala(raadius);
            System.out.println("Ringi pindala on: " + pindala);
        } else {
            System.out.println("Vigane valik!");
        }

        scanner.close();
    }
}
