class ConvertionsCoints {


    static double valueCoin = 0;


    ConvertionsCoints( double valueCoin){

        this.valueCoin = valueCoin;
    }

    public   void conveDePesoa(double userCoin){
        valueCoin = valueCoin  * userCoin;
        System.out.println(" El valor convertido es : "+ (float) + valueCoin);

    }

    public  void converDeCoina(double userCoin){
        valueCoin = userCoin / valueCoin;
        System.out.println(" El valor convertido a Peso es : "+ (float) + valueCoin+ " Pesos");

    }

}

