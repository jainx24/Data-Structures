// https://www.hackerrank.com/challenges/dynamic-array/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n,q,lastAns=0,i,j,w,temp,size;
        
        n = scan.nextInt();
        q = scan.nextInt();
        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
        
        for(i=0;i<n;i++)
            al.add(new ArrayList<Integer>());
          
        for(w=0;w<q;w++)
        {
            int v,x,y;
            v = scan.nextInt();
            x = scan.nextInt();
            y = scan.nextInt();
            
            if(v==1)
            {
                temp = (x^lastAns)%n;
                al.get(temp).add(y);
            }
            
            else
            {
                temp = (x^lastAns)%n;
                size = al.get(temp).size();
                lastAns = al.get(temp).get(y%size);
                System.out.println(lastAns);
            }
            
        }
        
    }
}