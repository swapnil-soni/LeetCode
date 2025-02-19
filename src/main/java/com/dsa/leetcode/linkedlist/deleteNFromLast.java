package com.dsa.leetcode.linkedlist;

public class deleteNFromLast {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode start= head;

        System.out.println("Before: ");
        while(start != null){
            System.out.print(start.val + " ");
            start = start.next;
        }

        removeNthFromEnd(head, 2);

        start = head;
        System.out.println("\nAfter: ");
        while(start != null){
            System.out.print(start.val + " ");
            start = start.next;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head, slow = head;
        int cnt = 0;

        for(int i=1; i<=n; ++i){
            fast = fast.next;
        }

        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return head;
    }
}

