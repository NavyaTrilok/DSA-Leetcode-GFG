// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        //Reading total number of testcases
        int t= sc.nextInt();
        
        while(t-- >0)
        {
            //reading the string
            String st = sc.next();
            
            //calling ispar method of Paranthesis class 
            //and printing "balanced" if it returns true
            //else printing "not balanced"
            if(new Solution().ispar(st) == true)
                System.out.println("balanced");
            else
                System.out.println("not balanced");
        
        }
    }
}// } Driver Code Ends




class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String exp)
    {
        Stack<Character> st = new Stack<>();
        char popped = 'a';
        for(int i=0;i<exp.length();i++){
            char ch = exp.charAt(i);
            if(ch=='('||ch=='['||ch=='{'){
                st.push(ch);
            }
            else if(ch==')'||ch==']'||ch=='}'){
                if(st.size()==0) return false;
                if(ch==']' && st.peek()!='[') return false;
                if(ch==')' && st.peek()!='(') return false;
                if(ch=='}' && st.peek()!='{') return false;
                st.pop();
            }
        }
        
        if(st.size()!=0) return false;
        else return true;
    }
}
