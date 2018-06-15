//w.a.p to find even number up to n//

import java.util.Scanner;
class Even{
public static void main(String[] args){
 Scanner sc;
int i=1;
sc=new Scanner(System.in);
int n= sc.nextInt(); 

 while(i!=n){
if(i%2==0){
System.out.println(i);
}
i++;
}
}
}
