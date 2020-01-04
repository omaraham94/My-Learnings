
class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        head = null;
    }

    public void add(Node newNode) {
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head=newNode;
        }
    }
}

public class Test2 {

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.add(new Node(1));
        l1.add(new Node(2));
        l1.add(new Node(3));
        l1.add(new Node(4));
        l1.add(new Node(5));
        l1.add(new Node(6));
        printList(l1);
        Node reverseHead = reverseList(l1.head);
        printList(reverseHead);
    }

    public static Node reverseList(Node head) {
        if (head == null) {
            return null;
        }
        Node prev = head;
        Node next = head.next;
        if (next == null) {
            return prev;
        }
        Node revhead = reverseList(next);
        next.next = prev;
        prev.next = null;
        return revhead;
    }

    public static void printList(LinkedList l1) {
        Node temp = l1.head;
        while(temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
    public static void printList(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}
