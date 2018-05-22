import java.util.Stack;

/*
将栈从顶到底由大到小排序，只允许额外申请一个栈
 */
public class SortStack {
    public static void sortStackByStack(Stack<Integer> stack){
        Stack<Integer> help = new Stack<>();
        while(!stack.isEmpty()){
            int cur = stack.pop();
            while(!help.isEmpty() && help.peek() < cur){
                stack.push(help.pop());
            }
            help.push(cur);
        }
        while(!help.isEmpty()){
            stack.push(help.pop());
        }
    }
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<10; i++){
            stack.push((int)(Math.random() * 100));
        }
        SortStack.sortStackByStack(stack);
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
