package leetcode.stack;

public class SumOfLinkedList {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;

        }
    }
    static Node head1, head2;
    public static void main(String[] args) {
        int number1 = 563, number2=842; // sum = 1221
        head1 = covertNumberToLinkedlist(number1,head1);
        head2 = covertNumberToLinkedlist(number2,head2);

        displayList(head1);
       displayList(head2);
       Node sum = sumOfList(head1,head2);
        displayList(sum);

    }

    private static Node sumOfList(Node head1, Node head2) {
        Node head = null;
        int carry = 0;
        while (head1!=null || head2 != null || carry > 0){
            int digit1 = head1== null ? 0:head1.data;
            int digit2 = head2== null ? 0:head2.data;
            int sum = digit1 + digit2 + carry;
             carry = sum/10;
            if(head == null ){
                head = new Node(sum%10);
            }
            else{
                Node index = head;
                while(index.next != null)
                    index = index.next;
                index.next = new Node(sum%10);
            }
            if(head1!=null)
            head1 = head1.next;
            if(head2 != null)
            head2 = head2.next;
        }

        return head;
    }

    private static void displayList(Node head) {
        Node n = head;
        String num = "";
        while (n!=null){
            {
                num = n.data+num;
                n = n.next;
            }
        }
        System.out.println(num);
    }

    private static Node covertNumberToLinkedlist(int number, Node head) {
        while(number> 0){
            int digit = number%10;
            number /= 10;
            Node n = new Node(digit);
            if(head == null)
                head = n;
            else{
                Node index = head;
                while(index.next != null)
                    index = index.next;
                index.next = n;
            }
        }
        return head;
    }


}