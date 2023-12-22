package LinkedList;

public class DoublyLinkedList {
 static class Node{
     final private int data;
     private Node next;
     private Node prev;
     Node(int data){
         this.data=data;
         //Here this.data is current class member
         //data is value we get from argument
         next=null;
         prev=null;

     }
 }

    public static void insert_at_end(Node head,int data){
        Node Toadd=new Node(data);
        if(head.next==null) { head.next=Toadd; Toadd.prev=head; return;  }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=Toadd;
        Toadd.prev=curr;
        return;

    }

    public static Node insert_at_start(Node head,int data){
        Node Toadd=new Node(data);
        if(head==null) { System.out.println("No element exists"); return Toadd;}
        head.prev=Toadd; Toadd.next=head;
        return Toadd;
    }

    public static Node insert_at_between(Node head,int data,int pos){
     Node newnode=new Node(data);
     if(pos==0){ newnode.next=head; head.prev=newnode; return newnode; }
     if(pos==1){ head.next=newnode; newnode.prev=head; return head; }
     Node curr=head;
     //checking total number of node already
        int count=0;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        System.out.println("count"+count);
        if(pos>count) {System.out.println("Out of number of nodees exist"); return head;}
        if(pos+1>count){ //for last position
            insert_at_end(head,data);
            return head;
        }


     //Here we will maintain two pointer one is prev and curr node
     curr=head;
     Node nextnode=curr.next;
     //Pos >2 to reduce the traversing of current , becuase our next node is already pointing at second node
     while(pos>2){
         curr=curr.next;
         nextnode=nextnode.next;
         pos--;
     }
     //Adding our node between curr and next
     curr.next=newnode;
     newnode.prev=curr;
     nextnode.prev=newnode;
     newnode.next=nextnode;
     return head;
    }

    public static void PrintAllForward(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }

    public static Node reversedlist(Node head){
     Node curr=head;
     Node temp=null;
     while(curr!=null){
         //swapping prev and next
         System.out.println("data"+curr.data);
         temp=curr.prev;
         curr.prev=curr.next;
         curr.next=temp;
         //After swapping, prev is pointing to the next node not next node now
         curr=curr.prev;
     }
     return temp.prev;
    }

    public static void main(String[] args) {
        Node head=new Node(10);
        head=insert_at_start(head,9);
        head=insert_at_start(head,8);
        Node temp1=new Node(11);
        Node temp2=new Node(12);

        Node temp3=new Node(13);
        //here Adding Manually
        head.next=temp1;
        temp1.prev=head;
        temp1.next=temp2;
        temp2.prev=temp1;
        temp2.next=temp3;
        temp3.prev=temp2;
        temp3.next=null;
        //Here adding though my created function to add at end
        insert_at_end(head,14);
        insert_at_end(head,15);
        System.out.println("Before :");
        PrintAllForward(head);

        //head=insert_at_between(head,33,3);
        //Here calling to Print
        //System.out.println("After :");
        //PrintAllForward(head);
        head=reversedlist(head);
        System.out.println("\n Reversed:");
        PrintAllForward(head);
    }
}


