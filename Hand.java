package mahjong;

import java.util.*;

public class Hand {
	private List<Piece> pieces;
	
	// Constructor
	public Hand() {
		this.pieces = new ArrayList<Piece>();
	}
	
	public void addPiece(Piece piece) {
		pieces.add(piece);
	}
	
	public List<Piece> getPieces() {
		return pieces;
	}
	
	public void printHand() {
		for(Piece piece : pieces) {
			piece.printPiece();
			System.out.print(" ");
		}
		System.out.print("\n");
	}
}
