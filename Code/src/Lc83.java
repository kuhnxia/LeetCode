public class Lc83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        if (node == null)
            return head;
        while (node.next != null) {
            if (node.next.val == node.val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        return head;
    }
}
