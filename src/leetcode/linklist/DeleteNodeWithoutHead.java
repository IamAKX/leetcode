package leetcode.linklist;

public class DeleteNodeWithoutHead {
    static class Node{
        int val;
        Node next;
        Node(int x){
            val = x;
        }
    }

    static Node head;
    public static void main(String[] args) {
        head = new Node(4);
        head.next = new Node(5);
        head.next.next = new Node(1);
        head.next.next.next = new Node(9);
        
        Node node = head.next;
        displayNode();
        System.out.println("to be deleted "+ node.val);
        deleteNode(node);

        displayNode();

    }

    private static void deleteNode(Node node) {
          node.val = node.next.val;
          node.next = node.next.next;

    }

    private static void displayNode() {
        Node n = head;
        while (n != null)
        {
            System.out.print(n.val+"\t");
            n = n.next;
        }
        System.out.println();
    }
}
