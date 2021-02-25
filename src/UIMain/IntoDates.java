package UIMain;

import java.util.Scanner;

public class IntoDates {
    private int election;
    /**
     * Este modulo controla el menu que ve el usuario
     *
     * */
    IntoDates(){}

    public static void mount(){
        System.out.println("Ingresa el monto a convertir ");
    }
    public static void  type(){
        System.out.println("Ingresa a que moneda deseas convertir  de MNX ");
        System.out.println("puedes seleccionar una de las siguientes opciones: ");
        }
    public  static void  option(){

            System.out.println("Elije la opcion a que moneda deseas convertir presionando su numero ");
            System.out.println("1   Dolar \n2   Euro \n3   Yen");

    }



    public static void firtMain(){
        Scanner cant = new Scanner(System.in);
        int option = 0;
        do {
            option();
            option = cant.nextInt();
        }while(option > 2 );  // Esta diseñada hasta 2
        mount();
        double mount = cant.nextDouble();
    }
}
