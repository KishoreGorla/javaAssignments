package kishore;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153,rem,arm=0, temp=num;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			arm=arm+(rem*rem*rem);
			
		}
		System.out.println("Armstrong of num is :"+arm);
		if(temp==arm)
		{
			System.out.println("your number is Armstrong number");
		}
		else
		{
			System.out.println("your number is not Armstrong number");
		}
		

	}

}
