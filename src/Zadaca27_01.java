public class Zadaca27_01 {
    //Zadatak 1.
    public int zadacaPrviZadatak(int randomBroj){
        return (randomBroj == 0) ? 0 : (randomBroj % 10) + zadacaPrviZadatak(randomBroj / 10);
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
