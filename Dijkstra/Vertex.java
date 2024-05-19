package Dijkstra;

public class Vertex {
    int number;
    int distance;
    int pi; //anterior
    int positionInMinHeap;

    public Vertex(int number, int distance, int pi) {
        this.number = number;
        this.distance = distance;
        this.pi = pi;
        this.positionInMinHeap = -1;
    }
    public String toString(){
        return number + "" + distance + "" + pi + "" + positionInMinHeap;
    }
}
