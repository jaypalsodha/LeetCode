package com.leetcode.linkedList;

import java.util.List;

public class MergeTwoLinkedList {

    /*
     * Merge two linkedList.
     * Two linkedList are sorted, we have to merge two linkedlist such that
     * they are still in the sorted order.
     *
     * We can take two pointers to solve this problem.
     * Each pointer would points to the head of each linkedlist.
     * we will compare values of both the linkedlist and move the
     * pointer forward.
     *
     */

    public static void main(String[] args) {
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p1 = l1, p2 = l2;
        ListNode newNode = new ListNode(0); // temp node to start
        ListNode head = newNode;
        while (p1 != null && p2 != null) {
            if (p1.val <= p1.val) {
                head.next = new ListNode(p1.val);
                l1 = l1.next;
            } else {
                head.next = new ListNode(p2.val);
                l2 = l2.next;
            }
            head = head.next;
        }
        if (p1 == null && p2 != null) {
            head.next = p2;
        }
        if (p1 != null && p2 == null) {
            head.next = p1;
        }
        return newNode.next;
    }
}

// definition of singly linked list
class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}