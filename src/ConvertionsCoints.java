class ConvertionsCoints {


    static double valueCoin = 0;


    ConvertionsCoints( double valueCoin){

        this.valueCoin = valueCoin;
    }

    public  double conveDePesoa(double userCoin){
        valueCoin = valueCoin / userCoin;
        return valueCoin;
    }

    public double converDeCoina(double userCoin){
        valueCoin = userCoin * valueCoin;
        return  valueCoin;
    }

}

