package GraphAlgorithm;

import java.util.*;
public class AllPathsfromSourceToTargetNode {

    private int V;
    private static LinkedList<Integer> adj[];

    AllPathsfromSourceToTargetNode(int v)

    {

        V = v;

        adj = new LinkedList[v];

        for (int i=0; i<v; ++i)

            adj[i] = new LinkedList();

    }
    static void addEdge(int v,int w)

    {
        adj[v].add(w);
    }
    public int allPathsSourceTarget(LinkedList<Integer>[] adj2) {
        int n = adj2.length;

        boolean[] used = new boolean[n];

        List<List<Integer>> res = new ArrayList<>();

        dfs(res, new ArrayList<>(), adj2, used, 0);

        return res.size();

    }

    void dfs(List<List<Integer>> res, List<Integer> list, LinkedList<Integer>[] adj2, boolean[] used, int s) {

        used[s] = true;

        list.add(s);

        for (int i : adj2[s]) {

            if (used[i]) {

                continue;

            }
            if (i + 1 == used.length) {

                List<Integer> t = new ArrayList<>();

                t.addAll(list);

                t.add(i);

                res.add(t);

            } else {

                dfs(res, list, adj2, used, i);

                used[i] = false;

                list.remove(list.size() - 1);

            }

        }

    }
    public static void main(String args[] ) throws Exception {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT */

        Scanner sc= new Scanner(System.in);

        int n= 10;

        if(sc.hasNextInt()){

            n=sc.nextInt();

        }

        AllPathsfromSourceToTargetNode pp = new AllPathsfromSourceToTargetNode(n);

        for(int i=0 ; i<=n ; i++ ){

            String str =sc.nextLine();

            String val[] = str.split(" ");

            for(int j=0 ; j<val.length ; j++){

                if(val[j].length() != 0) {

                    int e = Integer.parseInt(val[j]);

                    if(e < 0) break;

                    pp.addEdge(i-1, e);

                }

            }
        }
        System.out.println(pp.allPathsSourceTarget(adj));

    }

}
/*
All Paths from Source to Target Node
Description
Given a directed acyclic graph (DAG) of n nodes labelled from 0 to n - 1, count all possible paths from node 0 to node n - 1, and return the number of paths.



The graph is given as follows: graph[i] is a list of all nodes you can visit from node i (i.e. , there is a directed edge from node i to node graph[i][j]).



Example:





Input:

If graph = [[1,2],[3],[3],[]], the input can be taken as follows:



first line: (number of nodes) 4

second line: (nodes you can visit from first node) 1 2

third line: (nodes you can visit from second node) 3

fourth line: (nodes you can visit from third node) 3

fifth line:( nodes you can visit from fourth node) -1



Note: input -1 implies no node can be visited from the given node.



Output: 2

Explanation: There are two paths: 0 -> 1 -> 3 and 0 -> 2 -> 3.
 */
