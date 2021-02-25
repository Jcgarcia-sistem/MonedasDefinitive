
public class ConvertionsCoints {


    static double valueCoin = 0;


    ConvertionsCoints( double valueCoin){

        this.valueCoin = valueCoin;
    }

    public    void conveDePesoa(double mount){
        valueCoin = valueCoin  * mount;
        System.out.println(" El valor convertido es : "+ (float) + valueCoin);

    }

    public  void converDeCoina(double mount){
        valueCoin = mount / valueCoin;
        System.out.println(" El valor convertido a Peso es : "+ valueCoin+ " Pesos");

    }

}

