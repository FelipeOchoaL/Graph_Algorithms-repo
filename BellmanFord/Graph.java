package BellmanFord;

public class Graph {

    public int Vsize;
    public int Esize;

    public Vertex[] V;
    public  Edge[] E;

    public Graph(int Vsize, int Esize, Vertex[]V, Edge[]E)
    {
        this.Vsize= Vsize;
        this.Esize=Esize;
        this.V=V;
        this.E=E;
    }
    public Graph(){

    }
    public void imprimirCiudades() {
        String[] ciudades = {
                "Medellin", "Bello", "Tunja", "Quibdo", "Manizales",
                "Yopal", "San martin", "Ocaña", "Bucaramanga", "Ibague",
                "Cali", "Neiva", "Popayan", "Monteria", "Mitú"
        };

        System.out.println("Ciudades:");
        for (int i = 0; i < ciudades.length; i++) {
            System.out.println((i + 1) + ". " + ciudades[i]);
        }
    }

    public void printVertices()
    {
        for (int i=0; i<this.Vsize; i++)
        {

            int d;
            Vertex v= this.V[i];
            if(v.d==Integer.MAX_VALUE)
            {
                d= -1;
            }
            else
            {
                d= v.d;
            }

            if(v.pi!=null)
            {
                System.out.println("vertice: "+ v.index + " ________  distancia: " + d+ " ______  pi(anterior): "+ v.pi.index);
            }
            else
            {
                System.out.println("vertice: "+ v.index + " ________  distancia:  " + d+ " ______  pi(anterior): "+ null);
            }


        }
    }
}
