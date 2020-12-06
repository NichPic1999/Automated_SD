package it.unimol.geometria.Figure.figure_con_raggio;

import it.unimol.geometria.Geometria.Misure_figure;
import it.unimol.geometria.Op_solidi;

public class Sfera extends Misure_figure implements Op_solidi {

    public Sfera(){}

    @Override
    public double superficie() {

        double superficie_sfera = 4*3.14*Math.pow(raggio,2);

        return superficie_sfera;
    }

    @Override
    public double volume() {
        double volume_sfera =  4/3*3.14*Math.pow(raggio,3);

        return volume_sfera;
    }

    @Override
    public boolean isValid() {
        return raggio >=0;}

    @Override
    public String prendi_solido() {
        return "sfera";}

    @Override
    public double coordinate_x() {
        x=getX();
        return x;

    } public double coordinate_y() {
        y=getY();
        return y;

    }
    public double coordinate_z() {
        z=getZ();
        return z;
    }
}
