package leetcode;

import java.util.HashMap;

/**
 * @author lwc
 * @date 2019/12/17 10:11
 */
public class lc_146 {

    class LRUCache {
        class ListNode{
            int key;
            int val;
            ListNode pre;
            ListNode next;
            ListNode(int key, int val){
                this.key = key;
                this.val = val;
            }
        }

        int size;
        ListNode head;
        ListNode tail;
        HashMap<Integer,ListNode> cache;
        public LRUCache(int capacity) {
            head = new ListNode(-1, -1);
            tail = new ListNode(-1, -1);
            head.next = tail;
            tail.pre = head;
            size = capacity;
            cache = new HashMap<>();
        }

        public int get(int key) {
            ListNode cur = cache.get(key);
            if(cur == null) return -1;
            remove(cur);
            insert(cur);
            return cur.val;
        }

        public void put(int key, int value) {
            ListNode cur = cache.get(key);
            if(cur != null) {
                get(key);
                cur.val = value;
            }
            else{
                cur = new ListNode(key, value);
                if(cache.size() == size){
                    ListNode node = head.next;
                    remove(node);
                    cache.remove(node.key);
                }
                insert(cur);
                cache.put(key, cur);
            }
        }


        void insert(ListNode cur){
            ListNode pre = tail.pre;
            pre.next = cur;
            cur.pre = pre;
            cur.next = tail;
            tail.pre = cur;
        }
        void remove(ListNode node){
            ListNode pre = node.pre;
            ListNode next = node.next;
            pre.next = next;
            next.pre = pre;
        }
    }
}
