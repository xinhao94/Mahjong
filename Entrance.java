package mahjong;

import java.util.*;

public class Entrance {
	public static void main(String[] args) {
		Piece piece1 = new Piece(Tile.BING, 1);
		Piece piece2 = new Piece(Tile.TIAO, 2);
		Piece piece3 = new Piece(Tile.BING, 1);
		Hand myHand = new Hand();
		myHand.addPiece(piece1);
		myHand.addPiece(piece2);
		myHand.addPiece(piece3);
		FanCalculator s = new FanCalculator();
		s.getFan(myHand);
	}	 
}