public class TestGraph {
    public static void main(String [] args) {
        Graph g = new Graph();
        g.readGraph("graph1.txt");
        g.initializeSingleSource(1);
        g.printGraph();
        g.printVertices();
    }
}
