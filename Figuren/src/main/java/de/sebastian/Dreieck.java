package de.sebastian;
//Dreieck


public class Dreieck {

    double grund = 5, hoehe = 7;
    double a = 10, b = 5, c = 0;

    private double FlaecheDreieck = (0.5 * grund * hoehe);
    private double UmfangDreieck = (a + b + c);


    public double getFlaecheDreieck() {
        return FlaecheDreieck;
    }

    public double getUmfangDreieck() {
        return UmfangDreieck;
    }
}
