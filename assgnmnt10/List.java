import java.util.*;
import java.io.*;
class List{
public static void main(String[] args)throws IOException{ 

ArrayList<String> al= new ArrayList<String> ();
ArrayList<String> al2= new ArrayList<String> ();
al.add("monika");
al.add("amit");
System.out.print("size is :"+ al.size());
al.add("rahul");
System.out.print("size is :"+ al.size());
al2.addAll(al);
System.out.print(al2);
}
}