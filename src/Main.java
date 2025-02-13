import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<GeometrijskiLik> likovi = new ArrayList<>();
        int izbor;
        int izborLika;

        while(true){
            System.out.println("Odaberite Opciju: ");
            System.out.println("1.Novi Geometrijski lik");
            System.out.println("2. Izlaz");

            izbor = scanner.nextInt();
            if(izbor == 2){
                break;
            }
            if(izbor == 1){
                System.out.println("izaberite koji geometrijski lik:");
                System.out.println("1.Pravokutnik");
                System.out.println("2.Krug");
                System.out.println("3.Trokut");
                izborLika = scanner.nextInt();

                switch (izborLika) {
                    case 1 -> {
                        System.out.println("Unesite prvu stranicu pravokutnika");
                        double stranica1 = scanner.nextDouble();
                        System.out.println("Unesite drugu stranicu pravokutnika");
                        double stranica2 = scanner.nextDouble();
                        likovi.add(new Pravokutnik(stranica1, stranica2));
                    }
                    case 2 -> {
                        System.out.println("Unesite radijus kruga");
                        double radijus = scanner.nextDouble();
                        likovi.add(new Krug(radijus));
                    }
                    case 3 -> {
                        System.out.println("Unesite prvu stranicu trokuta");
                        double stranicaTrokuta1 = scanner.nextDouble();
                        System.out.println("Unesite drugu stranicu trokuta");
                        double stranicaTrokuta2 = scanner.nextDouble();
                        System.out.println("Unesite trecu stranicu trokuta");
                        double stranicaTrokuta3 = scanner.nextDouble();
                        likovi.add(new Trokut(stranicaTrokuta1, stranicaTrokuta2, stranicaTrokuta3));
                    }
                    default -> System.out.println("Neispravan unos!");
                }
                System.out.println();
                System.out.println();
                for (GeometrijskiLik lik : likovi) {
                    lik.ispisiPodatke();
                }
                System.out.println("_________________________________");
                System.out.println();

            }
            else{
                System.out.println("Neispravan unos!");
            }
        }
        scanner.close();
    }
}






