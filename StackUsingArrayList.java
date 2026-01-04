
import java.util.ArrayList;

public class StackUsingArrayList {
    static class Stack{
        private ArrayList<Integer> list = new ArrayList<>();
            
        //push
        public void push(int x){
                list.add(x);

            }

public int  pop(){
    if (isEmpty()) {
System.out.println("Stack is Empty");
return -1;
        
    }
    int top=list.get(list.size()-1);
    list.remove(list.size()-1);
    return top;

}
//peek
public int peek(){
    if (isEmpty()) {
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
        


    }
}
