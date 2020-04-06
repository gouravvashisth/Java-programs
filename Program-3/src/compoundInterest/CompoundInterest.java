package compoundInterest;
import java.util.Scanner;
public class CompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principle amount");
		int Principle = sc.nextInt();
		System.out.println("Enter the rate of interest");
		float rateOfInterest = sc.nextFloat();
		System.out.println("Enter the time in which the money is invested");
		int Time = sc.nextInt();
		System.out.println("Enter the no of the compoundings in the interest");
		int Timecompounding = sc.nextInt();
		float rateOfInterestdecimal = rateOfInterest/100;
	double Compoundinterest =  Principle*Math.pow(1+rateOfInterestdecimal/Timecompounding , Timecompounding*Time);
         System.out.println("The compound interest is "+ Compoundinterest);
	}

}
