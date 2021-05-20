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
    public void getPossibleMoves() {
        super.getPossibleMoves();
    }

    @Override
    public void testGetMovesInsideBoard(int x, int y) {
        x--;
        y--;
        for(int i =0; i<3; i++){
            for(int b = 0; b<3; b++){
                if((x+i)>=0&&(x+i)<8&&(y+b)>=0&&(y+b)<8&&(b!=1||i!=1)){
                    movearray.add(new Pair<>(x+i,y+b));
                }
            }
        }
        x++;
        y++;
        super.testGetMovesInsideBoard(x,y);
    }
}