import java.util.*;

class Heap{
 public   ArrayList<Integer> arr=new ArrayList<Integer>();
    public void add(Integer x)
    {
        if(arr.size()==0)
        {
            arr.add(x);
            return;
        }
      arr.add(x);
      System.out.println("Arr is "+arr);
      int index=arr.size()-1;
      if(index!=0&&index%2==0)
      {
          index=arr.get(index)<arr.get(index-1)?index:index-1;
      }
      while(index>0&&arr.get((index-1)/2)>arr.get(index))
      {
          System.out.println("Inside while loop"+arr);
          int swap=arr.get(index);
          arr.set(index,arr.get((index-1)/2));
          arr.set((index-1)/2,swap);
          System.out.println("Inside while loop end"+arr);
          index=(index-1)/2;
      }
    }
    public int remove()
    {
         int x=arr.get(0);
         arr.set(0,arr.get(arr.size()-1));
        arr.remove(arr.size()-1);
     int index=0;
     while(2*index+1<arr.size())
     {
         int maxIndex=2*index+1;
         if(2*index+2<arr.size())
         {
             maxIndex=arr.get(2*index+1)>arr.get(2*index+2)?2*index+2:2*index+1;
         }
         if(arr.get(index)>arr.get(maxIndex))
         {
         int swap=arr.get(maxIndex);
         arr.set(maxIndex,arr.get(index));
         arr.set(index,swap);
         index=maxIndex;
         }
         else
         {
             break;
         }
        }
        return x;
        
    }

    public Integer peek()
    {
        if(arr.size()>0)
        {
            return arr.get(0);
        }
        return null;
    }

}


public class FindKthLargestElementUsingHeap {

    public static int findlargest(int[] arr,int k)
    {
     Heap hp=new Heap();
     for(int i=0;i<arr.length;i++)
     {
         if(i<k)
         {
         hp.add(arr[i]);
         }
         else
         {
             if(arr[i]>hp.peek())
             {
                 hp.remove();
                 hp.add(arr[i]);
             }
         }
         System.out.println(hp.arr);
     }
   
     return hp.peek();
    }

    public static void main(String args[])
    {
     int[] arr={1,2,3,4,5,6,7,8,9};
     System.out.println(findlargest(arr,3));
    }
    
}
