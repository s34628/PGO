public class Wydarzenie {
    private String nazwa;
    private String data;
    private String miejsce;
    private int maxLiczbaMiejsc = 100;
    private int dostepnemiejsce;
    private double cena;

    public Wydarzenie(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.dostepnemiejsce = this.maxLiczbaMiejsc;
    }
    public Wydarzenie(String nazwa, double cena, String data) {
        this(nazwa, cena);
        this.data = data;
    }
    public Wydarzenie(String nazwa, double cena, String data, String miejsce) {
        this(nazwa, cena, data);
        this.miejsce = miejsce;
    }
    public String getNazwa() {
        return nazwa;
    }
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getMiejsce() {
        return miejsce;
    }
    public void setMiejsce(String miejsce) {
        this.miejsce = miejsce;
    }
    public int getMaxLiczbaMiejsc() {
        return maxLiczbaMiejsc;
    }
    public void setMaxLiczbaMiejsc(int maxLiczbaMiejsc) {
        this.maxLiczbaMiejsc = maxLiczbaMiejsc;
    }
    public int getdostepnemiejsce() {
        return dostepnemiejsce;
    }
    public void setdostepnemiejsce(int dostepnemiejsce) {
        this.dostepnemiejsce = dostepnemiejsce;
    }
    public double getCena() {
        return cena;
    }
    public void setCena(double cena) {
        this.cena = cena;
    }

    public void zarezerwujMiejsce() {
        if (this.dostepnemiejsce > 0) {
            this.dostepnemiejsce--;
        }
    }
    @Override
    public String toString() {
        return "Wydarzenie: " + nazwa + ", Cena: " + cena + " zł";
    }
}