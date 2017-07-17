import java.util.*;
class Num
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter any integer no:");
int num=sc.nextInt();
if(num>0)
{
System.out.println(num+"is positive no");
}
else if(num<0)
{
System.out.println(num+"is negative no");
}
else
{
System.out.println("it's zero no");
}
}
}
