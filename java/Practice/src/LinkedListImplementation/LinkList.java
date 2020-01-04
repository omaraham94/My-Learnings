package LinkedListImplementation;

class Node {
    int val;
    Node next;
    Node prev;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }

    @Override
    public String toString() {
        return String.valueOf(this.val);
    }
}

public class LinkList {
    Node head;

    public LinkList() {
        this.head = null;
    }

    public void add(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        } else {
            newNode.next = head;
            head.prev = newNode;
            newNode.prev = null;
            head = newNode;
        }
    }

    public void printAll() {
        Node temp = head;
        while(temp != null) {
            System.out.println("The value is " + temp);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkList l = new LinkList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.printAll();
    }

}
