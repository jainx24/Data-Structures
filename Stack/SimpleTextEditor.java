/*
Simple Text Editor

In this challenge, you must implement a simple text editor. Initially, your editor contains an empty string, . You must perform  operations of the following  types:

append - Append string  to the end of .
delete - Delete the last  characters of .
print - Print the  character of .
undo - Undo the last (not previously undone) operation of type  or , reverting  to the state it was in prior to that operation.

*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class Solution {
    
    public static class bundle {
    int op;
    String str;
    
        public bundle(String str, int op)
        {
            this.op = op;
            this.str= str;
        }
    }

    
    
    public static void main(String[] args) {
        
        Stack<bundle> stack = new Stack<bundle>();      
        
        String s ="";
        int k;
        String prev="";
        Scanner scan = new Scanner(System.in);
        bundle bun;
        
        int n = scan.nextInt();
        
        for(int i=0;i<n;i++)
        {
            int x = scan.nextInt();
            
            switch(x)
            {
                case 1:
                    String s1 = scan.next();
                    prev=s;
                    s=s+s1;
                    bun = new bundle(prev,1);
                    stack.push(bun);
                    //System.out.println(s);
                    break;
                case 2:
                    k = scan.nextInt();
                    int len = s.length();
                    prev = s.substring(len-k,len);
                    s = s.substring(0,len-k);
                    bun = new bundle(prev,2);
                    stack.push(bun);
                    //System.out.println(s);
                    break;
                case 3:
                    k = scan.nextInt();
                    k=k-1;
                    System.out.println(s.charAt(k));
                    break;
                case 4:
                    if(!stack.empty())
                    {
                        
                        bun = stack.pop();
                        if(bun.op==1)
                           s = bun.str; 
                        if(bun.op==2)
                           s = s + bun.str;
                        //System.out.println(s);
                    }
            }
        }
    }
}