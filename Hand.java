package mahjong;

import java.util.*;

public class Hand {
	private List<Integer> pieces;
	
	// Constructor without initialization
	public Hand() {
		pieces = new ArrayList<>();
	}
	// Constructor with initialization
	public Hand(int[] array) {
		pieces = new ArrayList<>();
		for(int i=0; i<array.length; i++) {
			pieces.add(array[i]);
		}
		Collections.sort(pieces);
	}
	
	public void addPiece(int piece) {
		pieces.add(piece);
		Collections.sort(pieces);
	}
	
	public List<Integer> getPieces() {
		return pieces;
	}
	
	public void printHand() {
		PieceMap m = new PieceMap();
		for(int piece : pieces) {
			System.out.print(m.getTile(piece));
			System.out.print(" ");
		}
		System.out.print("\n");
	}
}
