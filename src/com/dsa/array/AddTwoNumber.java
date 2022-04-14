package com.dsa.array;

/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.
*/
class ListNode {
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

public class AddTwoNumber {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newList = new ListNode(0);
        ListNode result = newList;
        int carry = 0;
        int first;
        int second;
        int sum;
        while (null != l1 || null != l2) {

            first = null != l1 ? l1.val : 0;
            second = null != l2 ? l2.val : 0;

            sum = carry + first + second;
            carry = sum / 10;

            newList.next = new ListNode(sum % 10);
            newList = newList.next;


            l1 = null != l1 ? l1.next : l1;
            l2 = null != l2 ? l2.next : l2;
        }
        if (carry == 1) {
            newList.next = new ListNode(carry);
        }
        return result.next;
    }
}