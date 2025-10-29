package queue;


public class Queue {

    private int front;
    private int rear;
    private int size;
    private int arr[];
    public Queue(int size) {
        this.size=size;
        arr=new int[size];
        front =0;
        rear=0;
    }

    void push(int data){
        if(isFull()){
            System.out.println("Queue is already full");
        }
        else {
            arr[rear] = data;
            rear++;
        }
    }
    int pop(){
        if(isEmpty()) {
            return -10122;
        }else {
            return arr[front++];
        }
    }

    int peek(){
        if(!isEmpty()) {

            return arr[front] ;

        }
        else{
            return -10122;
        }
    }

    boolean isEmpty(){
        return (this.rear==this.front);
    }

    boolean isFull(){
        return (this.rear==size);
    }
}
