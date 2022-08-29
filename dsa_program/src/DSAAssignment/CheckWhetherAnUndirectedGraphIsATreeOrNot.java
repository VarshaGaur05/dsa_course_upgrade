package DSAAssignment;
import java.util.*;

public class CheckWhetherAnUndirectedGraphIsATreeOrNot {
    private int vertexCount;
    private static LinkedList<Integer> adj[];

    CheckWhetherAnUndirectedGraphIsATreeOrNot(int vertexCount) {
        this.vertexCount = vertexCount;
        this.adj = new LinkedList[vertexCount];
        for (int i = 0; i < vertexCount; ++i) {
            adj[i] = new LinkedList<Integer>();
        }
    }

    public void addEdge(int v, int w) {
        if (!isValidIndex(v) || !isValidIndex(w)) {
            return;
        }
        adj[v].add(w);
        adj[w].add(v);
    }

    private boolean isValidIndex(int i) {
        // Write code here
        return true;
    }

    private boolean isCyclic(int v, boolean visited[], int parent) {
        // Write code here
        visited[v] = true;
        Integer i;
        Iterator<Integer> it = adj[v].iterator();
        while (it.hasNext())
        {
            i = it.next();
            if (!visited[i])
            {
                if (isCyclic(i, visited, v))
                    return true;
            }
            else if (i != parent)
                return true;
        }
        return false;

    }

    public boolean isTree() {
        // Write Code here
        boolean visited[] = new boolean[vertexCount];
        for (int i = 0; i < vertexCount; i++)
            visited[i] = false;

        if (isCyclic(0, visited, -1))
            return false;
        for (int u = 0; u < vertexCount; u++)
            if (!visited[u])
                return false;
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // Get the number of nodes from the input.
        int noOfNodes =  sc.nextInt();
        // Get the number of edges from the input.
        int noOfEdges = sc.nextInt();

        CheckWhetherAnUndirectedGraphIsATreeOrNot graph = new CheckWhetherAnUndirectedGraphIsATreeOrNot(noOfNodes);
        // Adding edges to the graph
        for (int i = 0; i <noOfEdges; ++i) {
            graph.addEdge(sc.nextInt(),sc.nextInt());
        }
        if (graph.isTree()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
/*
Check if an Undirected Graph is a Tree or Not
Description
Given a graph with N vertices. Check whether an undirected graph is a tree or not.

An undirected graph is tree if it has following properties.

There is no cycle.
The graph is connected.
Another way to understand this is to say that a tree is an undirected graph in which any two vertices are connected by exactly one path.



Input Format:

The first line contains an integer representing a number N as the number of vertices of the graph.

The second contains an integer n representing the number of edges in the graph.

Each next n line will have two space-separated integers, representing two vertices of each edge.

For example:

1 2 represents an edge from node 1 to node 2.



Output Format:

Print ‘Yes’ (without quotes and with capital letter ‘Y’) if the graph is a tree, otherwise ‘No’ (without quotes and with capital letter ‘N’).



Sample Test Cases:

Input:

15

4

11 10

10 12

10 13

13 14



Output:

No





Input:

6

5

1 0

0 2

0 3

3 4

4 5



Output:

Yes
 */
