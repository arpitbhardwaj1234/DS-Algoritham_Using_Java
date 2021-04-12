import java.util.*;
import java.lang.*;


class Aart1234
{
public static int findMean(int[] task,int si,int ei)
{
float sum=0;
int i;
for(i=si;i<ei;i++)
{
sum=sum+task[i];
}
float m1=(float)(sum*1.0)/(ei-si);
int mean;
if(m1%1>=0.5)
{
mean=Math.round(m1);
}
else
{
mean=(int)m1;
}
return mean;
}
public static long getMin(int n,int[] task)
{
Arrays.sort(task);
long min=Long.MAX_VALUE;
int i;
for(i=1;i<task.length;i++)
{
int sum=0;
int m1=findMean(task,0,i);
int m2=findMean(task,i,task.length);
int j,k;
for(j=0;j<i;j++)
{
int x=task[j]-m1>=0?task[j]-m1:m1-task[j];
sum=sum+x;
}
for(k=i;k<n;k++)
{
int x=task[k]-m2>=0?task[k]-m2:m2-task[k];
sum=sum+x;
}
System.out.println(sum+" "+i);
if(sum<min)
{
min=sum;
}
}
return min;
}

public static void main(String[] args)
{
int n=5;
int[] task={1,5,3,11,17,27,35,45};
System.out.println(getMin(task.length,task));
}
}
