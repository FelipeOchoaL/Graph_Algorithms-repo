package BellmanFord;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------Bienvenido al programa de Bellman-Ford-------------------");
        System.out.println("_________________________________________________________________________________________________");
        System.out.println("Lista de ciudades con los numeros representando los vertices, en caso de correr el archivo de las ciudades: ");
        Graph g = new Graph();
        g.imprimirCiudades();
        int source=1;
        Graph G=BellmanFord.leerGrafo("C:\\Users\\felip\\Desktop\\Universidad\\Semestre 3\\Estructura de datos 2\\GraphAlgoritms\\Graph_Algorithms-repo\\graph1.txt", source);
        boolean result =  BellmanFord.BF(G,source);
        System.out.println("Datos para el source: --> " + source );
        System.out.println(" ");
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
