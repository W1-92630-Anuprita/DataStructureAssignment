public class DeQueue {

    static class  Node{

        Node next;
        Node prev;
        int data;

        Node(int data)
        {
            this.data=data;
            this.next=null;
            this.prev=null;

        }

    }

    Node head=null;
    Node tail=null;

    void addFront(Node n){
        if(head==null){
            head=n;
            tail=n;
        }
        else{
                n.next=head;
                head.prev=n;
                head=n;

        }

    }

    void addRear(Node n){
        if(head==null){
            head=n;
            tail=n;
        }
        else{
            n.prev=tail;
            tail.next=n;
            tail=n;

        }

    }

    int popFirst(){
        if(head==null){
            System.out.println("no elements in dequeue");
            return -1;
        }
        else{

            int val=head.data;
            if(head.next==null) {
                head=null;
                tail=null;
            }
            else {

                head = head.next;
                head.prev = null;
            }
            return val;

        }
    }

    int popLast(){
        if(head==null){
            System.out.println("no elements in dequeue");
            return -1;
        }
        else{

            int val=tail.data;
            if(head.next==null) {
                head=null;
                tail=null;
            }
            else {

                tail = tail.prev;
                tail.next = null;
            }
            return val;

        }
    }


    void display() {
        if (head == null) {
            System.out.println("Deque is empty.");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }





    public static void main(String[] args) {
        DeQueue deque = new DeQueue();
        System.out.println("Adding to the front:");
        deque.addFront(new Node(10));

        System.out.println("Adding to the rear:");
        deque.addRear(new Node(20));
        deque.display();


        System.out.println("\nPopping from the rear:");
        int poppedLast = deque.popLast();
        System.out.println("Popped value: " + poppedLast);
        deque.display();

        System.out.println("\nPopping from the front:");
        int poppedFirst = deque.popFirst();
        System.out.println("Popped value: " + poppedFirst); 
        deque.display();
    }



}

