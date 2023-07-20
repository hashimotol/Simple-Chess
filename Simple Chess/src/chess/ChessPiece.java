package chess;

public class ChessPiece {
	private Piece.PieceType piece;
	private Color.pieceColor color;
	
	public ChessPiece (Piece.PieceType piece, Color.pieceColor color) {
		this.piece = piece;
		this.color = color;
	}
	
	public Piece.PieceType getPiece() {
	
		return piece;
	}
	
	public Color.pieceColor getColor() {
		return color;
	}
}
