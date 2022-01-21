package Nivel3;

public class FrenarCoche implements Accion{
    Coche coche;

    public FrenarCoche(Coche coche) {
        this.coche = coche;
    }

    @Override
    public void execute() {
        coche.FrenarCoche();
    }
}
