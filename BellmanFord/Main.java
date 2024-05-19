package BellmanFord;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("_________________________________________________________________________________________________");
        int source=1;
        Graph G=BellmanFord.leerGrafo("C:\\Users\\felip\\Desktop\\Universidad\\Semestre 3\\Estructura de datos 2\\GraphAlgoritms\\Graph_Algorithms-repo\\graph1.txt", source);
        boolean result =  BellmanFord.BF(G,source);
        System.out.println("Para el source " + source +"\n");
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
