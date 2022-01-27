package kishore;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int a[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for (int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
	for(int k=0;k<a.length;k++)
		System.out.println(a[k]);

		
		
		

}
	
	
		
	}
