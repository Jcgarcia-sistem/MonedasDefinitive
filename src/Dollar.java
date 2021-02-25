
public class Dollar extends  ConvertionsCoints{

    double pesoDolar =  0.049;
    double dolarPeso =  20.39;

    Dollar(double valueCoin){
        super(valueCoin);
    }

    @Override
    public void conveDePesoa(double mount) {
        valueCoin = dolarPeso ;
        super.conveDePesoa(mount);
    }



    @Override
    public void converDeCoina(double mount) {
        valueCoin = pesoDolar;
        super.converDeCoina(mount);
    }

    public static  void menuDolar(){
        System.out.println("1 para convertir de peso a dolar \n 2 para convertir de dolar a peso");
    }
}
