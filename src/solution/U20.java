package solution;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class U20 {
    Map<Character,Character> map = new HashMap<>();

    public U20(){
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
    }

    public static void main(String[] args) {
        U20 u20 = new U20();
        u20.isValid("()");
    }

    public boolean isValid(String s) {
        Deque<Character> deque = new ArrayDeque();
        if (s.isEmpty()) return true;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                char k = deque.isEmpty() ? '#' : deque.pop();
                if (k != map.get(c)) return false;
            } else {
                deque.push(c);
            }
        }
        return deque.isEmpty();
    }
}
