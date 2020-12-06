package it.unimol.geometria.Figure.figure_con_raggio;


        import it.unimol.geometria.Geometria.Misure_figure;
        import it.unimol.geometria.Op_solidi;


public class Cilindro extends Misure_figure implements Op_solidi {

    public Cilindro (){}

    @Override
    public double superficie() {

        //OPERAZIONI INTERMEDIE
        double superficie_laterale = altezza * 3.14 * 2 * raggio;
        double area_base_cilindro = Math.pow(raggio,2)* 3.14;
        //

            double superficie_totale_cilindro = superficie_laterale + 2 * area_base_cilindro;

            return superficie_totale_cilindro;
        }

    @Override
    public double volume() {
        double volume_cilindro = Math.pow(raggio,2)*3.14*altezza;

        return volume_cilindro;
    }

    @Override
    public boolean isValid() {
        return altezza >= 0 && raggio >=0;}

    @Override
    public String prendi_solido() {
        return "cilindro";}

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


