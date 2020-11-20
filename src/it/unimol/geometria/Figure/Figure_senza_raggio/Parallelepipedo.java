package it.unimol.geometria.Figure.Figure_senza_raggio;

import it.unimol.geometria.Misure_figure;

public class Parallelepipedo extends Misure_figure {

    public Parallelepipedo(){}

    @Override
    public double superficie() {

        // OPERAZIONI INTERMEDIE
        double perimetro_base = 2 * (larghezza + lunghezza);
        double area_base = larghezza * lunghezza;
        double superficie_laterale = perimetro_base * altezza;
        //

        double superficie_totale_parallelepipedo = superficie_laterale + (2 * area_base);

        return superficie_totale_parallelepipedo;
    }

    @Override
    public double volume() {
        double area_base = larghezza * lunghezza;
        double volume_Parallelepipedo = area_base * altezza;

        return volume_Parallelepipedo;
    }

    @Override
    public boolean isValid() {
        return lunghezza >= 0 && altezza >= 0 && larghezza >= 0;
    }

    @Override
    public String prendi_solido() {
        return "parallelepipedo";}

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