import java.io.*;
import java.util.*;
class Date{
public static void main(String[] args){
HashMap <Integer,String> dt=new HashMap<Integer,String> ();
dt.put(01,"one");
dt.put(02,"two");
dt.put(03,"three");
dt.put(04,"four");
dt.put(05,"five");
dt.put(06,"six");
dt.put(07,"seven");
dt.put(8,"eight");
dt.put(9,"nine");
dt.put(10,"ten");
dt.put(11,"eleven");
dt.put(12,"tweleve");
dt.put(13,"thirteen");
dt.put(14,"forteen");
dt.put(15,"fifteen");
dt.put(16,"sixteen");
dt.put(17,"seventeen");
dt.put(18,"eignteen");
dt.put(19,"nineteen");
dt.put(20,"twenty");
dt.put(21,"twentyone");
dt.put(22,"twentytwo");
dt.put(23,"twentythree");
dt.put(24,"twentyfour");
dt.put(25,"twentyfive");
dt.put(26,"twentysix");
dt.put(27,"twentyseven");
dt.put(28,"twentyeight");
dt.put(29,"twentynine");
dt.put(30,"thirty");
dt.put(31,"thirtyone");
HashMap<Integer,String> mn=new HashMap<Integer,String> ();
mn.put(01,"january");
mn.put(02,"february");
mn.put(03,"march");
mn.put(04,"april");
mn.put(05,"may");
mn.put(06,"june");
mn.put(07,"july");
mn.put(8,"august");
mn.put(9,"september");
mn.put(10,"october");
mn.put(11,"november");
mn.put(12,"december");
HashMap<Integer,String>yr=new HashMap<Integer,String>();
yr.put(2011,"two thousand eleven");
yr.put(2012,"two thousand tweleve");
yr.put(2013,"two thousand thirteen");
yr.put(2014,"two thousand fourteen");
yr.put(2015,"two thousand fifteen");
yr.put(2016,"two thousand sixteen");
yr.put(2017,"two thousand seventeen");
yr.put(2018,"two thousand eighteen");
Scanner sc=new Scanner(System.in);
System.out.println("enter the date:");
String date=sc.next();

int str=Integer.parseInt(date.substring(0,2));
int str1=Integer.parseInt(date.substring(3,5));
int str2=Integer.parseInt(date.substring(6));
System.out.println(dt.get(str)+" "+mn.get(str1)+yr.get(str2));
}
}