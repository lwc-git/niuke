package solution;

public class U206 {
    public ListNode reverseList(ListNode head) {
        return reverse(head,null);
    }

    public ListNode reverse(ListNode head,ListNode newHead){
        if(head==null) return newHead;
        ListNode next = head.next;
        head.next = newHead;
        return reverse(next,head);
    }
}
