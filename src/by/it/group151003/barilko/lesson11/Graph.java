package by.it.group151003.barilko.lesson11;

import java.util.*;

public class Graph {
    public Vector<Vector<Integer>> graph;
    public int vertexCount;
    public char[] vertexNames;

    public Graph(int count) {
        vertexCount = count;
        graph = new Vector<>();
        for (int i = 0; i < vertexCount; i++) {
            graph.add(new Vector<>());
        }
        vertexNames = new char[vertexCount];
    }

    void setName(int index, char name) {
        vertexNames[index] = name;
    }

    char getName(int index) {
        return vertexNames[index];
    }

    void addEdge(int a, int b) {
        graph.get(a).add(b);
        graph.get(b).add(a);
    }

    void addOrientedEdge(int a, int b) {
        graph.get(a).add(b);
    }

    int getVertexCount() {
        return vertexCount;
    }

    int[] getNeighbors(int vertex) {
        int[] neighbors = new int[graph.get(vertex).size()];
        int i = 0;
        for (int n : graph.get(vertex))
            neighbors[i++] = n;
        Arrays.sort(neighbors);
        return neighbors;
    }
}
