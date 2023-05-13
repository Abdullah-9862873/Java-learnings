import java.util.ArrayList;

public class UnWeighted_UnDirected_AdjacencyList_Graph{
    public static class Edge{
        int src;
        int dest;

        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph){
        // Initially all the elements in the array are null so we cannot store anything so we have to make them empty first
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));
        
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,2));
    }
    
    public static void main(String[] args) {
        int Vertex = 4;

        ArrayList<UnWeighted_UnDirected_AdjacencyList_Graph.Edge>[] graph = new ArrayList[Vertex];
        createGraph(graph);

        // Print all the neighbors of 2
        for(int i=0; i<graph[2].size(); i++){
            Edge e = graph[2].get(i);
            System.out.print(e.dest + " ");
        }
    }
}

/*
____________________________________________________________________________________________________
Benefits of using the Adjacency List:

-------> No extra space is being used
-------> Time efficient
____________________________________________________________________________________________________
-------> The graph we have created is unweighted undirectional/Bidirectional Graph
 */
