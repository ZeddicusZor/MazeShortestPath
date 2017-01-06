package djb.amazon;

import java.util.ArrayList;

/**
 * Created by David Blau on 1/2/17.
 *
 * Given a 2D array like [[0,0,0,0]
 *                        [1,0,1,0]
 *                        [1,0,0,0]] where 0's are floor and 1's are walls
 * and end coordinates row = 1, col = 3, return the shortest path from starting point (0,0
 * or -1 if not reachable
 * In this example the function should return 4
 */
public class MyMaze {

    protected ArrayList<Node> allNodes;
    private int[][] grid;
    private int numRows;
    private int numCols;
    private int startX;
    private int startY;
    private int endX;
    private int endY;


    public MyMaze() {
        this(null,0,0,0,0);
    }

    /**
     * Main Constructor
     * @param grid Takes a 2D int array called grid, where for every x,y cell,
     *             a 0 represents movable space (i.e. open floor) and a 1 represents a wall (i.e. cannot move to this cell)
     * @param rows the number of rows in the grid
     * @param cols the number of columns in the grid
     * @param exitRow the 0 based Y value of the cell where we want to end
     * @param exitCol the 0 based X value of the cell to end
     **/
    public MyMaze(int[][] grid, int rows, int cols, int exitRow, int exitCol) {
        this.grid = grid;
        this.numRows = rows;
        this.numCols = cols;
        this.startX = 0;
        this.startY = 0;
        this.endX = exitCol;
        this.endY = exitRow;
        allNodes = new ArrayList<>();
    }

    /**
     *
     */
    public void printNodes() {
        for(Node n : this.allNodes) {
            System.out.println(n);
        }
    }

    /**
     * initialize the
     * @param rows
     * @param cols
     */
    public void initializeNodes(int rows, int cols) {
        int identifier = 1;
        int numNodes = rows * cols;
        // Initialize maze object with input
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                Node n = new Node(identifier++,i,j,numNodes);
                System.out.println(n);
                this.allNodes.add(n);
            }
        }
    }

    /**
     *
     * @param grid
     */
    public void initializeNeighbors(int[][] grid) {
        int currentNodeId = 1;
        for(int r = 0; r < this.numRows; r++) {
            for(int c = 0; c < this.numCols; c++) {
                // Check up
                if(r >= 1) {

                }

                // Check Right
                // Check Down
                // Check Left
            }
        }

    }

    /**
     * This is the main method at test for this problem
     * @param grid
     * @param rows
     * @param cols
     * @param exitRow
     * @param exitCol
     * @return
     */
    public static int findMinSteps(int[][] grid, int rows, int cols, int exitRow, int exitCol) {
        int startX = 0;
        int startY = 0;
        int minPath = -1;

        MyMaze maze = new MyMaze();
//        ma

        return minPath;
    }


    public ArrayList<Node> getAllNodes() {
        return allNodes;
    }

    public void setAllNodes(ArrayList<Node> allNodes) {
        this.allNodes = allNodes;
    }

    public int[][] getGrid() {
        return grid;
    }

    public void setGrid(int[][] grid) {
        this.grid = grid;
    }

    public int getNumRows() {
        return numRows;
    }

    public void setNumRows(int numRows) {
        this.numRows = numRows;
    }

    public int getNumCols() {
        return numCols;
    }

    public void setNumCols(int numCols) {
        this.numCols = numCols;
    }

    public int getStartX() {
        return startX;
    }

    public void setStartX(int startX) {
        this.startX = startX;
    }

    public int getStartY() {
        return startY;
    }

    public void setStartY(int startY) {
        this.startY = startY;
    }

    public int getEndX() {
        return endX;
    }

    public void setEndX(int endX) {
        this.endX = endX;
    }

    public int getEndY() {
        return endY;
    }

    public void setEndY(int endY) {
        this.endY = endY;
    }
}
