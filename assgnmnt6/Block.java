class Stat{
 
static String s;
static int num;

static 
{
s ="monika";
num=5;
}
public static void Show()
{
System.out.println(s);
System.out.println(num);

}
}

class Block{
public static void main(String[] args){
Stat.Show();
}
}
