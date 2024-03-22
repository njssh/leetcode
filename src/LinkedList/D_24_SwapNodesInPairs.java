package LinkedList;

public class D_24_SwapNodesInPairs {

    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1, head);
        ListNode pre = dummy;

        while(pre.next != null && pre.next.next != null) {
            ListNode a = pre.next;
            ListNode b = a.next;

            pre.next = b;
            a.next = b.next;
            b.next = a;
            pre = a;
        }

        return dummy.next;
    }
}
