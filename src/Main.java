import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Zivotinja> zivotinje = new ArrayList<>();
        zivotinje.add(new Pas("Rex"));
        zivotinje.add(new Macka("Micek"));
        zivotinje.add(new Macka("Pegla"));
        zivotinje.add(new Piton("Louis Python"));

        for(Zivotinja zivotinja : zivotinje){
            zivotinja.ispisiPodatke();
        }


    }
}






