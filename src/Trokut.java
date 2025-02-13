public class Trokut extends GeometrijskiLik {
    private final double stranica1,stranica2,stranica3;
    public Trokut(double stranica1, double stranica2, double stranica3 ) {
        super("Trokut");
        this.stranica1 = stranica1;
        this.stranica2 = stranica2;
        this.stranica3 = stranica3;
    }

    @Override
    public double izracunajPovrsinu() {
        double s = (stranica1 + stranica2 + stranica3) / 2;
        return Math.sqrt(s * (s - stranica1) * (s - stranica2) * (s - stranica3));
    }

    @Override
    public double izracunajOpseg() {
        return stranica1 + stranica2 + stranica3;
    }
}
