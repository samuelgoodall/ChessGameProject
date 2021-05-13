package test.GamePieceTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import GamePieces.King;

import javafx.util.Pair;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class KingTest {

    private King king;

    @BeforeEach
    public void setUp() {
        king = new King(4,4,"black");
    }

    @Test
    @DisplayName("get all possible moves")
    public void testGetMovesInsideBoard() {
        king.setPosition(new Pair<>(4,4));
        Set<Pair<Integer,Integer>> movearray = new HashSet<>();

        movearray.add(new Pair<>(4,5 ));
        movearray.add(new Pair<>(5,5 ));
        movearray.add(new Pair<>(3,5 ));
        movearray.add(new Pair<>(4,3 ));
        movearray.add(new Pair<>(3,3 ));
        movearray.add(new Pair<>(3,4 ));
        movearray.add(new Pair<>(5,4 ));
        movearray.add(new Pair<>(5,3 ));

        assertEquals(movearray, new HashSet<>(king.getPossibleMoves()),
                "Regular multiplication should work");
    }

}
