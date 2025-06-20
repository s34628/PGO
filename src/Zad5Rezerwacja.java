import java.util.ArrayList;
public class SystemRezerwacji {


      private ArrayList<Wydarzenie> listaWydarzen;
      private ArrayList<Klient> listaKlientow;

              public SystemRezerwacji()
    {
            this.listaWydarzen = new ArrayList<Wydarzenie>();
            this.listaKlientow = new ArrayList<Klient>();
      }

      public void dodajWydarzenie(Wydarzenie wydarzenie) {
            listaWydarzen.add(wydarzenie);
        System.out.println("Dodano wydarzenie do listy!");
      }

      public void dodajWydarzenie(String nazwa, double cena) {
            Wydarzenie noweWydarzenie = new Wydarzenie(nazwa, cena);
            listaWydarzen.add(noweWydarzenie);
        System.out.println("Stworzono i dodano nowe wydarzenie: " + nazwa);
      }
      public void dodajKlienta(Klient klient) {
            listaKlientow.add(klient);
      }
      public void dodajKlienta(String imie, String nazwisko, String mail) {
            Klient nowyKlient = new Klient(imie, nazwisko, mail);
            listaKlientow.add(nowyKlient);
      }

      public void dokonajRezerwacji(Klient klient, Wydarzenie wydarzenie)
    {
            if (listaKlientow.contains(klient) && listaWydarzen.contains(wydarzenie))
    {
                  if (wydarzenie.getDostepneMiejsca() > 0)
    {
                        wydarzenie.zarezerwujMiejsce();
                        klient.dodajRezerwacje(wydarzenie);
        System.out.println("Rezerwacja udana! Klient " + klient.getNazwisko() + " zarezerwował miejsce na " + wydarzenie.getNazwa());
                  } else {
                        System.out.println("Brak dostępnych miejsc na wydarzenie: " + wydarzenie.getNazwa());
                  }
            } else {
        System.out.println("Błąd: Nie znaleziono klienta lub wydarzenia w systemie.");
    }
      }

      public Wydarzenie znajdzWydarzenie(String nazwa) {
            for (Wydarzenie w : listaWydarzen) {
                  if (w.getNazwa().equals(nazwa)) {
                        return w;
                  }
            }
            return null;
      }

      public Klient znajdzKlienta(String nazwisko) {
            for (int i = 0; i < listaKlientow.size(); i++) {
            Klient k = listaKlientow.get(i);
                  if (k.getNazwisko().equals(nazwisko)) {
                        return k;
                  }
            }
            return null;
      }

      public void zmienCeneWydarzenia(String nazwa, double nowaCena) {
            Wydarzenie wydarzenie = znajdzWydarzenie(nazwa);
            if (wydarzenie != null) {
                  wydarzenie.setCena(nowaCena);
            System.out.println("Cena zmieniona!");
            } else {
            System.out.println("Nie udało się zmienić ceny, nie ma takiego wydarzenia.");
        }
      }
}