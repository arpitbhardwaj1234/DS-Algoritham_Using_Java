//Multiplication Recursively
//You can only add or subtract

class Multiplication_Rec
{
public static int multiplyRecursively(int m,int n)
{
if(n==0)
{
return 0;
}
return m+multiplyRecursively(m,n-1);
}
public static void main(String args[])
{
System.out.println(multiplyRecursively(3,5));
}
}
