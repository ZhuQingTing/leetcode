package cn.caspar.leetcode.leetcode.p00002;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {

    @Test
    void addTwoNumbers() {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        AddTwoNumbers.ListNode l1 = new AddTwoNumbers.ListNode(2);
        l1.setNext(new AddTwoNumbers.ListNode(4));
        l1.getNext().setNext(new AddTwoNumbers.ListNode(3));

        AddTwoNumbers.ListNode l2 = new AddTwoNumbers.ListNode(5);
        l2.setNext(new AddTwoNumbers.ListNode(6));
        l2.getNext().setNext(new AddTwoNumbers.ListNode(4));
        AddTwoNumbers.ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);

        Assertions.assertEquals(7, result.getVal());
        Assertions.assertEquals(0, result.getNext().getVal());
        Assertions.assertEquals(8, result.getNext().getNext().getVal());
    }
}