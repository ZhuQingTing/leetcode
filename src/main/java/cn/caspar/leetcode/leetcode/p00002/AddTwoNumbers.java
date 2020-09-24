package cn.caspar.leetcode.leetcode.p00002;

/**
 * https://leetcode-cn.com/problems/add-two-numbers/
 *
 * @author zqt
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        addTwoNumbers(l1, l2, result, 0);
        return result;
    }

    private void addTwoNumbers(ListNode l1, ListNode l2, ListNode result, int step) {
        int num = l1.getVal() + l2.getVal() + step;
        if (num >= 10) {
            result.setVal(num % 10);
            step = num / 10;
        } else {
            result.setVal(num);
            step = 0;
        }
        if (null == l1.getNext() && null == l2.getNext()) {
            if (0 == step) {
                return;
            }
            result.setNext(new ListNode(step));
            return;
        }
        result.setNext(new ListNode(0));
        l1 = null == l1.getNext() ? new ListNode(0) : l1.getNext();
        l2 = null == l2.getNext() ? new ListNode(0) : l2.getNext();
        addTwoNumbers(l1, l2, result.getNext(), step);
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public ListNode getNext() {
            return next;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }
    }

}
