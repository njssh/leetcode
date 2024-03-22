package LinkedList;

public class E_19_RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1, head);

        ListNode slow = dummy;
        ListNode fast = dummy;

        while(n > 0 && fast.next != null) {
            fast = fast.next;
            n --;
        }

        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }
}
