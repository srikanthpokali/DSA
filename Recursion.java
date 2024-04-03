package DSA;

import java.util.ArrayList;

public class Recursion {
    public static void print1to5(int start,int end)
    {
        if(start>end)
        return;
        System.out.println(start+" ");
        print1to5(start+1,end);
    }
    public static int fibon(int n)
    {
        if(n<=1) return n;
        else
        return fibon(n-1)+fibon(n-2);
    }
    public static int factorial(int n)
    {
        if(n==0) 
       return 1;
       else
       return n*factorial(n-1);
    }
    public static void printsubSequences(String s,int i,String newStr)
    {
        if(i==s.length())
        {
            System.out.println(newStr+" ");
            return;
        }
        printsubSequences(s,i+1,newStr+s.charAt(i));
        printsubSequences(s,i+1,newStr);
    }
    public static void removeDuplicates(String s,int i,String newstr)
    {
        if(i==s.length()-1)
        {
            System.out.print(newstr);
            return;
        }
        if(s.charAt(i)==s.charAt(i+1))
        {
            removeDuplicates(s,i+1,newstr);
        }
        else
        {
            removeDuplicates(s,i+1,newstr+s.charAt(i));
        }
    }
    public static void pString(String s,String permutation)
    {
         if(s.length()==0)
         {
             System.out.print(permutation+" ");
             return;
         }
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            String newString=s.substring(0,i)+s.substring(i+1);
            pString(newString,permutation+c);
        }
    }
    public static void permutation(int a[],ArrayList<Integer> al,boolean [] b)
    {
        if(al.size()==a.length)
        {
            System.out.println(al);
            return;
        }
        for(int i=0;i<a.length;i++)
        {
            if(b[i]==false)
            {
                b[i]=true;
                al.add(a[i]);
                permutation(a,al,b);
                al.remove(al.size()-1);
                b[i]=false;
                
            }
        }
    }
    public static void combsum(int i,int t,int a[],ArrayList<Integer> al)
    {
        if(i==a.length)
        {
            if(t==0)
            {
                System.out.println(al);
            }
            return;
        }
        if(a[i]<=t)
        {
            al.add(a[i]);
            combsum(i,t-a[i],a,al);
            al.remove(al.size()-1);
        }
        combsum(i+1,t,a,al);
    }
    

    public static void main(String[] args) {
        //print1to5(1,5);
        //int ans=fibon(6);
        //int ans=factorial(5);
        //printsubSequences("abcd",0,"");
        //removeDuplicates("aabbbbccdde",1,"");
        //pString("abcd","");
       /*int a[]={1,2,3,4};
       boolean b[]=new boolean[a.length];
       ArrayList<Integer> al=new ArrayList<>();
       permutation(a,al,b);*/
       /*int tar=5;
		int arr[]={1,2,3,4};
		ArrayList< Integer> al=new ArrayList<>();
		combsum(0,tar,arr,al);*/
        //System.out.println(ans);
    }
    
}
