import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        WeightedGraph graph = new WeightedGraph();
        Vertex v1 = new Vertex(1);
        Vertex v2 = new Vertex(2);
        Vertex v3 = new Vertex(3);

        graph.addVertex(v1);
        graph.addVertex(v2);
        graph.addVertex(v3);

        System.out.print("Enter the number of edges: ");
        int numEdges = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numEdges; i++) {
            System.out.print("Enter source vertex ID: ");
            int sourceId = scanner.nextInt();
            System.out.print("Enter destination vertex ID: ");
            int destId = scanner.nextInt();
            System.out.print("Enter edge weight: ");
            int weight = scanner.nextInt();
            scanner.nextLine();

            Vertex sourceVertex = new Vertex(sourceId);
            Vertex destVertex = new Vertex(destId);

            graph.addVertex(sourceVertex);
            graph.addVertex(destVertex);

            graph.addEdge(sourceVertex, destVertex, weight);
        }


        System.out.print("Enter the start vertex ID for BFS: ");
        int startVertexId = scanner.nextInt();
        scanner.close();

        Vertex startVertex = new Vertex(startVertexId);
        BreadthFirstSearch bfs = new BreadthFirstSearch(graph);
        System.out.println("Breadth-First Search starting from vertex " + startVertexId + ":");
        bfs.bfs(startVertex);
    }
}
