package it.unimol.geometria.Supporto_main;

import it.unimol.geometria.Misure_figure;

import java.util.ArrayList;

public class Aiuto_case2 {

    public double calcolo_volume(ArrayList<Misure_figure> lista_figure){

        double somma_volumi = 0;

        for (Misure_figure misure : lista_figure) {
            somma_volumi = somma_volumi + (misure.somma_dei_volumi());

        }
        return somma_volumi;
    }
    public double calcolo_superficie(ArrayList<Misure_figure> lista_figure){

        double somma_superfici = 0;



        for (Misure_figure misure : lista_figure) {
            somma_superfici = somma_superfici + (misure.somma_delle_superfici());

        }
        return somma_superfici;
    }
}
