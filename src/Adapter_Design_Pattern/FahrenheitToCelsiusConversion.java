package Adapter_Design_Pattern;

public class FahrenheitToCelsiusConversion{
    private KelvinLib kelvinLib = new KelvinLib();
    double tempKelvin;

    public double totalConversion(double tempFahr){
        tempKelvin = FahrenheitToKelvinConversion(tempFahr);
        return KelvinToCelsiusConversion(tempKelvin);
    }

    private double KelvinToCelsiusConversion(double tempKelvin) {
        return tempKelvin - 273.15;
    }

    private double FahrenheitToKelvinConversion(double tempFahr) {
        return (tempFahr - 32) * 5/9 + 273.15;
    }

}
