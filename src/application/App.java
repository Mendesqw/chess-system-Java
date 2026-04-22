package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;
import services.exceptions.ChessException;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        ChessMatch chessmatch = new ChessMatch();
        while (true) {
            try {
                UI.clearScreen();
                UI.printMatch(chessmatch);
                System.out.println();

                System.out.print("Source: ");
                ChessPosition source = UI.readChessPosition(sc);

                boolean[][] possibleMoves = chessmatch.possibleMoves(source);
                UI.clearScreen();
                UI.printBoard(chessmatch.getPieces(), possibleMoves);
                
                System.out.println();
                System.out.print("Target: ");
                ChessPosition target = UI.readChessPosition(sc);

                ChessPiece capturedPiece = chessmatch.performChessMove(source, target);
            } catch (ChessException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
