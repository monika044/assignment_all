
import java.io.*;
import java.util.Arrays;

class ArraySor{
public static<G> void printArray(G[] arr){
for(G r:arr)
System.out.printf("%s",r);
System.out.println();
}
public static void main(String[] args){

String[] Name={"monika","shalu","rajni"};
Arrays.sort(Name);
System.out.println(Arrays.toString(Name));

Integer[] Number={656,676,897,132};
Arrays.sort(Number);
System.out.println(Arrays.toString(Number));

double[] lengths={457.0,234.0,345.8,2.0,9.0};
Arrays.sort(lengths);
System.out.println(Arrays.toString(lengths));
}
}

