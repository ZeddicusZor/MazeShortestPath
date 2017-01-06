package djb.amazon;

import java.util.ArrayList;

/**
 * Created by David Blau on 1/5/17.
 */
public class Node {
    public int id;
    public int x;
    public int y;
    public boolean visited;
    public ArrayList<Node> adjacent;

    public Node(int id, int x, int y, int numNodes) {
        this.id = id;

        this.x = x;
        this.y = y;
        this.visited = false;
        this.adjacent = new ArrayList<>();

    }

    @Override
    public String toString() {
        String str = "Node ID: ["+id+"] x: '"+x+"' y: '"+y+"' visited: "+visited+" neighbors: [";
        for(Node n : adjacent) {
            str += "'"+n.id+"' ";
        }
        str += "]";
        return str;
    }
}
