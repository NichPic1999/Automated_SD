package it.unimol.geometria.Figure.Figure_senza_raggio;

import it.unimol.geometria.Misure_figure;

public class Piramide_base_quadrata extends Misure_figure {

    public Piramide_base_quadrata(){}

    @Override
    public double superficie() {

        // OPERAZIONI INTERMEDIE
        double perimetro_base = lunghezza*4;
        double apotema_di_base=lunghezza/2;  // serve a calcolare l'apotema della piramide
        double apotema_della_piramide= Math.sqrt(Math.pow(altezza,2)+Math.pow(apotema_di_base,2)); //apotema della piramide
        double area_base = lunghezza*lunghezza;
        double superficie_laterale = (perimetro_base * apotema_della_piramide)/2;
        //

        double superficie_totale_piramide_base_quadrata = (area_base*altezza)/3;

        return superficie_totale_piramide_base_quadrata;
    }

    @Override
    public double volume() {
        double volume_piramide_base_quadrata = Math.pow(lunghezza,3);

        return volume_piramide_base_quadrata;
    }

    @Override
    public boolean isValid() {
        return lunghezza >= 0 && altezza>=0 ;
    }

    @Override
    public String prendi_solido() {
        return "piramide a base quadrata";}

    @Override
    public double coordinate_x() {
        x=getX();
        return x;
    }
    @Override
    public double coordinate_y() {
        y=getY();
        return y;
    }
    @Override
    public double coordinate_z() {
        z=getZ();
        return z;
    }


}
