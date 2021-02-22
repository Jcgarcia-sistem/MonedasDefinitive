public class ConvertionsCoints {

    String type;
    double valueCoin;


    ConvertionsCoints(String type, double valueCoin){
        this.type = type;
        this.valueCoin = valueCoin;
    }

    public double conveDePesoa(double userCoin){
        valueCoin = userCoin / valueCoin;
        return valueCoin;
    }

    public double converDeCoina(double userCoin){
        valueCoin = userCoin * valueCoin;
        return  valueCoin;
    }
}
