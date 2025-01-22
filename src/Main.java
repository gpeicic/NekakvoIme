
public class Main {
    public static void main(String[] args) {

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
        int prviBroj = 4;
        int drugiBroj = 2;
        System.out.println("Zbroj broja "+prviBroj+" + "+ drugiBroj+" = "+ (prviBroj+drugiBroj));
        System.out.println();

        //2.Zadatak
        System.out.printf("Gabriel Peičić%n%nZagreb%n");

        //3.Zadatak
        int a = 10;
        int b = 12;
        double c;
        c=Math.sqrt(((Math.pow(a,2))+(Math.pow(b,2))));
        System.out.println("Duljina hipotenuze je "+ c);
    }
}
