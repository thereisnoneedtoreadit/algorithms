package org.example;

//Given the head of a singly linked list, reverse the list, and return the reversed list.
//
//        Input: head = [1,2,3]
//Output: [3,2,1]
public class ReverseLinkedList {


    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode tmp = current.next;
            current.next = prev;
            prev = current;
            current = tmp;
        }

        return prev;
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
