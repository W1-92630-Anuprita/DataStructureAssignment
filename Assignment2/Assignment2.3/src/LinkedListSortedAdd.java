public class LinkedListSortedAdd {

    Node head;
    Node tail;

    public static void main(String[] args) {
        LinkedListSortedAdd l1 = new LinkedListSortedAdd();

        l1.insertSorted(40);
        l1.insertSorted(20);
        l1.insertSorted(30);
        l1.insertSorted(50);
        l1.display();
    }
    public void insertSorted(int value) {
        Node newNode = new Node(value);
        if (head == null || value < head.data) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data < value) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }







    static class Node{
        int data;
        Node next;
        Node(int value){
            data=value;
            next=null;
        }

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
