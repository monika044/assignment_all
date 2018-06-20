 class 2{
public static void main(String[] args){
int n=7;
int i;
flag=0;

for(i=2;i<n;i++){
if(n%i==0)
{
flag++;}
}
if(flag==1)
System.out.print("not prime");

else{
System.out.print(" prime");
}


} }