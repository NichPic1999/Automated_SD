package it.unimol.geometria.Figure.figure_con_raggio;

import it.unimol.geometria.Geometria.Misure_figure;
import it.unimol.geometria.Op_solidi;

public class Piramide_base_triangolare extends Misure_figure implements Op_solidi {

   public Piramide_base_triangolare(){}



   @Override
   public double superficie() {

      // calcoli che mi servono sia per la superficie che per il volume

      //OPERAZIONI INTERMEDIE
      double spigolo_di_base=2* Math.sqrt(3)*raggio;
      double perimetro_di_base=spigolo_di_base*3;

      double superficie_base = (perimetro_di_base* raggio)/2;
      double apotema=Math.sqrt(Math.pow(altezza,2)+Math.pow(raggio,2));
      double superficie_laterale= (perimetro_di_base*apotema)/2;
      //

      double superficie_totale_piramide_base_triangolare =superficie_base+superficie_laterale;

      return superficie_totale_piramide_base_triangolare;
   }

   @Override
   public double volume() {

      double spigolo_di_base=2* Math.sqrt(3)*raggio;
      double perimetro_di_base=spigolo_di_base*3;
      double superficie_base = (perimetro_di_base* raggio)/2;

      double volume_piramide_base_triangolare = (superficie_base*altezza)/2;

      return volume_piramide_base_triangolare;
   }

   @Override
   public boolean isValid() {
      return altezza >= 0 && raggio >=0;}

   @Override
   public String prendi_solido() {
      return "piramide a base triangolare";}

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
