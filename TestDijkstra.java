public class TestDijkstra {
    public static void main(String [] args) {
        Graph g = new Graph();
        g.readGraph("ciudades.txt"); // Cambia "ciudades.txt" a "graph1.txt"
        g.initializeSingleSource(1);
        g.dijkstra(g, 1); // Llama al método dijkstra
        g.printShortestPaths(1);
        g.printGraph();
        g.printVertices();
    }
}
