package kishore;

import java.util.Scanner;

public class Compoundintrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	 Scanner input = new Scanner(System.in);
		        System.out.println("Enter the principal:");
		        double principal = input.nextDouble();
		        System.out.println("Enter the rate: ");
		        double rate =input.nextDouble();
		        System.out.println("Enter the duration:");
		        double time = input.nextDouble();
		        double simpleInterest = (principal*time*rate)/100;
		        System.out.println("Enter the number of time interest is compounded");
		        double number =input.nextDouble();

		        double compoundInterest = principal * (Math.pow((1+ rate/100),(time * number)))-principal;
		        System.out.println("Simple interest is :"+simpleInterest);
		        System.out.println("Compound interest is: "+compoundInterest);


		    
		

		
		
		
		
		
		
		

	}

}
