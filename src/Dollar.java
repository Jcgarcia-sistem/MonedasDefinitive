public class Dollar extends  ConvertionsCoints{

    Dollar(String type, double valueCoin){
        super(type, valueCoin);
    }

    @Override
    public double conveDePesoa(double userCoin) {
        valueCoin = 20.49;
        valueCoin = valueCoin / userCoin;
        return valueCoin;
    }
}
