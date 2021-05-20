package GamePieces;
import javafx.util.Pair;
import java.util.ArrayList;

public class Peasant extends GamePiece{

    public Peasant(int posX, int posY,GamePiece.colourEnum colour) {
        super(posX, posY,colour);
        if(colour==colourEnum.white){
            this.initialPosition = posY == 2;
        }else{
            this.initialPosition = posY == 6;
        }
    }

    @Override
    public ArrayList<Pair<Integer, Integer>> getPossibleMoves() {

        ArrayList<Pair<Integer, Integer>> movearray = new ArrayList<>();
        int i = 1;
        if(colour == GamePiece.colourEnum.black){
            i=-1;
        }

        int x = this.position.getKey() ;
        int x1=this.position.getKey()+i;
        int x2=this.position.getKey()-i;
        int y=this.position.getValue()+i;

        if(initialPosition){
            movearray.add(new Pair<>(position.getKey(),position.getValue()+ 2*i ));
        }
        //move peasant normally
        if(y>0&&y<7){
            movearray.add(new Pair<>(x, y));
            if(0<x1&&7>x1){
                movearray.add(new Pair<>(x1,y));
            }
            if(0<x2&&7>x2){
                movearray.add(new Pair<>(x2,y));
            }
        }
        return movearray;
    }


}
