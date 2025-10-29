
public class CircularLinkedList {
    Node tail = null;

    public static void main(String[] args) {
        CircularLinkedList cll=new CircularLinkedList();

        cll.insertEnd(10);
        cll.insertEnd(20);
        cll.insertEnd(30);
        cll.insertBeginning(5);
        cll.delAtPosition(2);
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

    public void addAtPosition(int value, int pos) {
        Node newNode = new Node(value);

        if (pos <= 0 || tail == null) {
            if (tail == null) {
                tail = newNode;
                tail.next = tail;
            } else {
                newNode.next = tail.next;
                tail.next = newNode;
            }
            return;
        }

        Node current = tail.next;
        int count = 0;

        while (count < pos - 1 && current != tail) {
            current = current.next;
            count++;
        }

        newNode.next = current.next;
        current.next = newNode;

        if (current == tail || count < pos - 1) {
            tail = newNode;
        }
    }

    public void delAtPosition(int pos) {
        if (tail == null || pos < 0) return;

        if (tail.next == tail && pos == 0) {
            tail = null;
            return;
        }

        if (pos == 0) {
            tail.next = tail.next.next;
            return;
        }

        Node current = tail.next;
        int count = 0;

        while (count < pos - 1 && current.next != tail.next) {
            current = current.next;
            count++;
        }

        if (current.next == tail.next || current.next == null) return;

        if (current.next == tail) {
            current.next = tail.next;
            tail = current;
        } else {
            current.next = current.next.next;
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