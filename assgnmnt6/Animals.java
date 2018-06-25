class Animals{

String breeed;
String colour;
public static void speak(){
 System.out.print("animals cannot talk");
}
}

class dog extends Animals{
public static void speak(){
 System.out.print("dog cannot talk");

}
}
class cat extends Animals{ 
public static void speak(){ 
System.out.print("cat cannot talk");

}
}
class Ani{
public static void main(){
  dog d=new dog();
  cat c=new cat();
d.speak();
d.speak();
}}