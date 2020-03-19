package de.sebastian;
//Main
public class Main {

    public static void main(String[] args) {

        // Kreis
        Kreis K =new Kreis();

        System.out.println("Kreis: ");
        System.out.println( K.getFlaecheKreis());
        System.out.println(K.getUmfangKreis());

        // Quadrat
        Quadrat Q= new Quadrat();

        System.out.println("Quadrat: ");
        System.out.println( Q.getFlaecheQuadrat());
        System.out.println( Q.getUmfangQuadrat());

        //Rechteck

        Rechteck R= new Rechteck();
        System.out.println("Rechteck: ");
        System.out.println( R.getFlaecheRechteck());
        System.out.println( R.getUmfangRechteck());


        //Dreieck

        Dreieck D = new Dreieck();

        System.out.println("Dreieck: ");
        System.out.println( D.getFlaecheDreieck());
        System.out.println( D.getUmfangDreieck());

    }
}

