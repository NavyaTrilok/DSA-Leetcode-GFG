// { Driver Code Starts
//Initial Template for Java

import java.util.*;

public class GFG
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) 
        {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            
            int A[] = new int[n1];
            int B[] = new int[n2];
            int C[] = new int[n3];
            
            for (int i = 0;i < n1;i++)
            {
                A[i] = sc.nextInt();
            }
            for (int i = 0;i < n2;i++)
            {
                B[i] = sc.nextInt();
            }
            for (int i = 0;i < n3;i++)
            {
                C[i] = sc.nextInt();
            }
            
            Solution sol = new Solution();
            ArrayList<Integer> res = sol.commonElements(A, B, C, n1, n2, n3);
            if (res.size() == 0)
            {
                System.out.print(-1);
            }
            else 
            {
                for (int i = 0;i < res.size();i++)
                {
                    System.out.print(res.get(i) + " ");
                }    
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    
        public static boolean binary_search(int arr[], int n, int element)
        {
            int l = 0, h = n - 1;
            while (l <= h) {
                int mid = (l + h) / 2;
                if (arr[mid] == element) {
                    return true;
                }
                else if (arr[mid] > element) {
                    h = mid - 1;
                }
                else {
                    l = mid + 1;
                }
            }
            return false;
         }
         
         
    ArrayList<Integer> commonElements(int a[], int b[], int c[], int n1, int n2, int n3) 
    {
       // Iterate on first array
       ArrayList<Integer> al = new ArrayList<>();
        for (int j = 0; j < n1; j++)
        {
           if (j != 0 && a[j] == a[j - 1]) {
                continue;
            }
            // check if the element is present in 2nd and 3rd
            // array.
            if (binary_search(b, n2, a[j]) && binary_search(c, n3, a[j])) {
                 
                al.add(a[j]);
                 
            }
        }
        
        return al;
         
    }
}