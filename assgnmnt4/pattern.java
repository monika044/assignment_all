//w.a.p to draw the pattern mention in a question//

class Pattern{
public static void main(String[] args){
int i=1;
int j=5;

while(i<=5){

while(j>=i){
System.out.print("*");
j--;
}
System.out.println();
i++;
j=5;
}}