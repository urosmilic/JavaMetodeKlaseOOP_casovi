package TestiranjeUcenika;

public abstract class Pitanje {
    /*Napisati apstraktnu klasu Pitanje koja ima atribute:
            String tekstPitanja
            int brojMaxPoena (>0)
            Int osvojenBrojPoena (>=0)
            boolean pitanjePregledano
    Geteri i seteri za ove attribute*/

    private String tekstPitanja;
    private int brojMaxPoena;
    private int osvojenBrojPoena;
    private boolean pitanjePregledano;

    public Pitanje(String tekstPitanja, int brojMaxPoena, int osvojenBrojPoena, boolean pitanjePregledano) {
        this.tekstPitanja = tekstPitanja;

        if (brojMaxPoena < 1) {
            this.brojMaxPoena = 1;
            System.out.println("Unet je negativan broj poena, maksimalni broj poena ce biti postavljen na 1 ");
        }
        else this.brojMaxPoena = brojMaxPoena;

        if (osvojenBrojPoena < 0) {
            this.osvojenBrojPoena = 0;
            System.out.println("Unet je negativan broj poena, osvojen broj poena ce biti postavljen na 0 ");
        }
        else this.osvojenBrojPoena = osvojenBrojPoena;

        this.pitanjePregledano = pitanjePregledano;
    }
    public String getTekstPitanja() {
        return tekstPitanja;
    }

    public void setTekstPitanja(String tekstPitanja) {
        this.tekstPitanja = tekstPitanja;
    }

    public int getBrojMaxPoena() {
        return brojMaxPoena;
    }

    public void setBrojMaxPoena(int brojMaxPoena) {
        if (brojMaxPoena < 1) {
            this.brojMaxPoena = 1;
            System.out.println("Unet je negativan broj poena, maksimalni broj poena ce biti postavljen na 1 ");
        }
        else this.brojMaxPoena = brojMaxPoena;
    }
    public int getOsvojenBrojPoena() {
        return osvojenBrojPoena;
    }
    public void setOsvojenBrojPoena(int osvojenBrojPoena) {
        if (osvojenBrojPoena < 0) {
            this.osvojenBrojPoena = 0;
            System.out.println("Unet je negativan broj poena, osvojen broj poena ce biti postavljen na 0 ");
        }
        else this.osvojenBrojPoena = osvojenBrojPoena;
    }
    public boolean isPitanjePregledano() {
        return pitanjePregledano;
    }

    public void setPitanjePregledano(boolean pitanjePregledano) {
        this.pitanjePregledano = pitanjePregledano;
    }
}
