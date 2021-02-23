public class Dollar extends  ConvertionsCoints{

    Dollar(double valueCoin){
        super(valueCoin);
    }

    @Override
    public double conveDePesoa(double userCoin) {
        valueCoin = 0.049;
        return super.conveDePesoa(userCoin);
    }
}
