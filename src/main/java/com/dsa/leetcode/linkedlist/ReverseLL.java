package com.dsa.leetcode.linkedlist;

public class ReverseLL {
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

        start = reverseList(head);
        System.out.println("\nAfter: ");
        while(start != null){
            System.out.print(start.val + " ");
            start = start.next;
        }
    }

    public static ListNode reverseList(ListNode head){
        ListNode next = null, newHead = null;
        while(head != null){
            next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }
}
