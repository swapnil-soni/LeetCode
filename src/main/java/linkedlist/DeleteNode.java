package linkedlist;

public class DeleteNode {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        ListNode start= head;

        System.out.println("Before: ");
        while(start != null){
            System.out.print(start.val + " ");
            start = start.next;
        }

        deleteNode(head.next.next);
        System.out.println("\nAfter: ");
        start = head;
        while(start != null){
            System.out.print(start.val + " ");
            start = start.next;
        }
    }
    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
