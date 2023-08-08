import java.util.*;

class WeightedGraph {
    private Map<Vertex, List<Edge>> adjacencyMap;

    public WeightedGraph() {
        adjacencyMap = new HashMap<>();
    }

    public void addVertex(Vertex vertex) {
        adjacencyMap.put(vertex, new ArrayList<>());
    }

    public void addEdge(Vertex source, Vertex destination, int weight) {
        Edge edge = new Edge(destination, weight);
        adjacencyMap.get(source).add(edge);
    }

    public List<Edge> getEdges(Vertex vertex) {
        return adjacencyMap.get(vertex);
    }

}
