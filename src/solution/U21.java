package solution;

public class U21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode rs = new ListNode(0);
        ListNode q1=l1,q2=l2,curr=rs;

        while(q1!=null||q2!=null) {
            if(q1!=null&&q2==null){
                while(q1!=null){
                    curr.next = new ListNode(q1.val);
                    curr = curr.next;
                    q1=q1.next;
                }
            }
            if(q2!=null&&q1==null){
                while(q2!=null){
                    curr.next = new ListNode(q2.val);
                    curr = curr.next;
                    q2=q2.next;
                }
            }

            while(q1!=null&&q2!=null&&q1.val<=q2.val){
                curr.next = new ListNode(q1.val);
                curr = curr.next;
                q1 = q1.next;
            }

            while (q1!=null && q2!=null &&q2.val <= q1.val) {
                curr.next = new ListNode(q2.val);
                curr = curr.next;
                q2 = q2.next;
            }
        }
        return rs.next;
    }
}
