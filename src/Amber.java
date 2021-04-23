public class Amber {
    String color;
    String hardness;
    double density;
    double meltingTemperature;

    Amber(String color, String hardness, double density, double meltingTemperature){
        this.color = color;
        this.hardness = hardness;
        this.density = density;
        this.meltingTemperature = meltingTemperature;
    }
    public double inFahrenheit(){
        double inFahrenheit = ((meltingTemperature * 1.8)+32);
        return inFahrenheit;
    }
    public void increasingDensity(double number){
        density+=number;
    }
}
