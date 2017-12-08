/*
Find Merge Point of Two Lists

Given pointers to the head nodes of  linked lists that merge together at some point, find the Node where the two lists merge. 
It is guaranteed that the two head Nodes will be different, and neither will be NULL.

  Find merge point of two linked lists
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

public int mergePoint(Node headA, Node headB, int d) {
    
    for(int i=1;i<=d;i++)
        headA=headA.next;
    
    while(headA!=null && headB!=null)
    {
        if(headA.data==headB.data)
            return headA.data;
        headA=headA.next;
        headB=headB.next;
    }
    
    return -1;
}

int FindMergeNode(Node headA, Node headB) { 
    
    int sum1=0,sum2=0,ans=-1;
    
    Node temp = headA;
       
    while(temp!=null)
    {
        sum1++;
        temp=temp.next;
    }
    
    temp = headB;
    
    while(temp!=null)
    {
        sum2++;
        temp=temp.next;
    }
    
    int d = Math.abs(sum1-sum2);
    
    if(sum1>sum2)
        ans = mergePoint(headA,headB,d);
    else
        ans = mergePoint(headB,headA,d);
    
    return ans;

}
