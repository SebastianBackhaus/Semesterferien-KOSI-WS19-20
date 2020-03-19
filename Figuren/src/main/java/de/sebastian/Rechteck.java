package de.sebastian;
//Rechteck
public class Rechteck {

    double a = 4.5, b = 6.5;

    double  FlaecheRechteck = a * b;
    double UmfangRechteck = (2 * a + 2 * b);


    public double getFlaecheRechteck() {
        return FlaecheRechteck;
    }

    public double getUmfangRechteck() {
        return UmfangRechteck;
    }
}