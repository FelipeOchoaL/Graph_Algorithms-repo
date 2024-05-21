package BellmanFord;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------Bienvenido al programa de Bellman-Ford-------------------");
        System.out.println("_________________________________________________________________________________________________");
        System.out.println("Lista de ciudades con los numeros representando los vertices, en caso de correr el archivo de las ciudades: ");
        Graph g = new Graph();
        g.imprimirCiudades();
        int source=1;
        Graph G=BellmanFord.leerGrafo("C:\\Users\\felip\\Desktop\\Universidad\\Semestre 3\\Estructura de datos 2\\GraphAlgoritms\\Graph_Algorithms-repo\\BellmanFord\\graphNew.txt", source);
        long startTime = System.nanoTime();
        boolean result =  BellmanFord.BellmanFo(G,source);
        long endTime = System.nanoTime();

        double duration = (endTime - startTime) / 1_000_000_000.0;  // Tiempo de ejecución en segundos
        System.out.printf("Tiempo de ejecución de Bellman-Ford: %.6f segundos%n", duration);
        System.out.println("Datos para el source: --> " + source );
        System.out.println(" ");
        BellmanFord.printShortestPaths(G,source);
        if(result)
        {
            System.out.println("No tiene ciclos negativos");
        }
        else
        {
            System.out.println("Si tiene al menos un ciclo negativo");
        }
        System.out.println("_____________________________");
        G.printVertices();


    }
}
