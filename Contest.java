package DSA;

import java.util.HashMap;
import java.util.Scanner;

public class Contest {
    /*A farmer needs your help. He has N cows, numbered from 1 to N, all are standing in a row. Each cow has a breed ID: 1, 2, and 3. 
    Farmer would like your help counting the number of cows of each breed that lie within certain intervals of the ordering.
     Sample Input 0

     6 3
     2
     1
     1
     3
     2
     1
     1 6
     3 3
     2 4
     Sample Output 0
    
     3 2 1
     1 0 0
     2 0 1
   */

    /*public static void farmer()
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int q=s.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        while(q>0)
        {
            int c=0;
            int c1=0;
            int c2=0;
            int a=s.nextInt();
            int b=s.nextInt();
            for(int i=a-1;i<b;i++)
            {
                if(arr[i]==1)
                    c++;
                else if(arr[i]==2)
                    c1++;
                else
                    c2++;
            }
            System.out.println(c+" "+c1+" "+c2);
             q--;
        }
        
    }*/
  /*   Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]). Print running sum of array
    Sample Input 0

 5
 1 2 3 4 5
 Sample Output 0

 1 3 6 10 15
 Sample Input 1

 1
 5
 Sample Output 1*/


/*public static void arraySum() {

        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=a[i];
            System.out.print(sum+" ");
        }
        
    }*/

/*help shyam in counting boxes
Shyam has N empty boxes. for every i(1<=i<=N), ith box is a cube with side length Ai. 
Shyam can put a box i into a box j if following conditions are met.
 Sample Input 0

 3
 1 2 3
 Sample Output 0

 1
 Explanation 0

 it is possible to put box 1 into box 2, and 2 into 3.

 Sample Input 1

 4
 4 2 4 3
 Sample Output 1

 2
 Explanation 1

Shyam can put box 2 into box 3, and box 4 into box 1.*/
public static void count() {
        Scanner s=new Scanner(System.in);
        HashMap <Integer,Integer> map=new HashMap<>();

    int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
            }
        for(int i=0;i<n;i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
            }
        int r=Integer.MIN_VALUE;
        for(int i:map.keySet())
            {
            if(map.get(i)>r)
                r=map.get(i);
        }
        System.out.println(r);
        s.close();
        
        
    }

public static void main(String[] args)
{
//farmer();
//arraySum();
count();

}
}
    

