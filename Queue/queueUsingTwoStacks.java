/*
Queue using Two Stacks

A queue is an abstract data type that maintains the order in which elements were added to it, allowing the oldest elements to be removed from the front and new elements to be added to the rear. This is called a First-In-First-Out (FIFO) data structure because the first element added to the queue (i.e., the one that has been waiting the longest) is always the first one to be removed.

A basic queue has the following operations:

Enqueue: add a new element to the end of the queue.
Dequeue: remove the element from the front of the queue and return it.
In this challenge, you must first implement a queue using two stacks. Then process  queries, where each query is one of the following  types:

1 x: Enqueue element  into the end of the queue.
2: Dequeue the element at the front of the queue.
3: Print the element at the front of the queue.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class queueUsingTwoStacks {
    
    public static Stack<Integer> s1 = new Stack<>();
    public static Stack<Integer> s2 = new Stack<>();
    
    public static void enqueue(int x)
    {
        s1.push(x);
    }
    
    public static void dequeue()
    {
        if(s2.empty())
        {
           while(!s1.empty())
           {
               s2.push(s1.peek());
               s1.pop();
           }
        }
        s2.pop();       
    }
    
    public static void print()
    {
        if(s2.empty())
        {
           while(!s1.empty())
           {
               s2.push(s1.peek());
               s1.pop();
           }
        }
        System.out.println(s2.peek());
    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int i,q,x;
        
        for(i=0;i<n;i++)
        {
            q = in.nextInt();
            
            switch(q)
            {
                case 1:
                    x = in.nextInt();
                    enqueue(x);
                    break;
                case 2:
                    dequeue();
                    break;
                case 3:
                    print();
                    break;                    
            }
        }
        
    }
}