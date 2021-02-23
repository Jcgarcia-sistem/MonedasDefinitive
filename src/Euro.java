
public class Euro extends ConvertionsCoints{

    Euro(String type, double valueCoin) {
        super(type, valueCoin);
        this.valueCoin = valueCoin;

    }
    public static double dePesoAMoneda(double mount){
                double valueCoin = 0.040;
                valueCoin = valueCoin / mount;
                return valueCoin;
            }
    public  static  double deMonedaApeso(double mount){
                double valueCoint = 25.22;
                valueCoint = valueCoint * mount;
                return  valueCoint;

        }

    }



