import java.util.HashMap;

public class Arrays {
    public static void printArray(int [] a)
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void reverse(int a[])
    {
        int start=0;
        int end=a.length-1;
        while(start<=end)
        {
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
        printArray(a);
    }
    public static void reverse (int a[], int left, int right)
  {
	while (left < right)
	  {
		int temp = a[left];
		  a[left] = a[right];
		  a[right] = temp;
		  left++;
		  right--;
	  }


  }
  public static void rightRotate (int a[], int k)
  {
	int n = a.length;
	reverse (a, 0, n - k - 1);
	reverse (a, n - k, n - 1);
	reverse (a, 0, n - 1);
    printArray(a);
  }
  public static void leftRotate (int a[], int k)
  {
	int n = a.length;
	reverse (a, 0, k - 1);
	reverse (a, k, n - 1);
	reverse (a, 0, n - 1);
    printArray(a);
  }
  public static void uniqueNumber(int[] nums) {
    int xor=0;
    for(int i=0;i<nums.length;i++)
    {
        xor=xor^nums[i];
    }
    System.out.println(xor);
    
}
public static void maxSubArray(int[] nums) 
    {
      int curr=0;
        int maxs=Integer.MIN_VALUE;
       
        
        for(int i=0;i<nums.length;i++)
        {
            curr+=nums[i];
            if (curr > maxs) {
                maxs = curr;
            }
            if(curr<0)
            curr=0;
             
           // maxs=Math.max(curr,maxs);
        }
        
        System.out.println(maxs);
    }
    public static void majority1(int a[],int n)
    {
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        for(int i:map.keySet())
        {
            if(map.get(i) > a.length/2)
            System.out.println(i);
        }
        
    }
    public static void majority2(int a[],int n)
    {
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        int votes=0;
        int maj=-1;
        for(int i=0;i<n;i++)
        {
            if(votes==0)
            {
                maj=a[i];
                votes=1;
            }
            else
            {
                if(a[i]==maj)
                votes++;
                else
                votes--;
                
            }
            
            }
            int c=0;
            for(int i=0;i<n;i++)
        {
            if(a[i]==maj)
            {
                c++;
            }
            
            
        }
        if(c>a.length/2)
        System.out.println(maj);
    }
    public static void minAndMaxNumOfArray(int a[]) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <a.length; i++) {
            min = Math.min(min, a[i]);
            max = Math.max(max, a[i]);
        }
        System.out.println("Min element: " + min);
        System.out.println("Max element: " + max);
    }
    public static void bubbleSort(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    
                }
            }
        }
        printArray(a);
      
    }
    public static void selectionSort(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            int min_index=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]<a[min_index])
                {
                    min_index=j;
                }
            }
            int temp=a[i];
            a[i]=a[min_index];
            a[min_index]=temp;
        }
        printArray(a);
    }
    public static void insertionSort(int a[])
    {
        for(int i=0;i<a.length-1;i++)
        {
            int j=i+1;
            while(a[j]<a[j-1]&& j>0)
            {
                int temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
                j--;
            }
            
        }
        printArray(a);
    }

    public static void main(String[] args)
    {
        int a[]={1,3,4,2,5};
        int nums[]={1,0,-2,5};
        int maj1[]={1,2,1,2,3,1,1,4,1,5,1};
       /*reverse(a);
       rightRotate(a,2);
       leftRotate(a,2);
       uniqueNumber(nums);
       maxSubArray(nums);
       majority1(maj1,maj1.length);
       majority2(maj1,maj1.length);
       minAndMaxNumOfArray(maj1);*/
      // bubbleSort(a);
      //selectionSort(a);
      insertionSort(a);
    }
    
    
}
