package Kartice_UM;

public class MasterKartica extends PlatnaKartica {

    public MasterKartica(double suma, String brojKartice, int mesec, int godina) {
        super(suma, brojKartice, mesec, godina);
    }

    public void izvrsiTransakciju (double isplata) {
        double provizija = isplata * 0.015;
        super.izvrsiTransakciju(isplata + provizija);
    }

    public void odrzavanje () {
        super.izvrsiTransakciju(2);
    }



    public void stampa () {
        System.out.println("Master Card: " + super.getBrojKartice() + ", " + super.getMesec() + "/" + super.getGodina() + ", $" + super.getSuma());
    }







}
