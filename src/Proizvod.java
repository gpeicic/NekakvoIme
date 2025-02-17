public class Proizvod {
    String naziv;

    double cijena;

    double kolicina;

    public Proizvod() {
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCijena() {
        return cijena;
    }

    public void setCijena(double cijena) {
        this.cijena = cijena;
    }

    public double getKolicina() {
        return kolicina;
    }

    public void setKolicina(double kolicina) {
        this.kolicina = kolicina;
    }

    public void prikaziInformacije() {
        System.out.println("Naziv: " + naziv + " " + "Cijena: " + cijena + "€" + " " + "Količina: " + kolicina);

    }

}
