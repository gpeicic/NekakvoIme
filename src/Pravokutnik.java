public class Pravokutnik extends GeometrijskiLik {
    private final double stranica1,stranica2;

    public Pravokutnik(double stranica1, double stranica2) {
        super("Pravokutnik");
        this.stranica1 = stranica1;
        this.stranica2 = stranica2;
    }

    @Override
    public double izracunajPovrsinu() {
        return stranica1 * stranica2;
    }

    @Override
    public double izracunajOpseg() {
        return 2 * (stranica1 + stranica2);
    }
}
