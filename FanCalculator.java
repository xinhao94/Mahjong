package mahjong;

public class FanCalculator {
	public int isDaSiXi(Hand hand) {
		int dong = 0;
		int nan = 0;
		int xi = 0;
		int bei = 0;
		for(int piece : hand.getPieces()) {
			switch(piece) {
			case 51:
				dong ++;
				break;
			case 52:
				nan ++;
				break;
			case 53:
				xi ++;
				break;
			case 54:
				bei ++;
				break;
			default:
				continue;
			}
		}
		if(dong>=3 && nan>=3 && xi>=3 && bei>=3) {
			return 88;
		}
		return 0;
	}
}
