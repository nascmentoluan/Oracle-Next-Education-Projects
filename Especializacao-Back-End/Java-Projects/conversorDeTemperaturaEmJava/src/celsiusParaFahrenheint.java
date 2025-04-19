public class celsiusParaFahrenheint {
    public static void main(String[] args){
        float temperaturaEmCelsius = 30.5f;
        int temperaturaEmFahreinheit = (int)(temperaturaEmCelsius * 1.8) + 32;

        System.out.println("O valor da temperatura de " + temperaturaEmCelsius + " graus Celsius equivale a "
                + temperaturaEmFahreinheit + " graus em Fahrenheit");
    }
}
