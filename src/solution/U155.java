package solution;

import java.util.Stack;

public class U155 {
    Stack<Integer> stack;
    int min;

    public U155(){
        stack = new Stack();
        min = Integer.MAX_VALUE;
    }

    public void push(int x){
        if(x<min){
            stack.push(min);
            min = x;
        }
        stack.push(x);
    }
    public void pop(){
        if(stack.pop()==min) min = stack.pop();
    }

    public int top(){
        return stack.peek();
    }

    public int getMin(){
        return min;
    }
}
