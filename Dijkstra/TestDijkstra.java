package Dijkstra;

public class TestDijkstra {
    public static void main(String [] args) {
        Graph g = new Graph();
        g.readGraph("C:\\Users\\felip\\Desktop\\Universidad\\Semestre 3\\Estructura de datos 2\\GraphAlgoritms\\Graph_Algorithms-repo\\ciudades.txt"); // Cambia "ciudades.txt" a "graph1.txt"
        g.initializeSingleSource(1);
        g.dijkstra(g, 1); // Llama al método dijkstra
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
