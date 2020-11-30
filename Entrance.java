package mahjong;

public class Entrance {
	public static void main(String[] args) {
		int[] pieces = {51, 52, 53, 54, 51, 52, 53, 54, 51, 52, 53, 54, 29, 29};
		Hand myHand = new Hand(pieces);
		myHand.printHand();
		FanCalculator cal = new FanCalculator();
		System.out.println(cal.isDaSiXi(myHand));
	}
}
