public class Zadaca27_01 {
    //Zadatak 1.
    public int zadacaPrviZadatak(int randomBroj){
        int suma = 0;
        while (randomBroj != 0) {
            suma += randomBroj % 10;
            randomBroj /= 10;
        }
        return (suma == 0) ? 0 : suma + zadacaPrviZadatak(randomBroj);
    }

    //Zadatak 2.
    public void zadacaDrugiZadatak(){
        int i = 1;
        int j = 1000;
        int zbrojBrojeva = 0;
            while(i <= j){
                if(i % 7 == 0){
                    zbrojBrojeva += i;
                }
                i++;
            }

        System.out.println("zbroj brojeva je: " + zbrojBrojeva);
    }
}
