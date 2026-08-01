//DFS
import java.util.*;

class Main {

    public static Set<String> dfsRecursive(Map<String, List<String>> graph, String node, Set<String> visited) {
        if (visited == null) {
            visited = new HashSet<>();
        }

        visited.add(node);
        System.out.print(node + " ");

        for (String neighbor : graph.getOrDefault(node, Collections.emptyList())) {
            if (!visited.contains(neighbor)) {
                dfsRecursive(graph, neighbor, visited);
            }
        }

        return visited;
    }

    public static void main(String[] args) {
        Map<String, List<String>> graph = Map.of(
            "A", List.of("B", "C"),
            "B", List.of("D", "E"),
            "C", List.of("F"),
            "D", List.of(),
            "E", List.of("F"),
            "F", List.of()
        );

        dfsRecursive(graph, "A", null);
    }
}
