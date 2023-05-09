/*
 Queue Data Structure 
 
 1). in the queue data structure the data always added at rear position.
 2). rear always remains rear it will not move and its initilized by 0;
 3). each and every data is inserted at the rear position, and remains elements shifted to the forward.
 4). before the added or insertion operation first check either queue is full or not



*/

class Queue{
private int a [];
private int front;
private int rear;
private int capacity;

// create constructor for Queue to assign values.
    Queue(int size){
        this.capacity = size;  // capacity is the size of the queue.
        a = new int [size];
        this.front = -1;  // jab queue kahli hoga tab hamara front -1 hoga.
        this.rear =0;  // rear ko hamesa se zero hi rakhenge taki wahi se data ko add kar sake

        System.out.println(size+ " Size Queue Created Successfully.");
    }

    boolean isEmpty(){

        if(front == -1){
           // System.out.println("isEmpty: true");
            return true;
        }
        else return false;

    }

    boolean isFull(){
        if(front == capacity-1){
          //  System.out.println("isFull: true");
            return true;
        }
        else return false;

    }

    
/*
        here size of the queue is 5 and two elements are added and rest 3 empty.

        [ 2 , 3 , - , - , - ]
         R    F
  
*/
    void add(int data){
        // this is push operation.. or Enqueue.
        if(isFull()){
            System.out.println("Queue is Full");
        }
        else{
           for(int i=front; i>=0; i--){
            a[i+1]=a[i];
           }
           a[rear]=data;
           front++;
           System.out.println(data+" added successfully");

        }

    }

    int remove(){
        if(!isEmpty()){
         int temp = a[front];
         System.out.println(temp +" Removed Successfully.");
         front--;
         return temp;
        }

        else{
            System.out.println("Queue is Empty.");
            return -1;

        }
    }
    int peek(){
        System.out.println(a[front]);
        return a[front];
    }

    void printQueue(){
        System.out.print("[ ");
        int i =0;
        // first print the elements of the queue.
        for(i =0; i<=front; i++){
            System.out.print(a[i]+", ");
        }
        // and again print rest of the empty space.
        for(   ; i<capacity; i++){
            System.out.print("-, ");
        }
        System.out.print("]");
        System.out.println();
    }



    
}
class QueueUsingArray{
    public static void main(String [] args ){
        Queue q = new Queue(4);
         q.printQueue();
      //  q.isEmpty();
      //  q.isFull();
        q.add(9);
        q.printQueue();
        q.add(3);
         q.printQueue();
        q.add(5);
         q.printQueue();
        q.add(8);
         q.printQueue();
        q.add(7);
         q.printQueue();
      //  q.peek();
        q.remove();
         q.printQueue();
        q.remove();
         q.printQueue();
        q.remove();
         q.printQueue();
        q.remove();
         q.printQueue();
        q.remove();
        

    }
}
