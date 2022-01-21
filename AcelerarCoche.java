package Nivel3;

public class AcelerarCoche implements Accion{
    Coche coche;

    public AcelerarCoche(Coche coche) {
        this.coche = coche;
    }

    @Override
    public void execute() {
        coche.AcelerarCoche();
    }
}
