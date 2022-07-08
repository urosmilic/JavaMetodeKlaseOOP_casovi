package Filmovi_JR;

public class StraniFilm extends Film {


    private boolean oscarNominated;

    public StraniFilm(int godinaIzlaska, double zarada, String zanr, String nazivFilma, boolean oscarNominated) {
        super(godinaIzlaska, zarada, zanr, nazivFilma);
        this.oscarNominated = oscarNominated;
    }

    public boolean isOscarNominated() {
        return oscarNominated;
    }
}
