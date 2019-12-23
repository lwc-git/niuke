package solution;

public class U141 {
    public boolean hasCycle(ListNode head){
        ListNode v = head,t = head;
        while(t!=null){
            t = t.next;
            if(t==v) return true;
        }
        return false;
    }
}
