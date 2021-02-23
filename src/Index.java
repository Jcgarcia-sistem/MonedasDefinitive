import java.util.Scanner;

public class Index {
    public static void main(String[] args) {


    IntoDates dates = new IntoDates();

/**
 * Ingreso de datos
 * @param mount es  la cantidad a convertir
 * @param type es el tipo de moneda a convertir
 * */

        Scanner cant = new Scanner(System.in);

        int option;
        dates.option();
        option = cant.nextInt();
        dates.mount();
        double mount = cant.nextDouble();




    }
}
