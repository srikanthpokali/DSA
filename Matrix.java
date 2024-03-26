public class Matrix {
    public static void printMatrix(int a[][])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void transpose(int[][] a)
     {
        for (int i = 0; i < a.length; i++)
         {
            for (int j = i + 1; j < a[i].length; j++) 
            {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        printMatrix(a);

    }
    public static void snake (int a[][])
  {
	for (int i = 0; i < a.length; i++)
	  {
		if (i % 2 == 0)
		  {
			for (int j = 0; j < a[i].length; j++)
			  {
				System.out.print (a[i][j] + " ");
			  }

			System.out.println ();
		  }
		else
		  {
			for (int j = a[i].length - 1; j >= 0; j--)
			  {
				System.out.print (a[i][j] + " ");
			  }
			System.out.println ();
		  }
	  }
  }
  public static void diagonalSum (int[][]mat)
  {
	int sum = 0;
	for (int i = 0; i < mat.length; i++)
	  {
		sum = sum + mat[i][i] + mat[i][mat.length - 1 - i];
	  }
	if (mat.length % 2 == 1)
	  sum -= mat[mat.length / 2][mat.length / 2];
	System.out.println(sum);

  }
  public static void boundaryTraversal(int a[][])
  {
      if(a.length==1)
      {
      for(int i=0;i<a[0].length;i++)
      System.out.print(a[0][i]+" ");
      
      }
      else if(a[0].length==1)
      {
          for(int i=0;i<a.length;i++)
        System.out.print(a[i][0]+" ");
         
      }
      for(int i=0;i<a[0].length;i++)
        System.out.print(a[0][i]+" ");
        for(int i=1;i<a.length;i++)
        System.out.print(a[i][a[i].length-1]+" ");
         for(int i=a[0].length-2;i>=0;i--)
        System.out.print(a[a.length-1][i]+" ");
         for(int i=a.length-2;i>=1;i--)
        System.out.print(a[i][0]+" ");
  }
  public static void spiralTraversal(int a[][])
    { 
        int top=0;
        int bottom=a.length-1;
        int left=0;
        int right=a[0].length-1;
        while(top<=bottom && left<=right)
        {
            for(int i=left;i<=right;i++)
               System.out.print(a[top][i]+" ");
             top++;
             for(int i=top;i<=bottom;i++)
                System.out.print(a[i][right]+" ");
            right--;
            if(top<=bottom)
            for(int i=right;i>=left;i--)
              System.out.print(a[bottom][i]+" ");
             bottom--;
             if(left<=right)
             for(int i=bottom;i>=top;i--)
             System.out.print(a[i][left]+" ");
             left++;
            
        }
    }

    public static boolean searchElement(int a[][],int target)
    {
        int i=0;
        int j=a[0].length-1;
        while(i<a.length && j>=0)            {
            if(a[i][j]==target)
            return true;
            else if(a[i][j]>target)j--;
            else i++;
        }
        return false;
    }
    public static void mirrorMatrix(int a[][]) {
        transpose(a);
        for (int i = 0; i < a.length; i++) {
            int high = a.length - 1;
            int low = 0;
            while (low < high) {
                int temp = a[low][i];
                a[low][i] = a[high][i];
                a[high][i] = temp;
                low++;
                high--;
            }
        }
        printMatrix(a);
    }
    
    public static void main(String[] args)
    {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        //transpose(a);
        //snake(a);
        //diagonalSum(a);
        //boundaryTraversal(a);
        //spiralTraversal(a);
        //searchElement(a,5);
        mirrorMatrix(a);
       
    }
    
}
