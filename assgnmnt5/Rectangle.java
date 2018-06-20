import java.util.Scanner;
class Rectangle{

int length;
int breadth;
public int CalculateArea(int l,int b)
{ 
 return l*b;
}
public static void main(String[] args){
Scanner sc;
sc=new Scanner(System.in);
System.out.println("enter the length and breadth");
int length=sc.nextInt();
int breadth=sc.nextInt();
Rectangle r=new Rectangle();
int a= r.CalculateArea(length,breadth);
System.out.println("the area of rectangle is "+a);


}
}