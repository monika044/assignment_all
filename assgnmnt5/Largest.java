import java.util.Scanner;
class Largest{
public static void main(String[] args){
 int a[]={2,4,6,7,8,1,3,4,5};
int large=a[0];
int largest=a[0];
for(int i=0;i<a.length;i++){
if(a[i]>large){
largest=large;
large=a[i];
}
}
System.out.println("second largest number is "+largest);
}
}