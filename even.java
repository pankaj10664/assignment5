import java.util.Scanner;
class Even
{
public static void main(String[] args)
{
int a;
Scanner obj = new Scanner(System.in);
System.out.println("Enter any no.=");
a = obj.nextInt();

if(a%2==0)
{
System.out.println("the given no. is even");
}
else
{
System.out.println("the given no. is not even");
}
}
}