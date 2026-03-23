package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.Bishop;
import chess.pieces.King;
import chess.pieces.Knight;
import chess.pieces.Pawn;
import chess.pieces.Queen;
import chess.pieces.Rook;

public class ChessMatch {

    private Board board;

    public ChessMatch() {
        board = new Board(8, 8);
        initialSetup();
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int r = 0; r < board.getRows(); r++) { // Loop for rows
            for (int c = 0; c < board.getColumns(); c++) { // Loop for columns
                mat[r][c] = (ChessPiece) board.piece(r, c);
            }
        }
        return mat;
    }

    private void initialSetup() {
        // WhitePieces
        board.placePiece(new Rook(board, Color.WHITE), new Position(0, 0));
        board.placePiece(new Knight(board, Color.WHITE), new Position(0, 1));
        board.placePiece(new Bishop(board, Color.WHITE), new Position(0, 2));
        board.placePiece(new Queen(board, Color.WHITE), new Position(0, 3));
        board.placePiece(new King(board, Color.WHITE), new Position(0, 4));
        board.placePiece(new Bishop(board, Color.WHITE), new Position(0, 5));
        board.placePiece(new Knight(board, Color.WHITE), new Position(0, 6));
        board.placePiece(new Rook(board, Color.WHITE), new Position(0, 7));
        // Pawn loop
        for (int p = 0; p <= 7; p++) {
            board.placePiece(new Pawn(board, Color.WHITE), new Position(1, p));
        }

        // BlackPieces
        board.placePiece(new Rook(board, Color.BLACK), new Position(7, 0));
        board.placePiece(new Knight(board, Color.BLACK), new Position(7, 1));
        board.placePiece(new Bishop(board, Color.BLACK), new Position(7, 2));
        board.placePiece(new Queen(board, Color.BLACK), new Position(7, 3));
        board.placePiece(new King(board, Color.BLACK), new Position(7, 4));
        board.placePiece(new Bishop(board, Color.BLACK), new Position(7, 5));
        board.placePiece(new Knight(board, Color.BLACK), new Position(7, 6));
        board.placePiece(new Rook(board, Color.BLACK), new Position(7, 7));
        // Pawn loop
        for (int p = 0; p <= 7; p++) {
            board.placePiece(new Pawn(board, Color.BLACK), new Position(6, p));
        }

    }
}
