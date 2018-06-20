import java.io.*;
class Test{
public static void main(String[] args) throws IOException{

FileReader fr = new FileReader("C:\\Users\\student\\Desktop\\java training\\assgnmnt9\\abc.txt");
int c;

while( (c=fr.read()) != -1 ){
System.out.print((char)c);
}

}

}