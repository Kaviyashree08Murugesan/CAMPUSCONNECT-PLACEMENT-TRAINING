//BFS
import java.util.*;

class Main {

    public static void bfs(Map<Character, List<Character>> graph, char startNode) {
        Set<Character> visited = new HashSet<>();
        Queue<Character> queue = new ArrayDeque<>();

        visited.add(startNode);
        queue.add(startNode);

        while (!queue.isEmpty()) {
            char currentNode = queue.poll();
            System.out.print(currentNode + " ");

            for (char neighbor : graph.getOrDefault(currentNode, List.of())) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        Map<Character, List<Character>> exampleGraph = new HashMap<>();
        exampleGraph.put('A', Arrays.asList('B', 'C'));
        exampleGraph.put('B', Arrays.asList('D', 'E'));
        exampleGraph.put('C', List.of('F'));
        exampleGraph.put('D', List.of());
        exampleGraph.put('E', List.of('F'));
        exampleGraph.put('F', List.of());

        System.out.println("BFS Order of Traversal:");
        bfs(exampleGraph, 'A');
    }
}
