
import java.util.Scanner;
import java.text.DecimalFormat;

public class Question2 {

    public static void main(String[] args) {

        System.out.println("\n****TAX****");

        // P is the Price
        // T is the Total
        double P;
        double T;
        final double TPS = 0.05;
        final double TVQ = 0.098;
        final double TIPS = 0.15;


        Scanner sc = new Scanner(System.in);
        System.out.println("\nType the price of a product in CAD");

        P = sc.nextDouble();
        T = P*(TPS) + P*(TVQ) +P*(TIPS) + P;

        System.out.println( "\nThe total amount is " + T + "$");



    }

}
