package chess;

import chess.Color.pieceColor;
import chess.Piece.PieceType;

public class ChessBoard {

	public class Chessboard {
	    private ChessPiece[][] board;

	    public Chessboard() {
	        board = new ChessPiece[8][8];
	        initializeBoard();
	    }

	    private void initializeBoard() {
	        // Set up the starting positions of the pieces
	        // You can use Piece.PAWN, Piece.ROOK, Piece.KNIGHT, Piece.BISHOP, Piece.QUEEN, Piece.KING
	        // to populate the board array.
	    	//Initialize white pieces here
	    	
	    	board[0][0] = new ChessPiece(Piece.PieceType.ROOK, Color.pieceColor.WHITE);
	    	board[0][1] = new ChessPiece(Piece.PieceType.KNIGHT, Color.pieceColor.WHITE);
	    	board[0][2] = new ChessPiece(Piece.PieceType.BISHOP, Color.pieceColor.WHITE);
	    	board[0][3] = new ChessPiece(Piece.PieceType.QUEEN, Color.pieceColor.WHITE);
	    	board[0][4] = new ChessPiece(Piece.PieceType.KING, Color.pieceColor.WHITE);
	    	board[0][5] = new ChessPiece(Piece.PieceType.BISHOP, Color.pieceColor.WHITE);
	    	board[0][6] = new ChessPiece(Piece.PieceType.KNIGHT, Color.pieceColor.WHITE);
	    	board[0][7] = new ChessPiece(Piece.PieceType.ROOK, Color.pieceColor.WHITE);
	    	
	    	// White pawns
	    	for (int i = 0; i < 8; i++) {
	    		board[1][i] = new ChessPiece(Piece.PieceType.PAWN, Color.pieceColor.WHITE);
	    	}
	    	
	    	//Black side of Board
	    	
	    	board[7][0] = new ChessPiece(Piece.PieceType.ROOK, Color.pieceColor.BLACK);
	    	board[7][1] = new ChessPiece(Piece.PieceType.KNIGHT, Color.pieceColor.BLACK);
	    	board[7][2] = new ChessPiece(Piece.PieceType.BISHOP, Color.pieceColor.BLACK);
	    	board[7][3] = new ChessPiece(Piece.PieceType.QUEEN, Color.pieceColor.BLACK);
	    	board[7][4] = new ChessPiece(Piece.PieceType.KING, Color.pieceColor.BLACK);
	    	board[7][5] = new ChessPiece(Piece.PieceType.BISHOP, Color.pieceColor.BLACK);
	    	board[7][6] = new ChessPiece(Piece.PieceType.KNIGHT, Color.pieceColor.BLACK);
	    	board[7][7] = new ChessPiece(Piece.PieceType.ROOK, Color.pieceColor.BLACK);
	    	
	    	//Black pawns
	    	
	    	for (int i = 0; i < 8; i++) {
	    		board[6][i] = new ChessPiece(Piece.PieceType.PAWN, Color.pieceColor.BLACK);
	    	}
	    	
	    	 for (int row = 2; row < 6; row++) {
	             for (int col = 0; col < 8; col++) {
	                 board[row][col] = new ChessPiece(Piece.PieceType.EMPTY, null);
	             }
	    	 }
	           
	    	
	    	
	    }

	    public ChessPiece getPiece(int row, int col) {
	        return board[row][col];
	    }

	    public void movePiece(int fromRow, int fromCol, int toRow, int toCol) {
	        // Implement the logic to move the piece from (fromRow, fromCol) to (toRow, toCol)
	        // Check if the move is valid before making the move.
	    }

	    // Add more methods to check for check, checkmate, valid moves, etc.
	}

}
