import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Scanner unos = new Scanner(System.in);
        //Zadatak 1.
        Zadatak1(unos);

        //Zadatak 2.
        Zadatak2(unos);
        unos.close();



    }
    public static void Zadatak1(Scanner unos) {


        System.out.println("unesite niz znakova:");
        String znakovi = unos.nextLine();


        int slova = 0;
        int brojevi = 0;
        int ostaliZnakovi = 0;

        for (char znak : znakovi.toCharArray()) {
            if (Character.isLetter(znak)) {
                slova++;
            } else if (Character.isDigit(znak)) {
                brojevi++;
            } else {
                ostaliZnakovi++;
            }
        }

        System.out.println("Slova: " + slova + " Brojevi: " + brojevi + " Ostali znakovi: " + ostaliZnakovi);

    }
    public static void Zadatak2(Scanner unos){
        System.out.println("unesite niz znakova:");
        String nizZnakova = unos.nextLine();
        unos.close();


        List<String> rijeci = Arrays.asList(nizZnakova.split("\\s+"));
        Collections.reverse(rijeci);

        System.out.println("Obrnuti redoslijed: " + String.join(" ", rijeci));
    }
}






