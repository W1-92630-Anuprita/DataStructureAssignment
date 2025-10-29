package stack;


// -10122 is the value retunred when array is empty as -1 can be element of array

public class Stack {

    private int top;
    private int size;
    private int arr[];
    public Stack(int size) {
        this.size=size;
        arr=new int[size];
        top=size;
    }

    void push(int data){
        if(isFull()){
            System.out.println("Stack is already full");
        }
        else {
            arr[--top] = data;
//            top++;
        }
    }
    int pop(){

        if (isEmpty()) {
            return -10122;
        } else {
            return arr[top++];
        }


    }

    int peek(){
        if(!isEmpty()) {
            return arr[top];
        }
        else{
            return -10122;
        }
    }

    boolean isEmpty(){
        return (this.top==size);
    }

    boolean isFull(){
        return (this.top==0);
    }
}
