package kishore;

public class Armstrongnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,rem,arm=0;
		for(int i=100;i<=999;i++)
		{
			num=i;
			while(num>0)
			{
			rem=num%10;
			num=num/10;
			arm=arm+rem*rem*rem;
		}
		if(i==arm)
		{
			System.out.println(i);	
		}
		
		arm=0;
		
	
		}

	}

	}
