package Nivel3;

public class AcelerarAvion implements Accion{
    Avion avion;

    public AcelerarAvion(Avion avion) {
        this.avion = avion;
    }

    @Override
    public void execute() {
        avion.AcelerarAvion();
    }
}
