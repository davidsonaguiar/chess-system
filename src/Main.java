import chess.ChessMatch;

public class Main {
    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        chessMatch.initialSetup();
        UI.printBoard(chessMatch.getPieces());
    }
}