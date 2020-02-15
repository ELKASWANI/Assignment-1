import java.lang.*;
import java.util.Random;

public class Question5 {
    public static void main(String args[]) {
        Random rand=new Random();
        int randomNum = rand.nextInt((100 - 0) + 1) + 0;
        System.out.println("The random generated from the input is "+randomNum);
        System.out.println("The power of 2 of the input is "+Math.pow(randomNum,2));
        System.out.println("The power of 3 of the input is "+Math.pow(randomNum,3));
        System.out.println("The natural log of the input is "+Math.log(randomNum));
        System.out.println("The base10 for the input is " + Math.log10(randomNum));


    }
}