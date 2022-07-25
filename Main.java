import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		
		while(true)
		{
		int arr[] = {7,10,4,3,20,15};
		int n = arr.length;
	    int k = sc.nextInt();
	    PriorityQueue<Integer> pq = new PriorityQueue<>();
	    
	    if(n/2<k)
	    {
	        //use max heap with the help of min heap by passing the negative value.
	        for(int i=0;i<n;i++)
	        {
	            pq.add(-1*arr[i]);
	        }
	        
	        int st = n-k+1;
	        while(st!=1)
	        {
	            pq.poll();
	            st--;
	        }
	        System.out.println(pq.poll()*-1);
	    }else{
	        for(int i=0;i<n;i++)
	        {
	            pq.add(arr[i]);
	        }
	        while(k!=1)
	        {
	            pq.poll();
	            k--;
	        }
	        System.out.println(pq.poll());
	    }
	}
	    
	}
}
