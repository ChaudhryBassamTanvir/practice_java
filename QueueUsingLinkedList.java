
   class Node{
        int data;
        Node next;

        public Node(int data) {
        this.data=data;
        this.next=null;
        }
    }
    class myQueue{
    private Node front;
        private Node rear;

        public myQueue() {
        this.front=null;
        this.rear=null;
        }  
         // Add element to the end
      public void enqueue(int data){
        Node newNode = new Node(data);
        if (rear==null) {
         front = rear=newNode;   
        }else{
            rear.next=newNode;
            rear= newNode;
        }
         System.out.println(data + " enqueued to the queue");
    }
        // Remove element from the front
        public int dequeue(){
            if (front==null) {
                System.out.println("Queue is empty");
            }
            int data= front.data;
            front = front.next;
            if (front==null) {
                rear = null;
                System.out.println("Queue becomes empty");
                
            }
            return data;

        } 
            // Get the front element without removing it
        public int peek(){
            if (front==null) {
                System.out.println("Queue is empty");
                return -1;

            }
            return front.data;

        }
            // Check if queue is empty
        public boolean isEmpty(){
            if(front==null) {
                return true;
            }
            return false;
        }
         // Print all elements
         public void printQueue(){
            Node tempNode = front;
            System.out.print("Queue: ");
            while (tempNode!=null) {
                System.out.print(tempNode.data+" ");
         tempNode = tempNode.next;
            }
        }

      }

public class QueueUsingLinkedList {
 
    public static void main(String[] args) {
        myQueue queue = new myQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.printQueue();

        System.out.println("Dequeued: " + queue.dequeue());
        queue.printQueue();

        System.out.println("Front element: " + queue.peek());
        System.out.println("Is queue empty? " + queue.isEmpty());
       
    }
}
