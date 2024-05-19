import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.PriorityQueue;
import java.util.Comparator;
public class Graph {
    // vertices
    Vertex[] V;
    // lista de adyacensia
    Edge[] adj;

    public void addEdge(int u, int v, int w) {//w para el peso
        Edge e = new Edge(v, w);
        e.next = adj[u];
        adj[u] = e;
    }

    public void initializeSingleSource( int s) {
        for (int i = 1; i < V.length; i++) {
            V[i] = new Vertex(i, Integer.MAX_VALUE, -1);
        }
        V[s].distance = 0;
    }

    public boolean relax(int u, int v, int w) {
        if (V[v].distance > V[u].distance + w) {
            V[v].distance = V[u].distance + w;
            V[v].pi = u;
            return true;
        }
        return false;
    }

    public void readGraph(String fileName) {
        try {
            Scanner sc = new Scanner(new File(fileName));
            int n = sc.nextInt();
            int m = sc.nextInt();

            this.V = new Vertex[n + 1];
            this.adj = new Edge[n + 1];
            for (int i = 0; i < m; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                int w = sc.nextInt();
                addEdge(u, v, w);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void printGraph() {
        for (int i = 1; i < adj.length; i++) {
            System.out.print(i + ": ");
            Edge e = adj[i];
            while (e != null) {
                System.out.print(e.v + " " + e.w + "; ");
                e = e.next;
            }
            System.out.println();
        }
    }

    public void printVertices() {
        for (int i = 1; i < V.length; i++) {
            System.out.println(V[i]);
        }
    }

    public void dijkstra(Graph g, int s) {
        initializeSingleSource( s);
        PriorityQueue<Vertex> Q = new PriorityQueue<>(new Comparator<Vertex>() {
            @Override
            public int compare(Vertex v1, Vertex v2) {
                return v1.distance - v2.distance;
            }
        });

        for (Vertex v : g.V) {
            if (v != null) {
                Q.add(v);
            }
        }

        while (!Q.isEmpty()) {
            Vertex u = Q.poll();
            Edge e = g.adj[u.number];
            while (e != null) {
                if (relax(u.number, e.v, e.w)) {
                    Q.remove(g.V[e.v]);
                    Q.add(g.V[e.v]);
                }
                e = e.next;
            }
        }
    }
    public void printShortestPaths(int s) {
        for (int i = 1; i < V.length; i++) {
            if (i != s) {
                System.out.print("camino hacia el vertice  " + i + ": ");
                printPath(s, i);
                System.out.println();
            }
        }
    }

    private void printPath(int s, int v) {
        if (v == s) {
            System.out.print(s + " ");
        } else if (V[v].pi == -1) {
            System.out.print("No path from " + s + " to " + v + " exists");
        } else {
            printPath(s, V[v].pi);
            System.out.print(v + " ");
        }
    }
}
