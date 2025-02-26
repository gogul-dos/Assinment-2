import java.util.Scanner;

public class Q1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The temperature in Celcius: ");
        double temperatureInCelcius = scan.nextDouble();
        double temperatureInFarenheit = (temperatureInCelcius*9)/5 + (32);
        System.out.print("Enter The temperature in Farenheit: "+ temperatureInFarenheit);
    }
}