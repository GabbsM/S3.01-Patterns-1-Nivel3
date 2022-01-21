package Nivel3;

public class ArrancarCoche implements Accion{
    Coche coche;

    public ArrancarCoche(Coche coche) {
        this.coche = coche;
    }

    @Override
    public void execute() {
        coche.ArrancarCoche();

    }
}
