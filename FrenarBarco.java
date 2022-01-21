package Nivel3;

public class FrenarBarco implements Accion {
    Barco barco;

    public FrenarBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public void execute() {
        barco.FrenarBarco();

    }
}
