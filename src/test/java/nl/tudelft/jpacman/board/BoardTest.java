package nl.tudelft.jpacman.board;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class BoardTest {

    @Test
    public void shouldCreateBoardWithValidSquare() {

        BasicSquare[][] grid = new BasicSquare[1][1];
        grid[0][0] = new BasicSquare();

        Board board = new Board(grid);

        assertThat(board.invariant()).isTrue();
        assertThat(board.squareAt(0, 0).invariant()).isTrue();
    }

    @Test
    public void shouldFailInvariantWithNullSquare() {

        BasicSquare[][] grid = new BasicSquare[1][1];
        grid[0][0] = null;

        Board board = new Board(grid);

        assertThat(board.invariant()).isFalse();
        assertThat(board.squareAt(0, 0)).isNull();
    }
}
