abstract class Zivotinja {
    protected String naziv;

    public Zivotinja(String naziv) {
        this.naziv = naziv;
    }

    public abstract String glasajSe();

    public void ispisiPodatke() {
        System.out.println(naziv + " se glasa: " + glasajSe());
    }
}
