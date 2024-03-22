package LinkedList;

public class A_203_RemoveLinkedListElement {

    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1, head);

        ListNode previous = dummy;
        ListNode current = head;
        while(current != null) {
            if(current.val == val) {
                previous.next = current.next;
            } else {
                previous = previous.next;
            }
            current = current.next;
        }
        return dummy.next;
    }
}
