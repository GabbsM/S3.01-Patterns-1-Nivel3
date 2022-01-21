package Nivel3;

public class AcelerarBarco implements Accion{
    Barco barco;

    public AcelerarBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public void execute() {
        barco.AcelerarBarco();
    }
}
