import java.util.Scanner;

public class Question1 {

     public static void main(String[] args) {

         System.out.println("****RoadTrip****");

         double roadTrip;
         double KiloMeters;
         double AverageDistance;
         final double gas = 1.16;

         Scanner sc = new Scanner(System.in);
         System.out.println("\nType how many Kilometers you will travelled?");

         KiloMeters= sc.nextDouble();

         System.out.println("\nWhat is the average distance that the " +
                                "vehicle runs with 1 Liter of gas?");

         AverageDistance = sc.nextDouble();
         //Formula: [(KiloMeters/AverageDistance)*Gas]
         roadTrip = (KiloMeters/AverageDistance)*gas;

         System.out.println("The cost of the roadTrip is " + roadTrip + "$");
     }

}
