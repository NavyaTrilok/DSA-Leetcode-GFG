// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
    		System.out.println (new Sol().countRev (s));
        }
        
    }
}
// Contributed By: Pranay Bansal
// } Driver Code Ends


//User function Template for Java

class Sol
{
    int countRev (String s)
    {
        if(s.length()%2==1)
                return -1;
                
        int c=0;
        int op=0,cl=0;
        for(int e=0; e<s.length();e++){
            if(s.charAt(e)=='{'){
                op++;
            }else{
                if(op==0){
                    c++;
                    op++;
                }else{
                    op--;
                }
            }
        }
        
        c=c+((op+cl)/2);
        return c;
    }
}