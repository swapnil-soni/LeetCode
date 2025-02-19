package com.dsa.leetcode.linkedlist;

public class MiddleOfLL {
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

        start = middleNode(head);
        System.out.println("\nAfter: ");
        while(start != null){
            System.out.print(start.val + " ");
            start = start.next;
        }
    }
    public static ListNode middleNode(ListNode head) {
        ListNode fast = head, slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
