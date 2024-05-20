# Este es el trabajo final de estructuras de datos y algoritmos 2  <br>
### Hecho por Felipe Ochoa y David Ramirez <br>
En este le daremos solucion a diferentes algoritmos de grafos como: <br>
Los temas a tratar en este proyecto
- **Bellman Ford** <br>
- **Dijkstra** <br>
Lenguaje: Java <br>
IDE: INTELLIJ IDEA 2023.3.3 <br>
SDK: Java 17 <br>
El trabajo constara de dos documentos los cuales van a tener los algoritmos por separado <br>
los cuales le daran solucion a dos grafos diferentes, uno que adjuntaremos con datos y otro con los datos de las ciudades. <br>
# Dijkstra
La explicacion de lo que contiene Dijkstra: <br>

## Clases

1. **Clase Vertex**: Esta clase representa un vértice en el grafo. Cada vértice tiene un número (que actúa como su identificador), <br>
una distancia (que se utiliza para almacenar la distancia más corta desde el vértice de origen a este vértice) y un `pi` (que se utiliza <br>
para almacenar el vértice anterior en el camino más corto desde el vértice de origen a este vértice).

2. **Clase Edge**: Esta clase representa una arista en el grafo. Cada arista tiene un vértice de destino `v`, un peso `w` y una referencia <br>
`next` a la siguiente arista en la lista de adyacencia.

3. **Clase Graph**: Esta clase representa un grafo. El grafo tiene un array de vértices `V` y un array de listas de adyacencia `adj`.

   - **Método addEdge(u, v, w)**: Este método agrega una arista al grafo. La arista va del vértice `u` al vértice `v` y tiene un peso `w`.

   - **Método initializeSingleSource(s)**: Este método inicializa la distancia de todos los vértices a `Integer.MAX_VALUE` (infinito) y establece <br>
      la distancia del vértice de origen `s` a 0.

   - **Método relax(u, v, w)**: Este método actualiza la distancia del vértice `v` si encuentra un camino más corto a través del vértice `u` con peso `w`.

   - **Método readGraph(fileName)**: Este método lee el grafo desde un archivo. El archivo debe contener el número de vértices y aristas en las primeras <br>
      dos líneas, seguido por las aristas en las siguientes líneas. Cada arista debe estar en una línea separada y debe contener el vértice de origen, el <br>
      vértice de destino y el peso, separados por espacios.

   - **Método printGraph() y printVertices()**: Estos métodos imprimen el grafo y los vértices, respectivamente.

   - **Método dijkstra(g, s)**: Este es el método principal que implementa el algoritmo de Dijkstra. Este método toma un grafo `g` y un vértice de origen `s`, <br>
      y calcula la distancia más corta desde `s` a todos los demás vértices en `g`.

   - **Método printShortestPaths(s)**: Este método imprime el camino más corto desde el vértice de origen `s` a todos los demás vértices en el grafo.

4. **Clase TestDijkstra**: Esta clase contiene el método `main` que se utiliza para probar el algoritmo de Dijkstra. En este método, se crea un nuevo grafo, <br>
   se lee desde un archivo, se inicializa la fuente, se ejecuta el algoritmo de Dijkstra y se imprimen los caminos más cortos.

La explicacion de lo que contiene BellmanFord: <br>
# BellmanFord

## Pseudo codigo
![Pseudo código Bellman-Ford]([https://github.com/tu_usuario/tu_repositorio/raw/main/assets/Bellman-Ford.png](https://github.com/FelipeOchoaL/Graph_Algorithms-repo/blob/main/Pseudo%20codigo%20Bellman-Ford.png?raw=true))


El paquete `BellmanFord` contiene una implementación del algoritmo de Bellman-Ford, que es un algoritmo de grafos que encuentra el camino más corto desde un vértice de origen a todos los demás vértices en un grafo ponderado. Este algoritmo es capaz de manejar grafos con aristas de peso negativo, a diferencia de otros algoritmos como Dijkstra.

El paquete consta de tres clases principales: `Main`, `Graph` y `Vertex`.

## Clases

1. **Main**: Esta es la clase principal que ejecuta el programa. En el método `main`, se crea un nuevo objeto `Graph`, se imprime una lista de ciudades, se lee un grafo desde un archivo de texto y se ejecuta el algoritmo de Bellman-Ford en el grafo. Finalmente, imprime si el grafo tiene o no ciclos negativos y los detalles de los vértices.

2. **Graph**: Esta clase representa un grafo. Contiene un array de vértices (`V`) y un array de aristas (`E`). También tiene métodos para imprimir los vértices y las ciudades.

3. **Vertex**: Esta clase representa un vértice en un grafo. Cada vértice tiene un índice, una distancia desde el vértice de origen y un vértice padre (`pi`), que es el vértice anterior en el camino más corto desde el vértice de origen.
4. **Edge**: Tambien se encuentra una clase Edge que es la clase de las aristas la cual solo contiene dos vertices y el  
 peso.

## Algoritmo

El algoritmo de Bellman-Ford se ejecuta en el método `BF` de la clase `BellmanFord`, que no se muestra en los fragmentos de código proporcionados. Este método toma un grafo y un vértice de origen como entrada, y actualiza las distancias y los vértices padres de todos los vértices en el grafo. <br>


