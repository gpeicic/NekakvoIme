public class Automobil extends Vozilo {
    int brojVrata;

    public Automobil(String marka, double brzina,int brojVrata) {
        super(marka, brzina);
        this.brojVrata = brojVrata;
    }

    @Override
    void kretanje() {
        System.out.println("Automobil " + marka + ", sa " + brojVrata + " vrata se krece brzinom " + brzina + "km/h.");
    }
}
