class Table{
synchronized void printTable(int n,int y){
for (int i=y;i<=n;i++){

System.out.println(i);
 
try{
Thread.sleep(4);
}
catch(Exception e){System.out.println(e);}
}
 
}
}
class MyThread1 extends Thread{
Table t;
MyThread1(Table t){
this.t=t;
}
public void run(){
t.printTable(500,0);
}
}class MyThread2 extends Thread{
Table t;
MyThread2(Table t){
this.t=t;
}
public void run(){
t.printTable(1000,500);
}
}
public class Test{
public static void main(String[] args){
Table obj = new Table();
MyThread1 t1=new MyThread1(obj);
MyThread2 t2=new MyThread2(obj);
t1.start();
t2.start();
}
}
