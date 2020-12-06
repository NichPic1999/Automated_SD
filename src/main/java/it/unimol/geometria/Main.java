package it.unimol.geometria;

import it.unimol.geometria.Geometria.Misure_figure;
import it.unimol.geometria.Figure.Figure_senza_raggio.Cubo;
import it.unimol.geometria.Figure.Figure_senza_raggio.Parallelepipedo;
import it.unimol.geometria.Figure.figure_con_raggio.Cilindro;
import it.unimol.geometria.Figure.figure_con_raggio.Cono;
import it.unimol.geometria.Figure.figure_con_raggio.Sfera;
import it.unimol.geometria.Figure.figure_con_raggio.Piramide_base_triangolare;
import it.unimol.geometria.Figure.Figure_senza_raggio.Piramide_base_quadrata;
import it.unimol.geometria.Supporto_main.Aiuto_case1;
import it.unimol.geometria.Supporto_main.Aiuto_case2;
import it.unimol.geometria.Supporto_main.Aiuto_case3;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        ArrayList<Misure_figure> list_figure;

        list_figure = new ArrayList<>();

        Scanner inserisci = new Scanner(System.in);

        String opzione;

        do {

            if (list_figure.size() == 10) {
                System.out.println("lista piena,impossibile inserire");
                break;
            }

            System.out.println("*****figure geometriche******");
            System.out.println("*****aggiungere una figura ...digita... (aggiungi figura)******");
            System.out.println("*****calcolo dell totale delle superfici e volumi delle figure inserite...digita...(superfici e volumi)******");
            System.out.println("*****mostra le figure inserite in archivio ...digita... (archivio figure)******");
            System.out.println("*****calcola la distanza fra due figure ...digita... (distanza)******");
            System.out.println("*****per uscire digitare ...digita...(exit)******");
            opzione = inserisci.nextLine();


            switch (opzione) {

                case "aggiungi figura":

                    System.out.println("*****scegli figura da inserire******");
                    System.out.println("*****cubo******");
                    System.out.println("*****parallelepipedo******");
                    System.out.println("*****piramide a base quadrata******");
                    System.out.println("*****piramide a base triangolare******");
                    System.out.println("*****cilindro******");
                    System.out.println("*****cono******");
                    System.out.println("*****sfera******");
                    System.out.println("*****annulla******");

                    System.out.println("Inserisci il tipo di fiugra da inserire");
                    String tipo_figura = inserisci.nextLine();

                    switch (tipo_figura) {
                        case "cubo":

                            Aiuto_case1 supporto_cono = new Aiuto_case1();
                            Cubo cubo = supporto_cono.dati_cubo();

                            if (cubo.isValid()) {
                                if (list_figure.size() == 0) {
                                    list_figure.add(cubo);
                                    System.out.println("inserimento avvenuto con successo ");
                                } else {
                                    String nome = cubo.getNome();
                                    if (controllo_nome(list_figure, nome) == 0)
                                        System.out.println("il nome della figura è già presente");
                                    else
                                        list_figure.add(cubo);
                                }
                            } else {
                                System.out.println("Input non valido, escluse le coordinatele misure delle figure devono essere positive");
                            }
                            break;
                        case "parallelepipedo":

                            Aiuto_case1 supporto_parallelepipedo = new Aiuto_case1();
                            Parallelepipedo parallelepipedo = supporto_parallelepipedo.dati_parallelepipedo();

                            if (parallelepipedo.isValid()) {
                                if (list_figure.size() == 0) {
                                    list_figure.add(parallelepipedo);
                                    System.out.println("inserimento avvenuto con successo ");
                                } else {
                                    String nome = parallelepipedo.getNome();
                                    if (controllo_nome(list_figure, nome) == 0)
                                        System.out.println("il nome della figura  è già presente");
                                    else{
                                        list_figure.add(parallelepipedo);
                                        System.out.println("inserimento avvenuto con successo ");
                                    }
                                }
                            } else {
                                System.out.println("Input non valido, escluse le coordinatele misure delle figure devono essere positive");
                            }


                            break;
                        case "piramide a base quadrata":

                            Aiuto_case1 supporto_piramide_a_base_quadrata = new Aiuto_case1();
                            Piramide_base_quadrata piramide_base_quadrata = supporto_piramide_a_base_quadrata.dati_piramide_a_base_quadrata();

                            if (piramide_base_quadrata.isValid()) {
                                if (list_figure.size() == 0) {
                                    list_figure.add(piramide_base_quadrata);
                                    System.out.println("inserimento avvenuto con successo ");
                                } else {
                                    String nome = piramide_base_quadrata.getNome();
                                    if (controllo_nome(list_figure, nome) == 0)
                                        System.out.println(" il nome della figura è già presente");
                                    else{
                                        list_figure.add(piramide_base_quadrata);
                                        System.out.println("inserimento avvenuto con successo ");
                                    }
                                }
                            } else {
                                System.out.println("Input non valido, escluse le coordinatele misure delle figure devono essere positive");
                            }


                            break;
                        case "piramide a base triangolare":

                            Aiuto_case1 supporto_piramide_a_base_triangolare = new Aiuto_case1();
                            Piramide_base_triangolare piramide_base_triangolare = supporto_piramide_a_base_triangolare.dati_piramide_a_base_triangolare();

                            if (piramide_base_triangolare.isValid()) {
                                if (list_figure.size() == 0) {
                                    list_figure.add(piramide_base_triangolare);
                                    System.out.println("inserimento avvenuto con successo ");
                                } else {
                                    String nome = piramide_base_triangolare.getNome();
                                    if (controllo_nome(list_figure, nome) == 0)
                                        System.out.println(" il nome della figura è già presente ");
                                    else{
                                        list_figure.add(piramide_base_triangolare);
                                        System.out.println("inserimento avvenuto con successo ");
                                    }
                                }
                            } else {
                                System.out.println("Input non valido, escluse le coordinatele misure delle figure devono essere positive");
                            }


                            break;
                        case "cilindro":

                            Aiuto_case1 aiuto_cilindro = new Aiuto_case1();
                            Cilindro cilindro = aiuto_cilindro.dati_cilindro();

                            if (cilindro.isValid()) {
                                if (list_figure.size() == 0) {
                                    list_figure.add(cilindro);
                                    System.out.println("inserimento avvenuto con successo ");
                                } else {
                                    String nome = cilindro.getNome();
                                    if (controllo_nome(list_figure, nome) == 0)
                                        System.out.println(" il nome della figura è già presente  ");
                                    else {
                                        list_figure.add(cilindro);
                                        System.out.println("inserimento avvenuto con successo ");
                                    }
                                }
                            } else {
                                System.out.println("Input non valido, escluse le coordinatele misure delle figure devono essere positive");
                            }


                            break;

                        case "cono":

                            Aiuto_case1 aiuto_cono = new Aiuto_case1();
                            Cono cono = aiuto_cono.dati_cono();

                            if (cono.isValid()) {
                                if (list_figure.size() == 0) {
                                    list_figure.add(cono);
                                    System.out.println("inserimento avvenuto con successo ");
                                } else {
                                    String nome = cono.getNome();
                                    if (controllo_nome(list_figure, nome) == 0)
                                        System.out.println("il nome della figura è già presente ");
                                    else {
                                        list_figure.add(cono);
                                        System.out.println("inserimento avvenuto con successo ");
                                    }
                                }
                            } else {
                                System.out.println("Input non valido, escluse le coordinatele misure delle figure devono essere positive");
                            }


                            break;
                        case "sfera":

                            Aiuto_case1 aiuto_sfera = new Aiuto_case1();
                            Sfera sfera = aiuto_sfera.dati_sfera();

                            if (sfera.isValid()) {
                                if (list_figure.size() == 0) {
                                    list_figure.add(sfera);
                                    System.out.println("inserimento avvenuto con successo ");
                                } else {
                                    String nome = sfera.getNome();
                                    if (controllo_nome(list_figure, nome) == 0)
                                        System.out.println("il nome della figura è già  presente ");
                                    else {
                                        list_figure.add(sfera);
                                        System.out.println("inserimento avvenuto con successo ");
                                    }
                                }
                            } else {
                                System.out.println("Input non valido, escluse le coordinatele misure delle figure devono essere positive");
                            }

                            break;
                        case "annulla":
                            System.out.println("stop!");
                            break;
                        default:
                            System.out.println("operazione non consentita");
                            break;
                    }

                    break;
                case "superfici e volumi":
                    Aiuto_case2 supporto_volume = new Aiuto_case2();
                    Double somma_volumi = supporto_volume.calcolo_volume(list_figure);
                    Aiuto_case2 supporto_superfici = new Aiuto_case2();
                    Double somma_superfici = supporto_superfici.calcolo_superficie(list_figure);


                    System.out.println("la somma dei volumi ammonta a :" + somma_volumi);
                    System.out.println("la somma delle superfici ammonta a :" + somma_superfici);
                    break;

                case "archivio figure":

                    for (Misure_figure misure : list_figure) {
                        System.out.println(misure.toString());
                    }
                    break;
                case "distanza":

                    System.out.println("inserisci il nome della 1 figura");
                    String figura_1 = inserisci.nextLine();
                    System.out.println("inserisci il nome della 2 figura");
                    String figura_2 = inserisci.nextLine();

                    Aiuto_case3 supporto_distanza = new Aiuto_case3();
                    Double distanza = supporto_distanza.calcolo_distanza(list_figure, figura_1, figura_2);

                    if (distanza == 0) {
                        System.out.println("figura 2 non presente");
                    } else if (distanza == 1) {
                        System.out.println("figura 1 non presente");
                    } else
                        System.out.println("la distanza tra le due figure ammonta a:" + distanza);

                    break;

                case "exit":
                    System.out.println("arrivederci");
                    break;
                default:
                    System.out.println("opzione non esistente");
            }
        } while (!opzione.equalsIgnoreCase("exit"));

    }

    private static int controllo_nome(ArrayList<Misure_figure> list_figure, String nome) {
        int controllo_nome = 0;

        for (Misure_figure misure : list_figure) {
            if (nome.equalsIgnoreCase(misure.getNome())) {
                return 0;
            }
            controllo_nome = 1;
        }
        return controllo_nome;
    }
}