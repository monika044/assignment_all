abstract class Animals{
String breed;
String colour;
public  void speak(){
System.out.print("animal speaking");
}
public abstract void eat();
}


class dog extends Animals{
public void speak(){
System.out.println("dog s barking");
}
public void eat(){
System.out.println("dog is eating");
}
}


public class abst{
public static void main(String[] args){
dog d= new dog();
d.speak();
d.eat();
}

 }