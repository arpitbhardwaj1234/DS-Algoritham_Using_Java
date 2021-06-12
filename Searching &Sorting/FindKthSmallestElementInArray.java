import java.util.*;

class The_Comparator implements Comparator<Integer> {
    public int compare(Integer x, Integer y)
    {
        return y.intValue()-x.intValue();
    }
}

class FindKthSmallestElementInArray {

  public static int findSmallest(int[] arr,int k)
  {
      PriorityQueue<Integer> pq=new PriorityQueue<>(new The_Comparator());
      for(int i=0;i<arr.length;i++)
      {
          System.out.println(pq);
          if(pq.size()<k)
          {
          pq.add(arr[i]);
          }
          else
          {
              if(arr[i]<pq.peek())
              {
                  pq.poll();
                  pq.add(arr[i]);
              }
          }
         
      }
      return pq.peek();
  }
    

public static void main(String[] args)
{
    int[] arr={7,6,5,4,8,9,3};
   System.out.println(findSmallest(arr,3));

}    
}
