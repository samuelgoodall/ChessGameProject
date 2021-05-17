package GamePieces.tests;

import GamePieces.GamePiece;
import javafx.util.Pair;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public abstract class GamePieceTest {
    protected GamePiece gamePiece;

    protected Set<Pair<Integer,Integer>> movearray;
    @Before
    public void setUp() throws Exception {
       movearray = new HashSet<>();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void getPossibleMoves() {
    }
    @Test
    @DisplayName("get all possible moves inside Board")
    public  void testGetMovesInsideBoard(){
        gamePiece.setPosition(new Pair<>(4, 4));

        assertEquals(movearray, new HashSet<>(gamePiece.getPossibleMoves()),
                "Moves not Correct");
    }


}