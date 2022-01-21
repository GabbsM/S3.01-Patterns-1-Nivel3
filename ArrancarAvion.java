package Nivel3;

public class ArrancarAvion implements Accion{
    Avion avion;

    public ArrancarAvion(Avion avion) {
        this.avion = avion;
    }

    @Override
    public void execute() {
        avion.ArrancarAvion();
    }
}
