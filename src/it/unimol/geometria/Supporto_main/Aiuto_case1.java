package it.unimol.geometria.Supporto_main;

import it.unimol.geometria.Figure.Figure_senza_raggio.Cubo;
import it.unimol.geometria.Figure.Figure_senza_raggio.Parallelepipedo;
import it.unimol.geometria.Figure.Figure_senza_raggio.Piramide_base_quadrata;
import it.unimol.geometria.Figure.figure_con_raggio.Cilindro;
import it.unimol.geometria.Figure.figure_con_raggio.Cono;
import it.unimol.geometria.Figure.figure_con_raggio.Piramide_base_triangolare;
import it.unimol.geometria.Figure.figure_con_raggio.Sfera;

import java.util.Scanner;

public class Aiuto_case1 {

    public  Cubo dati_cubo() {

        Cubo cubo = new Cubo();
        Scanner inserisci = new Scanner(System.in);

        System.out.println("inserisci il nome del cubo");
        cubo.setNome(inserisci.nextLine());
        System.out.println("inserisci il lato del cubo");
        cubo.setLunghezza(inserisci.nextDouble());
        System.out.println("inserisci cordinata x del cubo");
        cubo.setX(inserisci.nextDouble());
        System.out.println("inserisci cordinata y del cubo");
        cubo.setY(inserisci.nextDouble());
        System.out.println("inserisci cordinata z del cubo");
        cubo.setZ(inserisci.nextDouble());


        return cubo;
    }

    public Parallelepipedo dati_parallelepipedo() {

        Parallelepipedo parallelepipedo = new Parallelepipedo();
        Scanner inserisci = new Scanner(System.in);

        System.out.println("inserisci il nome del parallelepipedo");
        parallelepipedo.setNome(inserisci.nextLine());
        System.out.println("inserisci la lunghezza del parallelepipedo");
        parallelepipedo.setLunghezza(inserisci.nextDouble());
        System.out.println("inserisci la larghezza del parallelepipedo");
        parallelepipedo.setLarghezza(inserisci.nextDouble());
        System.out.println("inserisci l'altezza del parallelepipedo");
        parallelepipedo.setAltezza(inserisci.nextDouble());
        System.out.println("inserisci cordinata x del parallelepipedo");
        parallelepipedo.setX(inserisci.nextDouble());
        System.out.println("inserisci cordinata y del parallelepipedo");
        parallelepipedo.setY(inserisci.nextDouble());
        System.out.println("inserisci cordinata z del parallelepipedo");
        parallelepipedo.setZ(inserisci.nextDouble());

        return parallelepipedo;
    }

    public Piramide_base_quadrata dati_piramide_a_base_quadrata() {

        Piramide_base_quadrata piramide_base_quadrata = new Piramide_base_quadrata();
        Scanner inserisci = new Scanner(System.in);

        System.out.println("inserisci il nome della piramide a base quadrata");
        piramide_base_quadrata.setNome(inserisci.nextLine());
        System.out.println("inserisci la lunghezza della piramide a base quadrata");
        piramide_base_quadrata.setLunghezza(inserisci.nextDouble());
        System.out.println("inserisci l'altezza della piramide a base quadrata");
        piramide_base_quadrata.setAltezza(inserisci.nextDouble());
        System.out.println("inserisci cordinata x della piramide a base quadrata");
        piramide_base_quadrata.setX(inserisci.nextDouble());
        System.out.println("inserisci cordinata y della piramide a base quadrata");
        piramide_base_quadrata.setY(inserisci.nextDouble());
        System.out.println("inserisci cordinata z della piramide a base quadrata");
        piramide_base_quadrata.setZ(inserisci.nextDouble());


        return piramide_base_quadrata;
    }

    public Piramide_base_triangolare dati_piramide_a_base_triangolare() {

        Piramide_base_triangolare piramide_base_triangolare = new Piramide_base_triangolare();
        Scanner inserisci = new Scanner(System.in);

        System.out.println("inserisci il nome della piramide a base triangolare");
        piramide_base_triangolare.setNome(inserisci.nextLine());
        System.out.println("inserisci il raggio della base della piramide a base triangolare");
        piramide_base_triangolare.setRaggio(inserisci.nextDouble());
        System.out.println("inserisci l'altezza della piramide a base triangolare");
        piramide_base_triangolare.setAltezza(inserisci.nextDouble());
        System.out.println("inserisci cordinata x della piramide a base triangolare");
        piramide_base_triangolare.setX(inserisci.nextDouble());
        System.out.println("inserisci cordinata y della piramide a base triangolare");
        piramide_base_triangolare.setY(inserisci.nextDouble());
        System.out.println("inserisci cordinata z della piramide a base triangolare");
        piramide_base_triangolare.setZ(inserisci.nextDouble());


        return piramide_base_triangolare;
    }

    public Cilindro dati_cilindro() {

        Cilindro cilindro = new Cilindro();
        Scanner inserisci = new Scanner(System.in);

        System.out.println("inserisci il nome del cilindro");
        cilindro.setNome(inserisci.nextLine());
        System.out.println("inserisci il raggio del cilindro");
        cilindro.setRaggio(inserisci.nextDouble());
        System.out.println("inserisci l'altezza del cilindro");
        cilindro.setAltezza(inserisci.nextDouble());
        System.out.println("inserisci cordinata x del cilindro");
        cilindro.setX(inserisci.nextDouble());
        System.out.println("inserisci cordinata y del cilindro");
        cilindro.setY(inserisci.nextDouble());
        System.out.println("inserisci cordinata z del cilindro");
        cilindro.setZ(inserisci.nextDouble());


        return cilindro;
    }

    public Cono dati_cono() {

        Cono cono = new Cono();
        Scanner inserisci = new Scanner(System.in);

        System.out.println("inserisci il nome del cono");
        cono.setNome(inserisci.nextLine());
        System.out.println("inserisci il raggio del cono");
        cono.setRaggio(inserisci.nextDouble());
        System.out.println("inserisci l'altezza del cono");
        cono.setAltezza(inserisci.nextDouble());
        System.out.println("inserisci cordinata x del cono");
        cono.setX(inserisci.nextDouble());
        System.out.println("inserisci cordinata y del cono");
        cono.setY(inserisci.nextDouble());
        System.out.println("inserisci cordinata z del cono");
        cono.setZ(inserisci.nextDouble());


        return cono;
    }

    public Sfera dati_sfera() {

        Sfera sfera = new Sfera();
        Scanner inserisci = new Scanner(System.in);


        System.out.println("inserisci il nome della sfera");
        sfera.setNome(inserisci.nextLine());
        System.out.println("inserisci il raggio della sfera");
        sfera.setRaggio(inserisci.nextDouble());
        System.out.println("inserisci cordinata x della sfera");
        sfera.setX(inserisci.nextDouble());
        System.out.println("inserisci cordinata y della sfera");
        sfera.setY(inserisci.nextDouble());
        System.out.println("inserisci cordinata z della sfera");
        sfera.setZ(inserisci.nextDouble());


        return sfera;
    }

}
