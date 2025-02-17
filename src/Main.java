import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Proizvod> proizvodi = new ArrayList<>();

        while (true){
            System.out.println("Odaberi opciju:");
            System.out.println("1.Unos novog proizvoda");
            System.out.println("2.Izlaz");
            int flag = scanner.nextInt();
            scanner.nextLine();

            if(flag == 1){
                Proizvod proizvod = new Proizvod();
                System.out.print("Upisite naziv proizvoda:");
                System.out.println();
                proizvod.setNaziv(scanner.nextLine());
                System.out.println("Upisite cijenu proizvoda");
                proizvod.setCijena(scanner.nextDouble());
                System.out.println("upisite kolicinu proizvoda");
                proizvod.setKolicina(scanner.nextDouble());
                proizvodi.add(proizvod);
            }
            else if(flag == 2){
                break;
            }
            else{
                System.out.println("Krivi broj ste unijeli!");
            }
        }

        scanner.close();
        /*
        for(Proizvod proizvod : proizvodi){
            proizvod.prikaziInformacije();
        }
        */

        //drugiNacin
        for (Proizvod proizvod: proizvodi) {
            prikazInformacija(proizvod);
        }

    }

    public static void prikazInformacija(Proizvod proizvod){
        System.out.println("Naziv: " + proizvod.getNaziv() + " " + "Cijena: " + proizvod.getCijena() + " " + "Kolicina: " + proizvod.getKolicina());
    }
}






