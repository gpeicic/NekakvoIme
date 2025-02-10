import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
/*
        String nizZnakova = "Danas je cetvrtak";
        System.out.println("velicina: " + nizZnakova.length());
        System.out.println("potraga za znakom(charAt): " + nizZnakova.charAt(11));
        System.out.println("Index of: " + nizZnakova.indexOf('c'));
        System.out.println("Starts with Da:" + nizZnakova.startsWith("Da"));
        System.out.println("Starts with ka:" + nizZnakova.startsWith("ka"));
        System.out.println("Substring:" + nizZnakova.substring(6));



        */
        //Zadatak 1.
        Scanner unos = new Scanner(System.in);
        System.out.println("unesite niz znakova:");
        String znakovi = unos.nextLine();


        int slova = 0;
        int brojevi = 0;
        int ostaliZnakovi = 0;

        for (char znak: znakovi.toCharArray()) {
            if(Character.isLetter(znak)){
                slova++;
            }
            else if(Character.isDigit(znak)){
                brojevi++;
            }
            else {
                ostaliZnakovi++;
            }
        }

        System.out.println("Slova: " + slova + " Brojevi: " + brojevi + " Ostali znakovi: " +ostaliZnakovi);


        //Zadatak 2.

        System.out.println("unesite niz znakova:");
        String nizZnakova = unos.nextLine();
        unos.close();


        List<String> rijeci = Arrays.asList(nizZnakova.split("\\s+"));
        Collections.reverse(rijeci);

        System.out.println("Obrnuti redoslijed: " + String.join(" ",rijeci));














/*
        Scanner unos = new Scanner(System.in);
        System.out.println("upisite vrjednost");
        double broj = unos.nextDouble();
        ArrayList<Double> listaNovcanica = new ArrayList<>(Arrays.asList(500.0, 200.0, 100.0, 50.0, 20.0, 10.0, 5.0, 2.0, 1.0, 0.5, 0.2, 0.1, 0.02, 0.01));
        double kolikoPuta;

        for (double novcanica : listaNovcanica) {
            kolikoPuta = (int) (broj / novcanica);

            if (kolikoPuta > 0) {
                System.out.println((int) kolikoPuta + " novčanica od " + novcanica);
            }

            broj -= kolikoPuta * novcanica;
            broj = Math.round(broj * 100.0)/100.0;
        }
    */

        /*


        //Zadatak 1.
        Pattern uzorak = Pattern.compile("Algebra",Pattern.CASE_INSENSITIVE);
        Matcher matcher = uzorak.matcher("Posjetite Algebra Sveuciliste!");
        boolean pronadenUzorak = matcher.find();
        if(pronadenUzorak){
            System.out.println("Pronaden uzorak");
        }
        else{
            System.out.println("Nije pronaden uzorak");
        }
        //Zadatak 2.
        Scanner unos = new Scanner(System.in);
        System.out.println("Zadatak 2.");
        System.out.print("Unesite broj: ");

        int brojKojiProvjeravamo = Integer.parseInt(unos.nextLine());

        int sumaDjelitelja = 0;


        for (int i = 1; i < brojKojiProvjeravamo; i++) {
            if (brojKojiProvjeravamo % i == 0) {
                sumaDjelitelja += i;
            }
        }


        if (sumaDjelitelja == brojKojiProvjeravamo) {
            System.out.println(brojKojiProvjeravamo + " je savršen broj.");
        } else {
            System.out.println(brojKojiProvjeravamo + " nije savršen broj.");
        }

        //Zadatak 3.
        System.out.println("Zadatak 3.");
        System.out.print("Unesite broj ocjena: ");
        int brojOcjena = Integer.parseInt(unos.nextLine());

        int suma = 0;

        for (int i = 0; i < brojOcjena; i++) {
            System.out.print("Unesite ocjenu " + (i + 1) + ": ");
            int ocjena = Integer.parseInt(unos.nextLine());
            suma += ocjena;
        }

        double prosjek = (double) suma / brojOcjena;
        System.out.printf("Prosjek ocjena: %.2f\n", prosjek);
        unos.close();


        /*
/*
        String znakovi [] = new String[5];

        for (String s : znakovi) {
            System.out.println(s);
        }
*/





/*
        int brojevi[] = new int[5];
        brojevi[0] = 0;
        brojevi[1] = 2;
        brojevi[2] = 4;
        brojevi[3] = 6;
        brojevi[4] = 8;

        for (int i = 0; i < brojevi.length; i++) {
            brojevi[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(brojevi);

        for (int i = brojevi.length-1; i >= 0; i--) {
            System.out.println(brojevi[i]);
        }
*/
  /*
        for (int broj : brojevi) {
            System.out.println(broj);
        }

*/












/*
        Scanner unos = new Scanner(System.in);
        int prviBroj = 0, drugiBroj = 0;

        while (true) {
            try {
                System.out.println("Unesi dva cijela broja: ");
                prviBroj = unos.nextInt();
                drugiBroj = unos.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Greška: Unesite samo cijele brojeve!");
                unos.nextLine();
            }
        }

        System.out.println("Zbroj: " + (prviBroj + drugiBroj) + " Umnozak: " + (prviBroj * drugiBroj));


        System.out.println("Unesite godinu: ");
        int godina = unos.nextInt();
        if ((godina % 4 == 0 && godina % 100 != 0) || godina % 400 == 0) {
            System.out.println("Godina je prijestupna.");
        } else {
            System.out.println("Godina nije prijestupna.");
        }


        unos.close();*/
    }
}

     /*   int suma = 0;
        int j;
        int znam;
        int brojKvadrata = 0;
        for(int i = 153;i <= 10000; i++){
            j = i;
            suma = 0;
            brojKvadrata = 0;
            while(j > 0){
                brojKvadrata++;
                j/=10;
            }
            j= i;
            while(j > 0){
                znam = j % 10;
              //  suma += Math.pow(znam,3);
                suma += Math.pow(znam,brojKvadrata);
                j/=10;

            }

            if(suma == i){
                System.out.println(i);
            }
        }


*/


/*
        boolean jeProst;
        int n = 50;
        for (int i = 1; i <= n; i++) {
            if (i == 1) { continue; }

            jeProst = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    jeProst = false;
                    break;
                }
            }
            if (jeProst) // je li prost?
                System.out.println(i); // Da, ispiši ga
        }


*/

/*
        int faktorijel = 1;

        for (int i = 1; i <= 10; i++) {
            faktorijel = 1;

            for (int j = 1; j <= i; j++) {
                faktorijel *= j;
            }

            System.out.println(i + "! = " + faktorijel);
        }

*/
            //for(int i = 1; i <= 10;i++){
          //  for(int j = 1; j <= 12;j++){
                //     System.out.print("\t" + ((i-1) * 12 + j));
          //  }
            //   System.out.println();
      //  }








     /*   Zadaca27_01 instance = new Zadaca27_01();
        //Prvi zadatak
        int randomBroj =(int)(Math.random()*100000);

        int zbrojZnamenki = instance.zadacaPrviZadatak(randomBroj);
        System.out.println("Zbroj znamenki broja " + randomBroj + " je: " + zbrojZnamenki);

        //Drugi zadatak
        instance.zadacaDrugiZadatak();
*/




/*
        short x = 2;
        long myWidth;
        myWidth = 5252;
        float decimalni = 3.12323F;
        double decimalni2 = 3.12323;
        char znak =(char)65;
        int baze = 5;
        int algoritmi = 4;
        int praktikum = 3;
        int osnove = 3;
        double prosjek =(double)(baze+algoritmi+praktikum+osnove)/4;



        System.out.println( x + myWidth );
        System.out.println( x - myWidth );
        System.out.println( x * myWidth );
        System.out.println((double) x / myWidth );
        System.out.println( x % myWidth);

        System.out.println();
        System.out.println();

        System.out.println( decimalni * myWidth );
        System.out.println( (int)decimalni - myWidth );
        System.out.println( myWidth / decimalni2 );
        System.out.println( myWidth % decimalni2 );
        System.out.println( decimalni * x );

        System.out.printf("%n");
        System.out.printf("printf%n");
        System.out.printf("-----------------%n");

        System.out.printf( "%.2f%n",decimalni * myWidth );
        System.out.printf( "%2d%n",(int)decimalni % myWidth );
        System.out.printf( "%.8f%n",(double)decimalni * myWidth );
        System.out.println();
        System.out.println();
        System.out.print((char)(znak+1));
        System.out.print((char)(znak+17));
        System.out.print((znak));
        System.out.print((char)(znak+21));
        System.out.print((char)(znak+14));
        System.out.println();

        System.out.println(Math.round(prosjek));
        System.out.println();
        System.out.println();

        System.out.println("Zadatak");
        System.out.println("______________________");
        System.out.println("10 na trecu: "+ (int)Math.pow(10,3));
        System.out.println("zaokruzivanje konstante E: "+ Math.round(Math.E));
        System.out.println("korijen od 400: "+ Math.round(Math.sqrt(400)));

        System.out.println("zaokruzivanje na dve decimale: "+ Math.round(Math.E*100)/100f);
        System.out.println();

        //Domaca zadaca
        //1.zadatak
        System.out.println("1.zadatak");
        int prviBroj = 4;
        int drugiBroj = 2;
        System.out.println("Zbroj broja "+prviBroj+" + "+ drugiBroj+" = "+ (prviBroj+drugiBroj));
        System.out.println();

        //2.Zadatak
        System.out.println("2.zadatak");
        System.out.printf("Gabriel Peičić%n%nZagreb%n%n");

        //3.Zadatak
        System.out.println("3.Zadatak");
        int a = 10;
        int b = 12;
        double c;
        c=Math.sqrt(((Math.pow(a,2))+(Math.pow(b,2))));
        System.out.println("Duljina hipotenuze je "+ c);*/
//    }
//}
