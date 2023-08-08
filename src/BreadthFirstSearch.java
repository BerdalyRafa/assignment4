import java.util.*;

class BreadthFirstSearch {
    private WeightedGraph graph;
    private Set<Vertex> visited;

    public BreadthFirstSearch(WeightedGraph graph) {
        this.graph = graph;
        visited = new HashSet<>();
    }

    public void bfs(Vertex startVertex) {
        Queue<Vertex> queue = new LinkedList<>();
        queue.add(startVertex);
        visited.add(startVertex);

        while (!queue.isEmpty()) {
            Vertex currentVertex = queue.poll();
            System.out.println("Visited vertex: " + currentVertex.getId());

            List<Edge> edges = graph.getEdges(currentVertex);
            for (Edge edge : edges) {
                Vertex neighbor = edge.getDestination();
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }
    }
}
