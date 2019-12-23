package solution;

import java.util.HashMap;
import java.util.Map;

public class U19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode current = head;
        ListNode rs;
        Map<Integer, ListNode> map = new HashMap<Integer, ListNode>();
        int i = 1;
        while (current != null) {
            map.put(i, current);
            i = i + 1;
            current = current.next;
        }
        if (i - 1 == 0) rs = null;
        else if (i - 1 == n) rs = map.get(2);
        else{
            current = map.get(i - 1 - n);
            current.next = current.next.next;
            rs = head;
        }
        return rs;
    }
}
