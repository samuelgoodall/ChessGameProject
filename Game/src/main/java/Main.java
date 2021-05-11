import GamePieces.Bishop;

public class Main
{
    public static void main(String[] args) {
        System.out.println("HelloWorld");

        Bishop Bishop = new Bishop( 3, 7, "black");

        Bishop.getPossibleMoves();
        System.out.println(Bishop.getPossibleMoves());

    }
}
