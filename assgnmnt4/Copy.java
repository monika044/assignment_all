import java.io.*;

class Copy{
public static void main(String[] args)throws IOException{

File f1=new File("C:\\Users\\student\\Desktop\\java training\\assgnmnt4\\Abc.txt");
File f2 =new File("C:\\Users\\student\\Desktop\\java training\\assgnmnt4\\Xyz.txt");

FileInputStream fis=new FileInputStream(f1);
FileOutputStream fos=new FileOutputStream(f2);

BufferedInputStream bis =new BufferedInputStream(fis);
BufferedOutputStream bos =new BufferedOutputStream(fos);

int s;
while((s=bis.read())!=-1){

bos.write(s);
System.out.print((char)s);
}bos.flush();
}
}



















