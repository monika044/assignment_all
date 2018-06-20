//w.a program to find prime no upto n//
 class Prime2{
public static void main(String[] args){

int n=7;

int count=0;

		if(n==0||n==1)
		{System.out.println("not a prime number");}

else
{
		for(int i=2;i<=n;i++)
		{ count=0;
			for(int j=2;j<=i;j++)
				{
					if(i%j==0)
						{				
					count++;
						break;
						}
					
			else if (count==0)
				{
				System.out.println("prime no. are" + i);

						}}
}

}

}} 