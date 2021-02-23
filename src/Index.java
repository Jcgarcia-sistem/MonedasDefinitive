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

 /**
  * Menu
  * @param option es el valor que elige el usuario dependiendo las opciones que se muestran
  * */

        int option = 0;
        do {
            dates.option();
            option = cant.nextInt();
        }while(option > 2 );
        dates.mount();
        double mount = cant.nextDouble();
/**
 * Dolar
 * */
        Dollar dolar = new Dollar(mount);
        System.out.println("Su conversion es de " + dolar.conveDePesoa(mount) );


    }
}
