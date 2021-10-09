import java.util.*;
class arm
{
	public static void main(String args[])
	{
		int m,sum=0,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		m=n;
		while(n>0)
		{
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		if(m==sum)
		{
			System.out.println("Given number is armstrong");
		}
		else
		{
			System.out.println("Given number is not armstrong");
		}
	}
}
