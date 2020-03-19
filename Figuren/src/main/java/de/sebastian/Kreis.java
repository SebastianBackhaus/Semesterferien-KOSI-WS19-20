package de.sebastian;
//Kreis
public class Kreis {
    private double radius = 4;


    private double FlaecheKreis = (3.14 * radius);

    private double UmfangKreis = (2 * 3.14 * radius);




    public double getFlaecheKreis() {
        return FlaecheKreis;
    }

    public double getUmfangKreis() {
        return UmfangKreis;
    }

}