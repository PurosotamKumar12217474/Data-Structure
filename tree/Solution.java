import java.util.*;

public class Solution {

    public static void printParents(int node, Vector<Vector<Integer>> adj, int parent) {
        if (parent == 0)
            System.out.println(node + " -> Root");
        else
            System.out.println(node + " -> " + parent);

        for (int i = 0; i < adj.get(node).size(); i++) {
            if (adj.get(node).get(i) != parent) {
                printParents(adj.get(node).get(i), adj, node);
            }
        }
    }

    public static void printChildren(int root, Vector<Vector<Integer>> adj) {
        Queue<Integer> q = new LinkedList<>();
        q.add(root);
        int[] vis = new int[adj.size()];
        Arrays.fill(vis, 0);

        while (!q.isEmpty()) {
            int node = q.poll();
            vis[node] = 1;
            System.out.print(node + " -> ");

            for (int i = 0; i < adj.get(node).size(); i++) {
                int child = adj.get(node).get(i);
                if (vis[child] == 0) {
                    System.out.print(child + " ");
                    q.add(child);
                }
            }
            System.out.println();
        }
    }

    public static void printLeafNodes(int root, Vector<Vector<Integer>> adj) {
        for (int i = 1; i < adj.size(); i++) {
            if (adj.get(i).size() == 1 && i != root) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void printDegrees(int root, Vector<Vector<Integer>> adj) {
        for (int i = 1; i < adj.size(); i++) {
            System.out.print(i + ": ");
            if (i == root)
                System.out.println(adj.get(i).size());
            else
                System.out.println(adj.get(i).size() - 1);
        }
    }

    public static void main(String[] args) {
        int N = 7, Root = 1;

        Vector<Vector<Integer>> adj = new Vector<>();
        for (int i = 0; i <= N; i++) {
            adj.add(new Vector<>());
        }

        adj.get(1).add(2); adj.get(2).add(1);
        adj.get(1).add(3); adj.get(3).add(1);
        adj.get(1).add(4); adj.get(4).add(1);
        adj.get(2).add(5); adj.get(5).add(2);
        adj.get(2).add(6); adj.get(6).add(2);
        adj.get(4).add(7); adj.get(7).add(4);

        System.out.println("The parents of each node are:");
        printParents(Root, adj, 0);

        System.out.println("\nThe children of each node are:");
        printChildren(Root, adj);

        System.out.println("\nThe leaf nodes of the tree are:");
        printLeafNodes(Root, adj);

        System.out.println("\nThe degrees of each node are:");
        printDegrees(Root, adj);
    }
}
