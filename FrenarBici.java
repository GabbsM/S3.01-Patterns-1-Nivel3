package Nivel3;

public class FrenarBici implements Accion{
    Bici bici;

    public FrenarBici(Bici bici) {
        this.bici = bici;
    }

    @Override
    public void execute() {
        bici.FrenarBici();
    }
}
