import java.util.Stack;

/*
题目：用递归实现栈的逆序，并不能用其他数据结构。
 */
public class ReverseStack {
    public static int getAndRemoveLastElement(Stack<Integer> stack){
        int result = stack.pop();
        if(stack.isEmpty()){
            return result;
        }
        else{
            int last = getAndRemoveLastElement(stack);
            stack.push(result);
            return last;
        }
    }

    public static void reverse(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int i = getAndRemoveLastElement(stack);
        reverse(stack);
        stack.push(i);
    }

    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<5; i++){
            stack.push(i);
        }
        ReverseStack.reverse(stack);
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
