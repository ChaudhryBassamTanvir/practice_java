
import java.util.ArrayList;

public class StackUsingArrayList {
    static class Stack{
        private ArrayList<Integer> list = new ArrayList<>();
            
        //push
        public void push(int x){
                list.add(x);

            }

public int  pop(){
    if (list.isEmpty()) {
System.out.println("Stack is Empty");
return -1;
        
    }
    int top=list.get(list.size()-1);
    list.remove(list.size()-1);
    return top;

}
//peek
public int peek(){
    if (list.isEmpty()) {
        System.out.println("Stack is empty");
        return -1;
        
    }
    return list.get(list.size()-1);
}
  // Print stack
        public void printStack() {
            System.out.println(list);
        }

        }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
    s.printStack();
    
        System.out.println( s.pop());
        System.out.println(s.peek());
        s.printStack();
        s.push(4);
        System.out.println(s.peek());

    }
}
