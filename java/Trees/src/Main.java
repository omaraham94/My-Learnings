import java.util.*;

public class Main {
    public static final Node NodeNull = new Node(-1);
    public static void main(String[] args) {
//        Deque<Integer> queue = new ArrayDeque<>();
//        queue.add(10);
//        queue.add(20);
//        queue.add(50);
//        queue.add(30);
//        queue.add(15);
//        while (!queue.isEmpty()) {
//            System.out.println(queue.peek());
//            queue.pop();
//        }
        Tree T = new Tree();
        T.insert(new Node(0));
        T.insert(new Node(1));
        T.insert(new Node(2));
        T.insert(new Node(3));
        T.insert(new Node(4));
        T.insert(new Node(5));
        T.insert(new Node(6));
        T.insert(new Node(7));
        T.insert(new Node(8));
        T.insert(new Node(9));
//        T.printTree(T.root);
        T.printLevelOrder(T.root);
        List<Node> path = new ArrayList<>();
        T.findPath(path, T.root, 7);
        for(Node node : path) {
            System.out.println(node.val);
        }
    }
}

class Node {
    int val;
    Node left;
    Node right;

    public Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class Tree {
    Node root;

    public Tree() {
        this.root = null;
    }

    void insert(Node node) {
        if (this.root == null) {
            this.root = node;
        } else {
            Deque<Node> queue = new ArrayDeque<>();
            queue.add(this.root);
            while(!queue.isEmpty()) {
                Node temp = queue.pop();
                if (temp.left == null) {
                    temp.left = node;
                    break;
                } else if (temp.right == null) {
                    temp.right = node;
                    break;
                } else {
                    queue.add(temp.left);
                    queue.add(temp.right);
                }
            }
        }
    }
//    void insertWrapper(Node root, Node newNode) {
//        if(root == null) {
//            return;
//        }
//        if (root.left == null) {
//            root.left = newNode;
//        } else if (root.right == null) {
//            root.right = newNode;
//        } else {
//            insertWrapper(root.left, newNode);
//            insertWrapper(root.right, newNode);
//        }
//    }
    void delete() {

    }

    void printTree(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.val);
        printTree(root.left);
        printTree(root.right);
    }

    void printLevelOrder(Node root) {
        if (root == null) {
            return;
        } else {
            Deque<Node> queue = new ArrayDeque<>();
            queue.add(root);
            System.out.println(root.val );
            System.out.println("========================");
            queue.add(Main.NodeNull);
            while(queue.size()!= 1) {
                Node temp = queue.pop();
                if (temp == Main.NodeNull) {
                    queue.add(Main.NodeNull);
                } else {
                    if (temp.left != null) {
                        queue.add(temp.left);
                        System.out.println(temp.left.val);
                    }
                    if (temp.right != null) {
                        queue.add(temp.right);
                        System.out.println(temp.right.val);
                    }
                }
            }
        }
    }
    Node findPath(List<Node> path, Node root, int val) {
        if (root == null) {
            return null;
        } else if (root.val == val) {
            path.add(root);
            return root;
        } else {
            Node left = findPath(path, root.left, val);
            Node right = findPath(path, root.right, val);
            if (left != null) {
                path.add(root);
                return left;
            } else if (right != null) {
                path.add(root);
                return right;
            } else {
                return null;
            }
        }
    }
}