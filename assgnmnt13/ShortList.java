import java.util.*;
import java.io.*;
class Student{
int rollno;
String name;
int age;
Student(int rollno,String name, int age){
this.rollno=rollno;
this.name=name;
this.age=age;
}
}
class Ag implements Comparator<Student>{
public int compare(Student s1,Student s2){
if(s1.age==s2.age)
return 0;
else if (s1.age>s2.age)
return 1;
else
return -1;
}
}
class Na implements Comparator<Student>{
public int compare(Student s1,Student s2){
return s1.name.compareTo(s2.name);
}
}
class SortList{
public static void main(String[] args){

Arraylist <Student> al=new Arraylist <Student>();
al.add(new Student(44,"monika",19));
al.add(new Student(62,"rajni",21));
al.add(new Student(62,"rajni",20));
al.add(new Student(65,"raspreet",18));
al.add(new Student(65,"raspreet",20));
al.add(new Student(74,"shalu",19));

System.out.println("sorting by name..");
Collections.sort(al,new Na());
for(Student st:al){
System.out.println(st.rollno+" "+st.name+" "+st.age);
}
System.out.println("sorting by age..");
Collections.sort(al,new Ag());
for(Student st:al){
System.out.println(st.rollno+" "+st.name+" "+st.age);
}
}
}
