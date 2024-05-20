//bellmanford
package BellmanFord;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class BellmanFord {
    //Relax
    public static void Relax(Edge e)
    {
        Vertex u= e.u;
        Vertex v= e.v;
        int w= e.w;
        if(v.d>u.d+w)
        {
            v.d=e.u.d+w;
            v.pi=u;
        }
    }
    //Bellman Ford implementación
    public static boolean BellmanFo(Graph G, int s)
    {
        for(int i=1; i<=G.Vsize;i++)
        {
            for (int a=0;a<G.Esize;a++)
            {
                Relax(G.E[a]);
            }
        }
        for(int i=0; i<G.Esize;i++)
        {
            Vertex v= G.E[i].v;
            Vertex u= G.E[i].u;
            int w= G.E[i].w;

            if (v.d>u.d+w)
            {
                return false;
            }
        }
        return true;
    }
    public static void printShortestPaths(Graph G, int s) {
        for (int i = 1; i <= G.Vsize; i++) {
            if (i != s) {
                System.out.print("Path from " + s + " to " + i + ": ");
                printPath(G.V[i]);
                System.out.println();
            }
        }
    }

    private static void printPath(Vertex v) {
        if (v.pi != null) {
            printPath(v.pi);
        }
        System.out.print(v.index + " ");
    }
    public static Vertex EncontrarVertice(int u, Vertex[] V)
    {
        for (int i=0; i< V.length; i++)
        {
            if(V[i].index==u)
            {
                return V[i];
            }
        }
        return null;
    }

    //LeerGrafo
    public static Graph leerGrafo(String archivo,int s)
    {
        try {
            Scanner sc = new Scanner(new File(archivo));
            int Vsize = sc.nextInt();
            int Esize = sc.nextInt();

            //Creamos los vertices
            Vertex[] V= new Vertex[Vsize];
            for (int i=1; i<=Vsize;i++)
            {
                int d;
                if (i==s)
                {
                    d=0; //Distancia del source es 0
                }
                else
                {
                    d=999999999;
                }
                Vertex v= new Vertex(i,d,null);
                V[i-1]=v;
            }

            //Creamos los enlaces
            Edge[] E= new Edge[Esize];
            for (int i=0; i<Esize;i++)
            {
                int u1=sc.nextInt();
                Vertex u= EncontrarVertice(u1,V);
                int v1= sc.nextInt();
                Vertex v= EncontrarVertice(v1,V);
                int w=sc.nextInt();
                E[i]=new Edge(u,v,w);
            }

            //Creamos el grafo
            Graph G= new Graph(Vsize,Esize, V,E);

            return G;
        } catch (FileNotFoundException e) {
            System.out.println("No hay archivo");
        }
        return null;
    }

}
