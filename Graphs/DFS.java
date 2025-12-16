import java.util.ArrayList;

public class DFS {
    public static ArrayList<Integer> dfsOnGraph(int V,ArrayList<ArrayList<Integer>>adj ){
        ArrayList<Integer> ans=new ArrayList<>();
        boolean[] visited=new boolean[V];
        dfs(visited,ans,adj,0);
        return ans;

    }
    public static void dfs(boolean[] visited, ArrayList<Integer>ans, ArrayList<ArrayList<Integer>>adj, int currNode){
        ans.add(currNode);
        visited[currNode]=true;
        for(int i:adj.get(currNode)){
            if(!visited[i]){
                dfs(visited, ans, adj, i);
            }
        }

    }
}
