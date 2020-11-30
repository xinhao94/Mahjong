package mahjong;

import java.util.*;

public class FanCalculator {
	public int getFan(Hand hand) {
		// Store all pieces in a hash map
		List<Piece> pieces = hand.getPieces();
		Map<Piece, Integer> helper = new HashMap<>();
		for(Piece piece : pieces) {
			if(!helper.containsKey(piece)) {
				helper.put(piece, 1);
				System.out.println("New Entry");
				System.out.println(helper.get(piece));
			} else {
				int temp = helper.get(piece);
				helper.put(piece, temp+1);
				System.out.println("Existed Entry");
				System.out.println(helper.get(piece));
			}
		}
		return 0;
	}
}
