public class Zadatak2 {
    public static void main(String[] args) {
        //napisati program koji cita parametar args iz main metode i stampa svaki od clanova niza args na novoj liniji.
        //Run > Edit configuration > program arguments

        System.out.println(args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }




    }
}
