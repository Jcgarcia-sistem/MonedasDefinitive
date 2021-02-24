
public class Euro extends ConvertionsCoints{

    double pesEur = 0.040;
    double EurPes = 24.81 ;

    Euro(double valueCoin) {
        super(valueCoin);
          }

    @Override
    public void conveDePesoa(double userCoin) {
        valueCoin = pesEur;
        super.conveDePesoa(userCoin);
    }

    @Override
    public void converDeCoina(double userCoin) {
        valueCoin = EurPes;
        super.converDeCoina(userCoin);
    }

    public static  void mainConvertion(){
        System.out.println(" 1 para convertir de peso a euro \n 2 para convertir de euro a peso ");
    }

}



