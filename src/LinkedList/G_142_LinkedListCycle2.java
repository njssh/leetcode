package LinkedList;

public class G_142_LinkedListCycle2 {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
            if(fast == null) {
                return null;
            }
            fast = fast.next;
            if(slow == fast) {
                fast = head;
                while(slow != fast) {
                    slow =  slow.next;
                    fast =  fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
