package it.unimol.geometria.Figure.figure_con_raggio;

import it.unimol.geometria.Misure_figure;
import it.unimol.geometria.Op_solidi;

public class Cono extends Misure_figure implements Op_solidi {

    public Cono() {}


    @Override
    public double superficie() {

        //OPERAZIONI INTERMEDIE
        double apotema = Math.sqrt(Math.pow(raggio, 2) + Math.pow(altezza, 2));
        double superficie_laterale = 3.14 * raggio * apotema;
        double area_base_cono =  Math.pow(raggio,2)* 3.14;
        //

        double superficie_totale_cono = superficie_laterale + area_base_cono;

        return superficie_totale_cono;
    }

    @Override
    public double volume() {
        double volume_cono = (3.14 * altezza * Math.pow(raggio, 2)) / 3;

        return volume_cono;
    }

    @Override
    public boolean isValid() {
        return altezza >= 0 && raggio >= 0;
    }

    @Override
    public String prendi_solido() {
        return "Cono";}

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
