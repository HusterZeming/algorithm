//两个栈实现队列
//两个栈一个入栈一个出栈，在第二个栈为空时将第一个栈的值全部压入第二个栈
package JZoffer;

import java.util.Stack;

public class JZ09 {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public JZ09() {

    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if(!stack2.isEmpty())
            return stack2.pop();
        else{
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            return stack2.isEmpty() ? -1 : stack2.pop();
        }
    }
}
