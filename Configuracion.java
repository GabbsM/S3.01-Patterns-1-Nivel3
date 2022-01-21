package Nivel3;

public class Configuracion {
    public static void configurar(Accionador accionador){

        Coche coche = new Coche();
        Avion avion = new Avion();
        Bici bici = new Bici();
        Barco barco = new Barco();

        accionador.setAccion1(new ArrancarCoche(coche));
        accionador.setAccion2(new AcelerarCoche(coche));
        accionador.setAccion3(new FrenarCoche(coche));

        accionador.setAccion4(new ArrancarAvion(avion));
        accionador.setAccion5(new AcelerarAvion(avion));
        accionador.setAccion6(new FrenarAvion(avion));

        accionador.setAccion7(new ArrancamosBici(bici));
        accionador.setAccion8(new AceleramosBici(bici));
        accionador.setAccion9(new FrenarBici(bici));

        accionador.setAccion10(new ArrancarBarco(barco));
        accionador.setAccion11(new AcelerarBarco(barco));
        accionador.setAccion12(new FrenarBarco(barco));
    }
}
