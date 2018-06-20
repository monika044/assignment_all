//w.a.p to check a no is in array or not.//
	
import java.util.Scanner;
class Array{
		public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int i;
	System.out.print("Enter a Num to look in Array :");
	int n=sc.nextInt();
	int arr[]={1,2,4,6,7,8};
	for(i=0;i<arr.length;i++)
	{
		 if(n ==arr[i])
		 {
			System.out.print("number is in array");
			break;
		}
 	}
}
}