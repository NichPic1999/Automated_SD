package it.unimol.geometria.Geometria;

public abstract class Misure_figure implements it.unimol.geometria.Op_solidi {

    protected double lunghezza;
    protected double altezza;
    protected double larghezza;
    protected double x;
    protected double y;
    protected double z;
    protected String nome;
    protected double raggio;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getLunghezza() {
        return lunghezza;
    }

    public void setLunghezza(double lunghezza) {
        this.lunghezza = lunghezza;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(double larghezza) {
        this.larghezza = larghezza;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getRaggio() {
        return raggio;
    }

    public void setRaggio(double raggio) {
        this.raggio = raggio;
    }

    public Misure_figure() {
    }


    public String toString() {
        String stampa;

        stampa ="nome_solido:" + getNome() +
                "\ncoordinate:" + "x:" + getX() + "y:" + getY() + "z:" + getZ() +
                "\nvolume:" + volume() +
                "\nsuperficie:" + superficie();
        System.out.println("\n");

        return stampa;

    }

    public double somma_dei_volumi() {
        double somma_volumi = 0;
        somma_volumi = somma_volumi + volume();
        return somma_volumi;

    }

    public double somma_delle_superfici() {
        double somma_superfici = 0;
        somma_superfici = somma_superfici + superficie();
        return somma_superfici;
    }

    public double calcolo_distanza(double x,double y,double z,double x_2,double y_2,double z_2) {
        double distanza_solidi =  Math.sqrt(Math.pow((x - x_2), 2) + Math.pow((y - y_2), 2) + Math.pow((z - z_2), 2));
        return distanza_solidi;
    }

}
