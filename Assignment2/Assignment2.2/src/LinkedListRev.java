public class LinkedListRev {

    Node head;
    Node tail;

    public static void main(String[] args) {
        LinkedListRev l1 = new LinkedListRev();

        l1.addFirst(40);
        l1.add(20,1);
        l1.addAfter(30,1);
        l1.addBefore(50,1);
        l1.reverse(l1.head);
    }

    void reverse(Node node) {
        if (node == null) return;
        reverse(node.next);
        System.out.print(node.data + " ");
    }



    static class Node{
        int data;
        Node next;
        Node(int value){
            data=value;
            next=null;
        }

    }

    void addFirst(int value){
        Node newNode=new Node(value);
        newNode.next=head;
        head=newNode;
    }

    void add(int value,int pos){
        Node newNode=new Node(value);
        if(head==null) {
            head = newNode;
        }
        else if(pos<=1){
            newNode.next=head;
            head=newNode;
        }
        else {
            Node trav = head;
            for (int i = 1; i <pos-1 && trav.next!=null; i++) {
                trav=trav.next;
            }
            newNode.next=trav.next;
            trav.next=newNode;
        }
    }

    void addAfter(int value, int pos){
        Node node=new Node(value);
        if (head == null) {
            System.out.println("List is empty. Cannot add after position " + pos);
            return;
        }

        Node current = head;
        int count = 0;

        while (current != null && count < pos) {
            current = current.next;
            count++;
        }

        if (current == null) {
            System.out.println("Position " + pos + " is out of bounds.");
            return;
        }

        node.next = current.next;
        current.next = node;


    }

    void addBefore(int value, int pos){
        Node node=new Node(value);
        if (head == null) {
            System.out.println("List is empty. Cannot add after position " + pos);
            return;
        }

        Node current = head;
        int count = 0;


        while (current != null && count < pos - 1) {
            current = current.next;
            count++;
        }



        if (current == null) {
            System.out.println("Position " + pos + " is out of bounds.");
            return;
        }

        node.next = current.next;
        current.next = node;


    }


    public void display(){
        //1. create trav and start at first node
        Node trav = head;
        System.out.print(" List :: ");
        while(trav != null) {
            //2. print/visit current node (data)
            System.out.print("  " + trav.data);
            //3. move on nexxt node
            trav = trav.next;
        }//4. repeat above two steps till last node
        System.out.println("");
    }

}
