public class Bicikl extends Vozilo{
    String vrsta;
    public Bicikl(String marka, double brzina,String vrsta) {
        super(marka, brzina);
        this.vrsta = vrsta;
    }

    @Override
    void kretanje() {
        System.out.println("Bicikl " + marka +" " + vrsta + " se krece brzinom " + brzina + "km/h");
    }
}
