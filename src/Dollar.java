public class Dollar extends  ConvertionsCoints{

    Dollar(int option, double valueCoin){
        super(option, valueCoin);
    }

    @Override
    public double conveDePesoa(double userCoin) {
        valueCoin = 20.49;
        valueCoin = valueCoin / userCoin;
        return valueCoin;
    }
}
