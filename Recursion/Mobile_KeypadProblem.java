import java.util.*;
import java.lang.*;


class Mobile_KeypadProblem
{
public static String[] findAllCharacter(int n)
{
     if(n<=0 || n>=10){
            String arr[]={""};
            return arr;
        }
        else if(n==2){
            String arr[]={"a","b","c"};
            return arr;
        }
        else if(n==3){
            String arr[]={"d","e","f"};
            return arr;
        }
         else if(n==4){
            String arr[]={"g","h","i"};
            return arr;
        }
         else if(n==5){
            String arr[]={"j","k","l"};
            return arr;
        }
         else if(n==6){
            String arr[]={"m","n","o"};
            return arr;
        }
         else if(n==7){
            String arr[]={"p","q","r","s"};
            return arr;
        }
         else if(n==8)
         {
            String arr[]={"t","u","v"};
            return arr;
        }
         else
         {
            String arr[]={"w","x","y","z"};
            return arr;
        }
    }


public static ArrayList<String> printAll_Combination(int n)
{
if(n==0)
{
return null;
}
else 
{
ArrayList<String> s=new ArrayList<String>();
 return printAll_Combination(n,s);
}
}

public static ArrayList<String> printAll_Combination(int n,ArrayList<String> s)
{
if(n==0)
{
return null;
}
if(n/10==0)
{
ArrayList<String> arrayList = new ArrayList<>(); 
Collections.addAll(arrayList, findAllCharacter(n)); 
//System.out.println(arrayList);
return  arrayList;
}
else
{
//System.out.println("Hello from else "+n);
int x=n%10;
n=n/10;
String arr[]=findAllCharacter(x);
ArrayList<String> ss=printAll_Combination(n,s);
System.out.println(ss);
ArrayList<String> ssb=new ArrayList<String>();
System.out.println(Arrays.toString(arr));
System.out.println(arr.length+" "+ss.size());
for(int i=0;i<arr.length;i++)
{
for(int j=0;j<ss.size();j++)
{
ssb.add(ss.get(j)+arr[i]);
System.out.println(arr[i]+ss.get(j));
}
}
return ssb;
}
}

public static void main(String[] args)
{
int n=23;
System.out.println(printAll_Combination(n));
}
}