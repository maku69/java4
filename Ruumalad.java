public class Ruumalad {
    public static double ristkylikuRuumala(double pikkus, double laius, double korgus) {
        return Pindalad.ristkylikuPindala(pikkus, laius) * korgus;
    }

    public static double ringiRuumala(double raadius, double korgus) {
        return Pindalad.ringiPindala(raadius) * korgus;
    }
}
