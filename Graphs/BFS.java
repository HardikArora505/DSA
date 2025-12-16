import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class BFS {
    // assuming 0 based graph
    private static ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new ArrayDeque<>();
        q.add(0);
        visited[0] = true;

        while (!q.isEmpty()) {
            int node = q.poll();
            bfs.add(node);
            for (int i : adj.get(node)) {
                if (visited[i] == false) {
                    visited[i] = true;
                    q.add(i);
                }
            }

        }

        return bfs;

    }
}