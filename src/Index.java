import java.util.Scanner;

public class Index {

    public static void main(String[] args) {
        int mainElectionConver;


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
 * Constructores
 * */
        Dollar dolar = new Dollar(mount);
        Euro eur = new Euro(mount);

 /**
  * En el siguiente bloque de codigo se encuentra  el proceso donde se elige se es de peso a otro tipo de moneda
  * o viserversa
  *
  * */

    switch (option){

        case 1:

        break;

        case 2:
            System.out.println("Oprime laopcion que necesites: ");
            Euro.mainConvertion();
            mainElectionConver = cant.nextInt();
            if(mainElectionConver == 1){
                System.out.println("El valor de la conversion de peso a euro es de : " + eur.conveDePesoa(mount));
            }if (mainElectionConver == 2){
            System.out.println("El valor de la conversion de euro a peso es de" + eur.converDeCoina(mount));
        }

    }

    }
}
