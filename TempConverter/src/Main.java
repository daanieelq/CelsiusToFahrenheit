import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Celsius amount: ");

        double temp = sc.nextDouble();

        System.out.println("The converted Fahrenheit is: " + ((temp * 9 / 5) +32) );
    }
}