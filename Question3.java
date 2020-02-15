import java.util.Scanner;

public class Question3 {

     public static void main(String[] args) {

        System.out.println("****Whole Number****");
       
        double Sum;
        double Number1;
        double Number2;
        double Number3;

        Scanner sc = new Scanner(System.in);
        System.out.println("\nType The whole numbers of 3 digits");

        Number1 = sc.nextInt();
        Number2 = sc.nextInt();
        Number3 = sc.nextInt();

        Sum = Number1 + Number2+ Number3;
		
	    System.out.println( "\nThe sum of the Numbers is " + Sum);
	
		

     }

 }
