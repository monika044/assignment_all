import java.util.Scanner;
class Complex{  
int real,imaginary;  
public static void display(int real,int imaginary){
int r=real;
int img=imaginary;
System.out.println(r+"+"+img+"i");
}
public static void main(String[] args){

Scanner sc;
sc=new Scanner(System.in);
System.out.println("enter numbers");
int r1=sc.nextInt();
int ig=sc.nextInt();
Complex C1=new Complex();
C1.display(r1,ig);

}
}
