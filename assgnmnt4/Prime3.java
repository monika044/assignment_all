 //w.a program to find prime no upto n//

 class Prime3{
public static void main(String[] args){
int n=7;
int i,j;
int flag=0;
for(i=2;i<n;i++){

 for(int j=2;j<=i;j++){

    if(i%j==0){				
    flag++;
    break;
    }
}}
if (flag==0){
System.out.println("prime no. are" + i);
} 
}
