public class Main {
    public static void main(String[] args) {
        Amber amber1 = new Amber("yellow","hard",100, 200);
        System.out.println("gęstość: "+amber1.density);
        amber1.increasingDensity(10);
        System.out.println("gęstość zwiększona: "+amber1.density);
        System.out.println("temperatura w C: "+ amber1.meltingTemperature);
        System.out.println("temperatura w F: "+ amber1.inFahrenheit());
    }
}
