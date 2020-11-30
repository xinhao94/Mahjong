package mahjong;

import java.util.*;

/*
 11~19: 1 to 9 Bing
 21~29: 1 to 9 Tiao
 31~39: 1 to 9 Wan
 51~54: East, South, West, North
 61~63: Red, Green, White
 71~74: Spring, Summer, Autumn, Winter
 81~84: Plum, Orchid, Chrysanthemum, Bamboo 
 */

public class PieceMap {
	private static final Map<Integer, String> pieceMap;
	
	static {
		pieceMap = new HashMap<Integer, String>();
		for(int i=1; i<=9; i++) {
			pieceMap.put(10+i, String.valueOf(i)+"Bing");
		}
		for(int i=1; i<=9; i++) {
			pieceMap.put(20+i, String.valueOf(i)+"Tiao");
		}
		for(int i=1; i<=9; i++) {
			pieceMap.put(30+i, String.valueOf(i)+"Wan");
		}
		String[] feng = {"DongFeng", "NanFeng", "XiFeng", "BeiFeng"};
		for(int i=1; i<=4; i++) {
			pieceMap.put(50+i, feng[i-1]);
		}
		String[] jian = {"Zhong", "Fa", "Bai"};
		for(int i=1; i<=3; i++) {
			pieceMap.put(60+i, jian[i-1]);
		}
		String[] season = {"Chun", "Xia", "Qiu", "Dong"};
		for(int i=1; i<=4; i++) {
			pieceMap.put(70+i, season[i-1]);
		}
		String[] plant = {"Mei", "Lan", "Jv", "Zhu"};
		for(int i=1; i<=4; i++) {
			pieceMap.put(80+i, plant[i-1]);
		}
	}
	
	
	public String getTile(int code) {
		String ans = pieceMap.get(code);
		if(ans==null) {
			return "Invalid!";
		} else {
			return ans;
		}
	}
}
