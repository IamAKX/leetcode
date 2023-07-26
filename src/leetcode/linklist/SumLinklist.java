package leetcode.linklist;


public class SumLinklist {

    static Node head1,head2;
    static class Node {
        int data;
        Node next;


        Node(int data){
            this.data=data;
            next=null;
        }

    }

    public static void main(String[] args) {

        SumLinklist tll = new SumLinklist();



        head1 = insertNode(3, head1);
        head1 = insertNode(4, head1);
        head1 = insertNode(2, head1);
        head1 = insertNode(1, head1);

        head2 = insertNode(4, head2);
        head2 = insertNode(6, head2);
        head2 = insertNode(5, head2);
        head2 = insertNode(5, head2);
        head2 = insertNode(5, head2);


        display(head1);
        display(head2);

        display(addLinkedList(head1,head2));





    }

    static Node addLinkedList(Node head1, Node head2) {

        Node head= null;
        int carry=0;

        while(head1!=null || head2!=null) {
            int sum = carry;
            if(head1!=null) {
                sum+=head1.data;
                head1=head1.next;
            }
            if(head2!=null) {
                sum+=head2.data;
                head2=head2.next;
            }

            head=insertNode(sum%10,head);

            carry= sum/10;

        }
        if (carry>0) {
            insertNode(carry,head);
        }
        return head;
    }

    static void display(Node head){
        while(head!=null) {
            System.out.print(head.data +"->");
            head=head.next;
        }
        System.out.println("\n");
    }

    static Node insertNode(int data, Node head){
        if(head==null) {
            head = new Node(data);  
            return head;
        }
        Node newNode = new Node(data);
        newNode.next=head;
        head = newNode;
        return head;

    }

}