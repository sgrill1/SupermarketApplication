package SupermarketApplication;

public class Formatter {


    public double roundToTwoDecimalPlaces(Double toBeRounded){
        return Double.parseDouble(String.format("%.2f",toBeRounded));
    }


}
