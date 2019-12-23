package leetcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author lwc
 * @date 2019/12/9 14:27
 */
public class lc_314 {

    // This is the interface that allows for creating nested lists.
    // You should not implement it, or speculate about its implementation
    public interface NestedInteger {

        // @return true if this NestedInteger holds a single integer, rather than a nested list.
        public boolean isInteger();

        // @return the single integer that this NestedInteger holds, if it holds a single integer
        // Return null if this NestedInteger holds a nested list
        public Integer getInteger();

        // @return the nested list that this NestedInteger holds, if it holds a nested list
        // Return null if this NestedInteger holds a single integer
        public List<NestedInteger> getList();
    }



    class NestedIterator implements Iterator<Integer> {
        Iterator<Integer> item;

        public NestedIterator(List<NestedInteger> nestedList) {
            List<Integer> list = new ArrayList<>();
            help(nestedList, list);
            item = list.iterator();
        }

        public void help(List<NestedInteger> nestedList, List list){
            for(NestedInteger item : nestedList){
                if(item.isInteger()){
                    list.add(item.getInteger());
                }
                else{
                    help(item.getList(), list);
                }
            }
        }

        @Override
        public Integer next() {
            return item.next();
        }

        @Override
        public boolean hasNext() {
            return item.hasNext();
        }
    }
}
