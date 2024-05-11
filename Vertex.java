import java.util.ArrayList;
public class Vertex {
    int number;
    int distance;
    int pi; //anterior
    int potitionInMinHeap;

    public Vertex(int number, int distance, int pi) {
        this.number = number;
        this.distance = distance;
        this.pi = pi;
        this.potitionInMinHeap = -1;
    }
    public String toString(){
        return number + "" + distance + "" + pi + "" + potitionInMinHeap;
    }
}
