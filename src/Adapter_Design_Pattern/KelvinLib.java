package Adapter_Design_Pattern;

public class KelvinLib {
    public double convertToFahrenheit(double tempKelvin){
        //(32°F − 32) × 5/9 + 273.15 = 273.15K
        //(0K − 273.15) × 9/5 + 32 = -459.7°F
        double tempFahr = (tempKelvin - 273.15) * 9/5 + 32;
        return tempFahr;
    }
}

