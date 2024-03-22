package LinkedList;

public class C_206_ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if(head == null) {
            return head;
        }

        ListNode a = head;
        ListNode b = a.next;

        while(b != null) {
            ListNode curr = b.next;
            b.next = a;
            a = b;
            b = curr;
        }

        head.next = null;
        return a;
    }
}
