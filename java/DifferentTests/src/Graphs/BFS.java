package Graphs;

import java.util.ArrayList;
import java.util.List;

class Node {
    int val;
    boolean visited;

    public Node(int val, boolean visited) {
        this.val = val;
        this.visited = visited;
    }
}

class Row{

}

class Graph {
    List<List<Node>> g = new ArrayList<>();

    public void addEdge(int row, int newVal) {
        Node newNode = new Node(newVal, false);
        g.get(row).add(newNode);
    }
}

public class BFS {
    int start;

    public BFS(int start) {
        this.start = start;
    }
}
