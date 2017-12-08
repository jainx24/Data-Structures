/*
Merge two sorted linked lists

You’re given the pointer to the head nodes of two sorted linked lists. 
The data in both lists will be sorted in ascending order. 
Change the next pointers to obtain a single, merged linked list which also has data in ascending order. 
Either head pointer given may be null meaning that the corresponding list is empty.

  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node mergeLists(Node headA, Node headB) {
     // This is a "method-only" submission. 
     // You only need to complete this method 
    Node head = null;
    Node temp = null;
    
    
    if(headA==null)
        return headB;
    if(headB==null)
        return headA;
    
    while(headA!=null && headB!=null)
    {
        if(headA.data<headB.data)
        {
            if(head==null)
            {
                head=headA;
                headA=headA.next;
                head.next=null;
                temp=head;
            }
            else
            {
                temp.next=headA;
                headA=headA.next;
                temp=temp.next;
                temp.next=null;
            }
        }
        
        else
        {
            if(head==null)
            {
                head=headB;
                headB=headB.next;
                head.next=null;
                temp=head;
            }
            else
            {
                temp.next=headB;
                headB=headB.next;
                temp=temp.next;
                temp.next=null;
            }
        }
    }
    
    while(headA!=null)
    {
        temp.next=headA;
        headA=headA.next;
        temp=temp.next;
        temp.next=null;
    }
    
    while(headB!=null)
    {
        temp.next=headB;
        headB=headB.next;
        temp=temp.next;
        temp.next=null;
    }
    
    return head;

}
