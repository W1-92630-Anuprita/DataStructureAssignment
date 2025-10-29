
public class CircularLinkedList {
    Node tail = null;

    public static void main(String[] args) {
        CircularLinkedList cll=new CircularLinkedList();

        cll.insertEnd(10);
        cll.insertEnd(20);
        cll.insertEnd(30);
        cll.insertBeginning(5);
        cll.display();

    }
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }



    public void insertEnd(int value) {
        Node newNode = new Node(value);
        if (tail == null) {
            tail = newNode;
            tail.next = tail;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void insertBeginning(int value) {
        Node newNode = new Node(value);
        if (tail == null) {
            tail = newNode;
            tail.next = tail;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
        }
    }

    public void deleteBeginning() {
        if (tail == null) return;
        if (tail.next == tail) {
            tail = null;
        } else {
            tail.next = tail.next.next;
        }
    }

    public void deleteEnd() {
        if (tail == null) return;
        if (tail.next == tail) {
            tail = null;
        } else {
            Node current = tail.next;
            while (current.next != tail) {
                current = current.next;
            }
            current.next = tail.next;
            tail = current;
        }
    }

    public void display() {
        if (tail == null) return;
        Node current = tail.next;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != tail.next);
        System.out.println();
    }
}