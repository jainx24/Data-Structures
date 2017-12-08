/*

Maximum Element

You have an empty sequence, and you will be given  queries. Each query is one of these three types:

1 x  -Push the element x into the stack.
2    -Delete the element present at the top of the stack.
3    -Print the maximum element in the stack.

*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
     

    public static void main(String[] args) {
       
        Stack<Integer> s = new Stack<Integer>();
        int max=Integer.MIN_VALUE;
        
        Scanner scan = new Scanner(System.in);
        
        int n,i;
        n = scan.nextInt();
        
        for(i=0;i<n;i++)
        {
            int q;
            q = scan.nextInt();
            
            switch(q)
            {
                case 1:
                    int x;
                    x = scan.nextInt();
                    if(!s.empty())
                    {
                        if(x>max)
                        {
                            s.push(2*x-max);
                            max=x;
                        }
                        else
                        {
                            s.push(x);
                        }
                    }
                    
                    else
                    {
                        s.push(x);
                        max=x;
                    }
                    break;
                case 2:
                    if(!s.empty())
                    {
                        int t = s.peek();
                        if(t<max)
                            s.pop();
                        else
                        {
                            int y = 2*max-t;
                            max=y;
                            s.pop();
                        }
                    }
                    
                    break;
                case 3:
                    if(!s.empty())
                        System.out.println(max);
                    
            }
        }
       
    }
}