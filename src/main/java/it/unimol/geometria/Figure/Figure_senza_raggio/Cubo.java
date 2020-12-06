package it.unimol.geometria.Figure.Figure_senza_raggio;


import it.unimol.geometria.Geometria.Misure_figure;

public class Cubo extends Misure_figure {

    public Cubo () {}

    @Override
    public double superficie() {

        double superficie_totale_cubo = Math.pow(lunghezza,2)*6;

        return superficie_totale_cubo;
    }

    @Override
    public double volume() {
        double volume_cubo = Math.pow(lunghezza,3);

        return volume_cubo;
    }

    @Override
    public boolean isValid() {
        return lunghezza >= 0 ;
    }

    @Override
    public String prendi_solido() {
        return "cubo";
    }

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
