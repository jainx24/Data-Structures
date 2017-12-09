/*
Equal Stacks

You have three stacks of cylinders where each cylinder has the same diameter, but they may vary in height. You can change the height of a stack by removing and discarding its topmost cylinder any number of times.

Find the maximum possible height of the stacks such that all of the stacks are exactly the same height. This means you must remove zero or more cylinders from the top of zero or more of the three stacks until they're all the same height, then print the height. The removals must be performed in such a way as to maximize the height.

Note: An empty stack is still a stack.
*/



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class equalStacks {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        
        int i=1;
        long sum1=0,sum2=0,sum3=0,max=0;
        
        int [] a = new int [n1];
        int [] b = new int [n2];
        int [] c = new int [n3];
        
        
        for(i=0;i<n1;i++)
        {
            a[i]=in.nextInt();
            sum1=sum1+a[i];
        }
            

        
        for(i=0;i<n2;i++)
        {
            b[i]=in.nextInt();
            sum2=sum2+b[i];
        }
        
        for(i=0;i<n3;i++)
        {
            c[i]=in.nextInt();
            sum3=sum3+c[i];
        }
        
        int x=0,y=0,z=0;
        
        if(sum1==sum2 && sum2==sum3)
            max=sum1;
        
        while(sum1!=sum2 || sum2!=sum3)
        {
            if((sum1>sum2 && sum1>sum3) || (sum1==sum2 && sum1>sum3) || (sum1==sum3 && sum1>sum2))
            {
                if(sum1==0)
                    break;
                sum1 = sum1 - a[x++];
            }
            
            else if((sum2>sum1 && sum2>sum3) || (sum2==sum1 && sum2>sum3) || (sum2==sum3 && sum2>sum1))
            {
                if(sum2==0)
                    break;
                sum2 = sum2 - b[y++];
            }
            else if((sum3>sum1 && sum3>sum2) || (sum3==sum1 && sum3>sum2) || (sum3==sum2 && sum3>sum1))
            {
                if(sum3==0)
                    break;
                sum3 = sum3 - c[z++];
            }
            else
                break;
            
            if(sum1==sum2 && sum2==sum3)
                max=sum1;
        }
        
        System.out.println(max);
        
    }
}
