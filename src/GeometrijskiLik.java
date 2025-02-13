abstract class GeometrijskiLik {
    protected String naziv;

    public GeometrijskiLik(String naziv) {
        this.naziv = naziv;
    }
    public void ispisiPodatke(){
        System.out.println(naziv + " povrsina = " + String.format("%.2f", izracunajPovrsinu()) +
                " Opseg = " + String.format("%.2f", izracunajOpseg()));
    }

    public abstract double izracunajPovrsinu();
    public abstract double izracunajOpseg();
}
