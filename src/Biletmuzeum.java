import java.util.Scanner;
public class Biletmuzeum {
    public static void main(String[] args) {
        final double kosztorg = 40.0;
        double kosztfinalny = kosztorg;
        double znizkafinalny = 0;
        StringBuilder powoduznizka = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj twoj miasto zamieszkiwania: ");
        String Miasto = scanner.nextLine().trim();
        System.out.print("Podaj wiek: ");
        int wiek = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Podaj dzien tygodnia: ");
        String dayOfWeek = scanner.nextLine().trim();
        if (dayOfWeek.equalsIgnoreCase("Czwartek")) {
            kosztfinalny = 0;
            powoduznizka.append("Darmowa we Czwartek");
        } else {
            if (wiek < 10) {
                kosztfinalny = 0;
                powoduznizka.append("Darmowy dla dzieci < 10");
            } else {
                if (wiek >= 10 && wiek <= 18) {
                    znizkafinalny += 50;
                    powoduznizka.append("50% znizka dla dzieci (10-18). ");
                }
                if (Miasto.equalsIgnoreCase("Warszawa")) {
                    znizkafinalny += 10;
                    powoduznizka.append("10% znizka dla warsowian. ");
                }
                if (kosztfinalny != 0 && znizkafinalny > 0) {
                    kosztfinalny = kosztorg * (1 - znizkafinalny / 100);
                }
            }
        }
        System.out.println("\nData: " + Miasto + ", " + wiek + " lat, " + dayOfWeek);
        System.out.printf("Cena biletu: %.2f PLN\n", kosztfinalny);
        if (powoduznizka.length() > 0) {
            System.out.println("Znizka: " + powoduznizka);
        } else {
            System.out.println("Znizka: Zadny");
        }
        scanner.close();
    }
}