package Nivel3;

public class ArrancarBarco implements Accion{
    Barco barco;

    public ArrancarBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public void execute() {
        barco.ArrancarBarco();

    }
}
