
public class Euro extends ConvertionsCoints{

    double pesEur = 0.040;
    double EurPes = 25.22;

    Euro(double valueCoin) {
        super(valueCoin);
          }

    @Override
    public double conveDePesoa(double userCoin) {
        valueCoin = pesEur;
        return super.conveDePesoa(userCoin);
    }

    @Override
    public double converDeCoina(double userCoin) {
        valueCoin = EurPes;
        return super.converDeCoina(userCoin);
    }

    public static  void mainConvertion(){
        System.out.println(" 1 para convertir de peso a euro \n 2 para convertir de euro a peso ");
    }

}



