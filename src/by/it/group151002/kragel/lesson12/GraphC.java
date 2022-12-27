package by.it.group151002.kragel.lesson12;

import java.util.*;
public class GraphC {
        private List<List<Integer>> adj;
    public final static int INF = 65536;
    GraphC() {
        adj = new ArrayList<>();
    }
    GraphC(Integer count) {
        adj = new ArrayList<>();
        for(int i = 0; i < count; i++)
            AddVertex();
    }
    void AddVertex(){
        adj.add(new ArrayList<>());
        for (int i = 0; i < adj.size(); i++)
            for(int j = adj.get(i).size(); j <= adj.size(); j++)
                adj.get(i).add(INF);
    }
    void addOrientEdge(Integer v1, Integer v2, Integer weight) {
        if (v1 < adj.size() && v2 < adj.size())
            adj.get(v1).set(v2, weight);
    }
    int findMinCycle(Integer v1, Integer v2){
        if (adj.get(v1).get(v2) == INF)
            return -1;
        int[] dist = new int[adj.size()];
        boolean[] visited = new boolean[adj.size()];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[v2] = 0;
        while (true){
            int minDistIndex = -1, minDist = Integer.MAX_VALUE;
            for(int i = 0; i < adj.size(); i++){
                if(!visited[i] && dist[i] < minDist){
                    minDist = dist[i];
                    minDistIndex = i;
                }
            }
            if (minDistIndex == -1)
                break;
            for (int i = 0; i < adj.get(minDistIndex).size(); i++) {
                if (adj.get(minDistIndex).get(i) != INF && dist[i] > dist[minDistIndex] + adj.get(minDistIndex).get(i)) {
                    dist[i] = dist[minDistIndex] + adj.get(minDistIndex).get(i);
                }
            }
            visited[minDistIndex] = true;
        }
        return dist[v1] + adj.get(v1).get(v2);
    }
}
