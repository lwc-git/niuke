package solution;

import java.util.ArrayList;

public class U208 {

    ArrayList<String> trie;
    /** Initialize your data structure here. */
    public U208() {
        trie = new ArrayList<>();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        trie.add(word);
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        return trie.contains(word);
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        int length = prefix.length();
        for(int i = 0;i<trie.size();i++){
            if(trie.get(i).length()>=length && trie.get(i).substring(0,length).equals(prefix))
                return true;
        }
        return false;
    }
}
