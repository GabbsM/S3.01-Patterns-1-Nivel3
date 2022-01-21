package Nivel3;

public class App {
    public static void main(String[] args) {

        Accionador control = new Accionador();
        Configuracion.configurar(control);

        System.out.println("Acciones coche: ");
        control.clickAccion1();
        control.clickAccion2();
        control.clickAccion3();

        System.out.println();
        System.out.println("Acciones avión:");
        control.clickAccion4();
        control.clickAccion5();
        control.clickAccion6();

        System.out.println();
        System.out.println("Acciones bici:");
        control.clickAccion7();
        control.clickAccion8();
        control.clickAccion9();

        System.out.println();
        System.out.println("Acciones barco:");
        control.clickAccion10();
        control.clickAccion11();
        control.clickAccion12();

    }
}
