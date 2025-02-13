public class Krug extends GeometrijskiLik{
    private final double radijus;
    public Krug(double radijus) {
        super("Krug");
        this.radijus = radijus;
    }

    @Override
    public double izracunajPovrsinu() {
        return Math.PI * radijus * radijus;
    }

    @Override
    public double izracunajOpseg() {
        return 2 * Math.PI * radijus;
    }
}
