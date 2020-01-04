package TreeTest;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;


class Tree {
    Node root;

    public Tree() {
        this.root = null;
    }

    public void insert (int val) {
        Node newNode = new Node(val);
        Queue<Node> q = new LinkedList<>();
        if (this.root == null ) {
            this.root = newNode;
        } else {
            q.add(this.root);
            while(!q.isEmpty()) {
                Node temp = q.remove();
                if (temp.left == null) {
                    temp.left = newNode;
                    break;
                } else if (temp.right == null) {
                    temp.right = newNode;
                    break;
                } else {
                    q.add(temp.left);
                    q.add(temp.right);
                }
            }
        }
    }

    public void printTreeInorder() {
        printTreeInordertest(this.root);
    }

    private void printTreeInordertest(Node root) {
        if (root == null) {
            return;
        } else {
            printTreeInordertest(root.left);
            System.out.println(root.val);
            printTreeInordertest(root.right);
        }
    }

    public void printTreeInorderIterative() {
        if(this.root == null) {
            return;
        }
        Stack<Node> s = new Stack<>();
        Node node = this.root;
        while(node != null) {
            s.add(node);
            node = node.left;
        }

        while(!s.isEmpty()) {

            node = s.pop();
            System.out.println(node);
            if (node.right != null) {
                node = node.right;
                while (node != null) {
                    s.push(node);
                    node = node.left;
                }
            }
        }
    }

    public void preOrderrecursive() {
        privatePreOrderrecursive(this.root);
    }

    private void privatePreOrderrecursive(Node root) {
        if(root == null) {
            return;
        }
        System.out.println(root);
        privatePreOrderrecursive(root.left);
        privatePreOrderrecursive(root.right);
    }

    public void preOrderIterative() {
        if(root == null) {
            return;
        }
        Stack<Node > s = new Stack<>();
        Node node = this.root;
        while(node!= null) {
            System.out.println(node);
            if (node.right != null) {
                s.push(node.right);
            }
            node = node.left;
        }

        while(!s.isEmpty()) {
            node = s.pop();
            while(node != null) {
                System.out.println(node);
                if (node.right != null) {
                    s.push(node.right);
                }
                node = node.left;
            }
        }
    }

//    public void preOrderIterative() {
//        if(root == null) {
//            return;
//        }
//
//        Stack<Node> s1 = new Stack<>();
//        Stack<Node> s2 = new Stack<>();
//        Node node = this.root;
//        while(node != null) {
//            s1.add(node);
//            s2.add(node);
//            node = node.left;
//        }
//        while(!s1.isEmpty()) {
//            node = s1.peek();
//            if(node.right != null) {
//                node = node.right;
//                s1.add(node);
//                s2.add(node);
//            } else {
//                System.out.println(s1.pop());
//                if (s1.peek().right == node) {
//                    System.out.println(s1.pop());
//                }
//                continue;
//            }
//            while(node.left != null) {
//                node = node.left;
//                s1.add(node);
//                s2.add(node);
//            }
//        }
////        while (!s2.isEmpty()) {
////            System.out.println(s2.pop());
////        }
//    }

    public void preOrderIterative2() {
        if (this.root == null) {
            return;
        }
        Stack<Node> s = new Stack<>();
        Node node = this.root;
        s.push(node);
        while(!s.isEmpty()) {
            node = s.pop();
            while(node != null) {
                System.out.println(node);
                if(node.right != null) {
                    s.push(node.right);
                }
                node = node.left;
            }
        }
    }

    public void postOrderIterative() {
        if (this.root == null) {
            return;
        }
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        Node node = this.root;
        s1.push(node);
        while(!s1.isEmpty()) {
            node = s1.pop();
            s2.push(node);
            if(node.left != null) {
                s1.push(node.left);
            }
            if(node.right != null) {
                s1.push(node.right);
            }
        }
        while(!s2.isEmpty()) {
            System.out.println(s2.pop());
        }
    }

    public void postOrderRecursive() {
        privatePostOrderRecursive(this.root);
    }

    private void privatePostOrderRecursive(Node root) {
        if (root == null) {
            return;
        }
        privatePostOrderRecursive(root.left);
        privatePostOrderRecursive(root.right);
        System.out.println(root);
    }

    public void printFun() {
        System.out.println("fun");
    }

    private class Node {
        int val;
        Node left;
        Node right;


        public Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }

        @Override
        public String toString() {
            postOrderIterative();
            return "Node{" +
                    "val=" + val +
                    '}';
        }
    }
}

public class TreeTest {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        tree.insert(60);
//        tree.insert(70);
//        tree.insert(80);
//        tree.insert(90);
//        tree.insert(100);
//        tree.insert(110);
//        tree.insert(120);
//        tree.insert(130);
//        tree.insert(140);
//        tree.insert(150);
//        tree.insert(160);
//        tree.insert(170);
//        tree.insert(180);
//        tree.insert(190);
//        tree.insert(200);
//        tree.insert(210);
//        tree.insert(220);
//        tree.insert(230);
//        tree.insert(240);
//        tree.insert(250);
//        tree.insert(260);
//        tree.insert(270);
//        tree.insert(280);
//        tree.insert(290);
//        tree.preOrderrecursive();
//        System.out.println();
//        System.out.println("===========================");
//        System.out.println();
//        tree.preOrderIterative2();
//        System.out.println("\n");
//        System.out.println("===========================");
//        System.out.println();
//        tree.preOrderIterative();
//        System.out.println("\n");
//        System.out.println("===========================");
//        System.out.println();
        tree.postOrderIterative();
        System.out.println("\n");
        System.out.println("===========================");
        System.out.println();
        tree.postOrderRecursive();
    }
}
