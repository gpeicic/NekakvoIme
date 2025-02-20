public abstract class Vozilo {
    String marka;
    double brzina;

    public Vozilo(String marka, double brzina) {
        this.marka = marka;
        this.brzina = brzina;
    }
    abstract void kretanje();
    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public double getBrzina() {
        return brzina;
    }

    public void setBrzina(double brzina) {
        this.brzina = brzina;
    }
}
