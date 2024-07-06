package LinkedList;

public class Linkedlist
{
     private static class Node{
        int data;
        Node next;
        Node(int x){
            data=x;
            next=null;
        }

    }
    public static Node insert_at_beg(Node head,int data){
        Node temp=new Node(data);
        temp.next=head;
        return temp;
    }

    //insert at end
    public static Node insert_at_end(Node head,int data){
        Node temp=new Node(data);
        Node curr=head;
        //if there is no node , then we will return new node reference as head
        if(head==null) return temp;
        //If already there is node then we will traverse the curr to point last node
        while(curr.next!=null){
            curr=curr.next;
        }
        //Now we are pointing curr to last node, and lastnode next will be point to new temp node
        curr.next=temp;
        //Head will be modified only in the case , if there is no node already other wise
        //Head will be same , it will point like before , the first node of list
        return head;
    }

    public static Node insert_at_pos(Node head,int data,int pos){
        Node temp=head;
        Node newnode=new Node(data);
        int count=pos-2; // Here pos-2 becuase we need to go prev node of location
        //In each sigle iteration temp=temp.next traverse two node, temp to temp.next therefore
        //System.out.println("count"+count);

        //if pos=1 then
        if(pos==1){
            //assign first node to new node next part
            //to make new node first node and return new node
            //reference as new head
            newnode.next=head;
            return newnode;
        }

        while(count>0){
            //Checking if the pos is greater than linked list, on that case null
            //will be found before the position, so we will return
            if(temp.next==null){
                System.out.println("\nPosition not exist");
                return head;
            }
            temp=temp.next;
            count--;
        }
        //Keep in mind we are changin head pointer only
        //if we have to add at first location

        //System.out.println(temp.data);
        //Now adding new node at position
        newnode.next=temp.next; //first taken the right node location in new node next
        temp.next=newnode; //Now storing new node refrence in right next
        return head;
    }

    //---Delete Node----

    public static Node delete_at_start(Node head){
        //In the case of 0 or 1 nodes only
        if(head==null) return head;
        return head.next;

    }

    public static Node delete_at_end(Node head){
        if(head==null||head.next==null) return head;
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
// Search through linkedlist

    public static int recursive_search(Node head,int x){
        if(head==null) return -1;
        if(head.data==x) return 1;
        else{
            int res=recursive_search(head.next,x);
            if(res==-1) return -1;
            else return res+1;
        }

    }
    public static int iterate_search(Node head,int x){
        if(head==null) return -1;
        Node temp=head;
        int count=1;
        while(temp.next!=null){
            if(temp.data==x){
                return count;
            }
            count++;
            temp=temp.next;
        }
        return -1;
    }


    public static void print(Node head){
        Node temp=head;
        System.out.print(temp.data+" -> ");
        if(temp.next==null) return;
        print(temp.next);
    }

    public static void main(String[] args) {
        Node head=null;
        head= insert_at_beg(head,1);
        head= insert_at_beg(head,2);
        head= insert_at_beg(head,3);
        head=insert_at_end(head,4);
        head=insert_at_end(head,5);
        head=insert_at_end(head,6);
        print(head);
        /*
        head=insert_at_pos(head, 22, 2);
        System.out.println("\nDeleted Here First and Last Node");
        head=delete_at_start(head);
        head=delete_at_end(head);
         */
        System.out.print("\n");
        print(head);
        //int res=iterate_search(head,4);
        int res=recursive_search(head,5);
        if(res>=1){
            System.out.println("\nElement is found at "+res);
        }
    }

}

