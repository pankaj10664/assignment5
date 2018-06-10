import java.util.*;
class pankaj1
{
public static void main(String args[])
{
int a[]={1,4,6,7,8,9,10};
int i=0;
Scanner sc=new Scanner (System.in);
System.out.println("enter a no.");
int b=sc.nextInt();

for(i=0;i<a.length;i++)
{
if(a[i]==b)
{

System.out.println("the entered no.is in the  given array");
}
else
{
	System.out.println("the entered no.is not in given array");
	break;
}
}
}
}
