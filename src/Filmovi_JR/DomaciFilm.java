package Filmovi_JR;

public class DomaciFilm extends Film {

    private String gradSnimanja;


    public DomaciFilm(int godinaIzlaska, double zarada, String zanr, String nazivFilma, String gradSnimanja) {
        super(godinaIzlaska, zarada, zanr, nazivFilma);
        this.gradSnimanja = gradSnimanja;
    }

    public String getGradSnimanja() {
        return gradSnimanja;
    }
}
