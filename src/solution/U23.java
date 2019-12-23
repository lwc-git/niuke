package solution;

public class U23 {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode rs = null;
        for (int i = 0; i < lists.length; i++) {
            rs = mergeTwoList(rs, lists[i]);
        }
        return rs;
    }

    public ListNode mergeTwoList(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val <= l2.val) {
            l1.next = mergeTwoList(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoList(l1, l2.next);
            return l2;
        }
    }
}
