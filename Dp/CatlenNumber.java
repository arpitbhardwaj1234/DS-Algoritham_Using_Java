import java.util.*;
import java.lang.*;

class CatlenNumber
{
public static int findCatlan(int n)
{
if(n<1)
{
return 1;
}
int i=0;
int x=0;
for(i=0;i<n;i++)
{
x+=findCatlan(i)*findCatlan(n-i-1);
}
return x;
}
public static void main(String args[])
{
int n=3;
System.out.println(findCatlan(n));
}
}