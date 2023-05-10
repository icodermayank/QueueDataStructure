 
// implementing queue usign java and linked list.

class Queue{
    
    // creating static member class to creating node of the queue
    static class Node{
        int data;
        Node next;
        
        
        // creating constructor to assign the defalut value and the value of the node.
        
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    // always create front and rear as static so that,
    // the rear and front will se single for all the nodes.
    
    static Node rear = new Node(-1);
    static Node front = new Node(-1);
    
    
    // create funtion is Empty to check either Queue is Empty or not.
    
    boolean isEmpty(){
        if(rear.next == null){
            System.out.println("Queue is Empty.");
            return true;
        }
        else{
            return false;
            
        }
    }
    
  //            rear <-- 4 <--5 <--6 <--front;
   // newnode 
    
    // create method add to Enqueue element in the queue.
    void add( int data){
        // create newnode to assign into the queue..
        
        Node newnode = new Node(data);
        
        // check if queue is empty or not.
        if(rear.next == null){
            rear.next = newnode;
            newnode.next = rear;
            front.next = newnode;
            System.out.println("Node added.");
        }
        else{
            // it mean that any node is present.
            
            rear.next.next = newnode;
            rear.next = newnode;
            newnode.next = rear;
            System.out.println("Node added");
        }
    }
    
    
    // method to print the Queue.
    
    void display(){
        if(front.next == null){
            System.out.println("[ ]");
        }
        else{
            Node pointer = front.next;
            System.out.print("[ ");
            while(pointer!=rear){
                System.out.print(pointer.data+", ");
                pointer=pointer.next;
            }
            System.out.print("]\n");
        }
    }
    
    // method to delete/ remove or dequeue from Queue 
    
    int remove(){
        if(front.next == null){
            System.out.println("Queue is Empty.");
            return -1;
        }
        // if only one element present in queue.
        
        else if(front.next.next == rear){
            int t = front.next.data;
            front.next = null; 
            rear.next = null;
            System.out.println(t+ " removed.");
            return t;
        }
        // if more than one element present in Queue.
        else{
            int t = front.next.data;
            front.next = front.next.next;
            System.out.println(t+ " removed.");
            
            return t;
        }
    }
    
}
class QueueUsingLinkedList{
    
    public static void main(String args []){
        
        // create Queue obj to create queue.
        Queue q = new Queue();
        q.isEmpty();
        
         q.add(5);
         q.add(2);
        q.display();
        q.remove();
        q.remove();
        q.isEmpty();
        
        
    }
}

