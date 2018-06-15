//find the reverse of a number//

class Reverse{
public static void main(String[] args){
int number,a,b,n;
number=123;  
a=number%10;
n=number/10;

b=n%10;
n=n/10;

System.out.print(a);
System.out.print(b);
System.out.print(n);
}
}
