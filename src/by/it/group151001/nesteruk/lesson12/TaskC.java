package by.it.group151001.nesteruk.lesson12;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class TaskC {
    public static List<List<Edge>> graph = new ArrayList<>();
    public static int[] dest;
    public static boolean[] visited;
    public static final int verch = 2;
    public static final int u = 1;

    public static class Edge {
        public int dest;
        public int cost;

        Edge (int dest, int cost) {
            this.dest = dest;
            this.cost = cost;
        }
    }

    public void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(new Edge(1, 1)); //A -> B
        graph.get(0).add(new Edge(4, 4)); //A -> E
        graph.get(0).add(new Edge(5, 8)); //A -> F

        graph.get(1).add(new Edge(5, 6)); //B -> F
        graph.get(1).add(new Edge(2, 2)); //B -> C

        graph.get(2).add(new Edge(6, 2)); //C -> G
        graph.get(2).add(new Edge(3, 1)); //C -> D

        graph.get(3).add(new Edge(6, 1)); //D -> G
        graph.get(3).add(new Edge(7, 4)); //D -> H

        graph.get(4).add(new Edge(5, 5)); //E -> F

        graph.get(6).add(new Edge(1, 6)); //G -> B
        graph.get(6).add(new Edge(5, 1)); //G -> F
        graph.get(6).add(new Edge(7, 1)); //G -> H

        getPath(verch);

        System.out.print("The smallest length of the cycle between " + (char)(u + 'A') + " and " + (char)(verch + 'A') + " = " + findTheShortestCycle());
    }

    public static void getPath(int start) {
        dest = new int[graph.size()];
        for (int i = 0; i < graph.size(); i++) {
            dest[i] = 100;
        }
        visited = new boolean[graph.size()];
        dest[start] = 0;

        PriorityQueue<Edge> H = new PriorityQueue<>(Comparator.comparingInt(p -> p.cost));

        H.offer(new Edge(start, 0));

        while (!H.isEmpty()) {
            Edge edge = H.poll();
            int curr = edge.dest;
            if (visited[curr])
                continue;

            visited[curr] = true;
            for (int i = 0; i < graph.get(curr).size(); i++) {
                int next = graph.get(curr).get(i).dest;
                int cost = graph.get(curr).get(i).cost;

                if (dest[next] > dest[curr] + cost) {
                    dest[next] = dest[curr] + cost;
                    H.offer(new Edge(next, dest[next]));
                }
            }
        }
    }
    public static int findTheShortestCycle() {
        int res = 0;
        for (int i = 0; i < graph.get(u).size(); i++)
            if (verch == graph.get(u).get(i).dest)
                res = graph.get(u).get(i).cost;
        return res + dest[u];
    }
}
