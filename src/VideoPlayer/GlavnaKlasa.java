package VideoPlayer;

public class GlavnaKlasa {
    public static void main(String[] args) {

        VideoPlayer v = new VideoPlayer(60.0,80,55.0,240);

        TimeControl tc = new TimeControl(true);
        QualityOptimiserControl qc = new QualityOptimiserControl(150);
        AudioControl ac = new AudioControl(false);


        //U zadatku KlaseVideoPlayer umesto metode stampaj koristi metodu toString iz Object klase i override-uj je.

        tc.izvrsiAkciju(v);
        tc.izvrsiAkciju(v);
        qc.izvrsiAkciju(v);
        ac.izvrsiAkciju(v);
        System.out.println(v);

        //v.stampa();






    }


}
