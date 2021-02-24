public class Dollar extends  ConvertionsCoints{

    double pesoDolar =  0.049;
    double dolarPeso =  20.39;

    Dollar(double valueCoin){
        super(valueCoin);
    }

    @Override
    public void conveDePesoa(double userCoin) {
        valueCoin = pesoDolar;
        super.conveDePesoa(userCoin);
    }

    @Override
    public void converDeCoina(double userCoin) {
        valueCoin = dolarPeso;
        super.converDeCoina(userCoin);
    }

    public static  void menuDolar(){
        System.out.println("1 para convertir de peso a dolar \n 2 para convertir de dolar a peso");
    }
}
