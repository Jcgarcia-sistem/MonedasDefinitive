import UIMain.TestMain;
import static UIMain.TestMain.*;
import java.util.Scanner;
public class Index {

   static int mainElec;
   static double mount;

    public static void main(String[] args) {

        Scanner mo = new Scanner(System.in);
        Dollar dolar = new Dollar(mount);
        Euro euro = new Euro(mount);


        Scanner consol = new Scanner(System.in);
        TestMain.main();
        int ele = consol.nextInt();
        System.out.println(ele);


        switch(ele){
                case 1:
                    do {

                       Dollar.menuDolar();
                        mainElec = consol.nextInt();
                    }while(mainElec > 2 && ele != 0);

                       if(mainElec != 0) {
                           System.out.println("Ingresa el monto ");
                            mount = mo.nextDouble();
                       }
                       switch (mainElec) {
                           case 1:
                               dolar.conveDePesoa(mount);
                               break;
                           case 2:
                               dolar.converDeCoina(mount);
                               break;
                           case 0:
                               TestMain.main();
                               break;
                           default:
                               System.out.println("Ingresa una opcion valida ");
                               break;
                       }
                       break;

                case 2:
                    do {
                        System.out.println(" 1 Convertir de Peso a Euro");
                        System.out.println(" 2 Convertir de Euro a Peso");
                        System.out.println(" 0 Regresar al menu");
                        mainElec = consol.nextInt();
                    }while(mainElec > 2 && ele != 0);

                    if(mainElec != 0) {
                        System.out.println("Ingresa el monto ");
                        mount = mo.nextDouble();

                    }
                    switch (mainElec) {
                        case 1:
                            euro.conveDePesoa(mount);
                            break;
                        case 2:
                            euro.converDeCoina(mount);
                            break;
                        case 0:
                            TestMain.main();
                            break;
                        default:
                            System.out.println("Ingresa una opcion valida ");
                            break;
                    }
                break;
            default:
                System.out.println("Ingresa un valor corrrecto");
                break;



            }


        }}