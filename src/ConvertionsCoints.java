public class ConvertionsCoints {

    int option;
    double valueCoin;


    ConvertionsCoints(int option, double valueCoin){
        this.option = option;
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
