interface Animals{
public void speak();
public void eat();
}


class dog implements Animals{
public void  speak(){
System.out.print("dog is barking");
}
public void eat(){
System.out.print("dog is eating");
}

}
class cat implements Animals{
public void speak(){
System.out.print("cat is meow");
}
public void eat(){
System.out.print("cat is eating");
}
}
class test2{
public static void main(String[] args){
dog d=new dog();
cat c=new cat();
d.speak();
d.eat();
c.speak();
c.eat();
}
}