package it.unimol.geometria.Supporto_main;

import it.unimol.geometria.Misure_figure;

import java.util.ArrayList;

public class Aiuto_case3 {
    public double calcolo_distanza(ArrayList<Misure_figure> lista_figure, String figura_1,String figura_2) {

        int appoggio=0;
        for (Misure_figure misure : lista_figure) {
            if (figura_1.equals(misure.getNome())) {
                double x = misure.coordinate_x();
                double y = misure.coordinate_y();
                double z = misure.coordinate_z();
                for (Misure_figure misure_2 : lista_figure) {
                    if (figura_2.equals(misure_2.getNome())) {
                        double x_2 = misure_2.coordinate_x();
                        double y_2 = misure_2.coordinate_y();
                        double z_2 = misure_2.coordinate_z();

                        double distanza_solidi = misure.calcolo_distanza(x, y, z, x_2, y_2, z_2);
                        return distanza_solidi;
                    } else
                       appoggio=0;
                }
            } else
                appoggio=1;

        }
      return appoggio;
    }
}
