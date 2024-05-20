package Dijkstra;

public class TestDijkstra {
    public static void main(String [] args) {
        Graph g = new Graph();
        g.readGraph("C:\\Users\\felip\\Desktop\\Universidad\\Semestre 3\\Estructura de datos 2\\GraphAlgoritms\\Graph_Algorithms-repo\\ciudades.txt"); // "graph1.txt"
        g.initializeSingleSource(1);
        long startTime = System.nanoTime();
        g.dijkstra(g, 1); // Llama al método dijkstra
        long endTime = System.nanoTime();

        double duration = (endTime - startTime) / 1_000_000_000.0;  // Tiempo de ejecución en segundos
        System.out.println("Tiempo de ejecución de Dijkstra: " + duration + " segundos");
        System.out.println("--------------Bienvenido a Dijkstra´s Algorithm ------------");
        System.out.println("Lista de ciudades con los numeros representando los vertices, en caso de correr el archivo de las ciudades: ");
        g.imprimirCiudades();
        System.out.println("__________________________________________________________");
        g.printShortestPaths(1);
        System.out.println("__________________________________________________________");
        System.out.println("Grafo, Lista de adyacencia:  ");
        System.out.println("__________________________________________________________");
        g.printGraph();
        System.out.println("__________________________________________________________");
        //g.printVertices();
    }
}
