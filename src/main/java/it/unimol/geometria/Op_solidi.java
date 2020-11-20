package it.unimol.geometria;

public interface Op_solidi {
    double superficie();

    double volume();

    double coordinate_x();
    double coordinate_y();
    double coordinate_z();


    boolean isValid();

    String prendi_solido();

}

