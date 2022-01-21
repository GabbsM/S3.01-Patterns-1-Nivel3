package Nivel3;

public class FrenarAvion implements Accion{
    Avion avion;

    public FrenarAvion(Avion avion) {
        this.avion = avion;
    }

    @Override
    public void execute() {
        avion.FrenarAvion();
    }
}
