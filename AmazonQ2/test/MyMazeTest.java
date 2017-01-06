import djb.amazon.MyMaze;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by David Blau on 1/2/17.
 */
public class MyMazeTest {

    private MyMaze maze;
    private int rows, cols, exitRow, exitCol;


    @Before
    public void setUp() throws Exception {
        int[][] grid = new int[][]{{0, 0, 0, 0}, {1, 0, 1, 0}, {1, 0, 0, 0}};
        rows = 3;
        cols = 4;
        exitRow = 1;
        exitCol = 3;


        maze = new MyMaze(grid,rows,cols,exitRow,exitCol);

    }

    @Test
    public void printNodes() throws Exception {

    }

    @Test
    public void initializeNodes() throws Exception {

    }

    @Test
    public void initializeNeighbors() throws Exception {

    }

    @Test
    public void findMinSteps() throws Exception {

    }

    @Test
    public void getAllNodes() throws Exception {

    }

    @Test
    public void setAllNodes() throws Exception {

    }

    @Test
    public void getGrid() throws Exception {

    }

    @Test
    public void setGrid() throws Exception {

    }

    @Test
    public void getNumRows() throws Exception {

    }

    @Test
    public void setNumRows() throws Exception {

    }

    @Test
    public void getNumCols() throws Exception {

    }

    @Test
    public void setNumCols() throws Exception {

    }

    @Test
    public void getStartX() throws Exception {

    }

    @Test
    public void setStartX() throws Exception {

    }

    @Test
    public void getStartY() throws Exception {

    }

    @Test
    public void setStartY() throws Exception {

    }

    @Test
    public void getEndX() throws Exception {

    }

    @Test
    public void setEndX() throws Exception {

    }

    @Test
    public void getEndY() throws Exception {

    }

    @Test
    public void setEndY() throws Exception {

    }


    @Test
    public void testCreatingGrid() {
        int rows = maze.getNumRows();
        int cols = maze.getNumCols();
        maze.initializeNodes(rows,cols);
        maze.printNodes();
        assert maze.getNumRows() == rows;
        assert maze.getNumCols() == cols;
        assert maze.getEndX() == exitCol;
        assert maze.getEndY() == exitRow;
        assert maze.getAllNodes().size() == rows * cols;

    }


}