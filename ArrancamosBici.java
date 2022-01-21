package Nivel3;

public class ArrancamosBici implements Accion{
    Bici bici;

    public ArrancamosBici(Bici bici) {
        this.bici = bici;
    }

    @Override
    public void execute() {
        bici.ArrancarBici();

    }
}
