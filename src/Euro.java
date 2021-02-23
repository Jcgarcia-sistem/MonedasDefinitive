
public class Euro extends ConvertionsCoints{

    double pesEur = 0.040;
    double EurPes = 25.22;

    Euro(double valueCoin) {
        super(valueCoin);
          }

    @Override
    public double conveDePesoa(double userCoin ) {

        pesEur = pesEur / userCoin;
        return pesEur;
    }

    @Override
    public double converDeCoina(double userCoin) {

        EurPes = EurPes * userCoin;
        return  EurPes;
    }


}



