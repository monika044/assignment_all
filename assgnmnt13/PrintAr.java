import java .util.Arrays;
public class PrintAr{

public static <E> void printArray(E[] Arrayprint){
for(E element : Arrayprint)
System.out.printf("%s",element);
System.out.println();
}
public static void main(String args[]){
Integer[] intArray={4,5,6,7,8,1,3,9,2};
Double[] dbArray={26.87,486.9,567.4,237.6,546.3, 454.5,676.7,343.4,323.2};
Character[] charArray={'r','e','t','u','m'};

System.out.println("integerArray contains:");
printArray(intArray);

System.out.println("\n doubleArray contains:");
printArray(dbArray);

System.out.println("\n characterArray contains:");
printArray(charArray);

}
}