import java.util.*;

public class Main {
    public static void main(String[] args) {
    ArrayList<Vozilo> vozila = new ArrayList<>();
    vozila.add(new Automobil("BMW",18000, 5));
    vozila.add(new Bicikl("Cube", 30, "planinski"));

        for (Vozilo vozilo : vozila) {
            vozilo.kretanje();
        }

    }
}






