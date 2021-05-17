package GamePieces.tests;

import GamePieces.GamePiece;
import javafx.util.Pair;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;


import static org.junit.jupiter.api.Assertions.assertEquals;

import GamePieces.King;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;


public class KingTest extends GamePieceTest{



    @BeforeEach
    public void setUp() throws Exception {
        gamePiece = new King(4,4,GamePiece.colourEnum.black);
        super.setUp();
    }

    @Override
    public void testGetMovesInsideBoard() {

        movearray.add(new Pair<>(4,5 ));
        movearray.add(new Pair<>(5,5 ));
        movearray.add(new Pair<>(3,5 ));
        movearray.add(new Pair<>(4,3 ));
        movearray.add(new Pair<>(3,3 ));
        movearray.add(new Pair<>(3,4 ));
        movearray.add(new Pair<>(5,4 ));
        movearray.add(new Pair<>(5,3 ));

        super.testGetMovesInsideBoard();
    }
}