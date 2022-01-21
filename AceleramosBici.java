package Nivel3;

public class AceleramosBici implements Accion{
    Bici bici;

    public AceleramosBici(Bici bici) {
        this.bici = bici;
    }

    @Override
    public void execute() {
        bici.AcelerarBici();
    }
}
