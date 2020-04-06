package simpleInterest;
import java.util.Scanner;
public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principle amount");
		int Principle = sc.nextInt();
		System.out.println("Enter the rate of interst");
		float rateOfInterest = sc.nextFloat();
		System.out.println("Enter the time for the amount will be invested");
		int time = sc.nextInt();
		 float Amount = Principle*rateOfInterest*time/100;
		 // this give the final amount that is principle and the interest earned
		 System.out.println("The final amount is  "+ Amount);

	}

}
