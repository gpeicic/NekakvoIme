

public class Main {
    public static void main(String[] args) {
        int suma = 0;
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
            }
            //   System.out.println();
        }








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
