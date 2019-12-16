package com.informatika.umm.java;

public class Main {

    public static void main(String[] args) {
        AdjMatrixGraph theGraph = new AdjMatrixGraph();
        theGraph.addVertex('A');//0
        theGraph.addVertex('B');//1
        theGraph.addVertex('C');//2
        theGraph.addVertex('D');//3

        theGraph.addEdge(0, 1);
        theGraph.addEdge(1, 2);
        theGraph.addEdge(1, 3);

        System.out.print("Visits BFS : ");
        theGraph.BFS(); // breadth-first search
        System.out.println();
        System.out.print("Visits DFS : ");
        theGraph.BFS(); // depth-first search
        System.out.println();
    }
}
