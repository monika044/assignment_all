//convert string into integers//
import java.util.Scanner;


class Max1{
public static void main(String[] args){
Scanner sc;
sc=new Scanner(System.in);
String n1=sc.nextLine();
String n2=sc.nextLine();
int no1=Integer.parseInt(n1);
int no2=Integer.parseInt(n2);
if (no1 > no2)
{
System.out.print("maximum no is " +no1);
}
else
{
System.out.print("maximum no is " +no2);
}
}}