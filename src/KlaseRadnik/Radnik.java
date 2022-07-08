package KlaseRadnik;

//Zadatak 2 - Napraviti paket "KlaseRadnik" i dve klase - "Radnik" i "MainKlasa". U klasi Radnik deklarisati public atribute jmbg (tipa long),
// ime i prezime (jedan string), broj dece, stepen strucne spreme i radni staz.
//Kreirati pun konstruktor za sve atribute
//Potrebno je izracunati da li je korisnik sposoban za kredit. Ako ima platu vecu od 5000 onda je true, ako ima ispod onda je false
//Platu racunamo tako sto ce se zbir koeficijenta i minulog rada pomnoziti sa 10 000 i na to dodati jos 2500
//Koeficijent se racuna zavisno od stepena strucne spreme preko switch-a
//Stepen strucne spreme moze biti 1,2,3,4 i koeficijent po tom redosledu je 1.03, 2.00, 2.88, 3.40
//Minuli rad se racuna zavisno od radnog staza. Ako je radni staz kraci od 10 godina onda je minuli rad 0.05.
// Ako je izmedju 10 i 20 onda je 0.75 i ako je duzi od 20 onda je 1.0
//Potrebno je izracunati i dane godisnjeg odmora tako sto ce se broj dece pomnoziti sa 2 i na to dodati 22 dana
//Podatke odstampati van MainKlase

public class Radnik {

    public long jmbg;
    public String imeIprezime;
    public int brojDece;
    public int stepenSS;
    public int radniStaz;

    public Radnik (long jmbg, String imeIprezime, int brojDece, int stepenSS, int radniStaz) {
        this.jmbg = jmbg;
        this.imeIprezime = imeIprezime;
        this.brojDece = brojDece;
        this.stepenSS = stepenSS;
        this.radniStaz = radniStaz;
    }

    public double koeficijent (int stepenSS) {
        double koef;
        switch(stepenSS) {
            case 1: koef = 1.03;
                    break;
            case 2: koef = 2.00;
                    break;
            case 3: koef = 2.88;
                break;
            case 4: koef = 3.40;
                break;
            default:koef = 1.0;
            break;
        }
        return koef;
    }

    public double minuliRad (int radniStaz) {
        double minuliRad;

        if (radniStaz < 10) {
            minuliRad = 0.05;
        } else if (radniStaz >= 10 && radniStaz < 20) {
            minuliRad = 0.75;
        } else {
            minuliRad = 1.0;
        }
        return minuliRad;
    }

    public int daniGO (int brDece) {
        int dani = brDece * 2 + 22;
        return dani;
    }

    public double plata () {
        double plata = (minuliRad (this.radniStaz) + koeficijent(this.stepenSS)) * 10000 + 2500;
        return plata;
    }

    public boolean kredit (double plata) {
        boolean kredit;
        if (plata > 50_000) {
            kredit = true;
        } else {
            kredit = false;
        }
        return kredit;
    }

    public void stampa () {
        System.out.println();
    }
}
