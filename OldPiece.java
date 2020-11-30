package mahjong;

/*
 Bing: 1~9
 Tiao: 1~9
 Wan: 1~9
 Feng: East(1), South(2), West(3), North(4)
 Jian: Red(1), Green(2), White(3)
 Hua: Plum(1), Orchid(2), Chrysanthemum(3), Bamboo(4), Spring(5), Summer(6), Autumn(7), Winter(8)
 */

public class Piece {
	private Tile tile;
	private int rank;
	
	// Constructor
	public Piece(Tile tile, int rank) {
		this.tile = tile;
		this.rank = rank;
	}
	
	public char getTile() {
		switch(tile) {
		case BING:
			return 'B';
		case TIAO:
			return 'T';
		case WAN:
			return 'W';
		case FENG:
			return 'F';
		case JIAN:
			return 'J';
		case HUA:
			return 'H';
		default:
			return 'N';
		}
	}
	
	public int getRank() {
		return rank;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null) {
			return false;
		}
		if(obj.getClass()!=this.getClass()) {
			return false;
		}
		final Piece other = (Piece) obj;
		if(this.tile==other.tile && this.rank==other.rank) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		final int prime1 = 31;
		final int prime2 = 32;
		int result = 0;
		result = prime1 * this.getTile() + prime2 * this.getRank();
		return result;
	}
	
	public void printPiece() {
		switch(tile) {
		case BING: 
			System.out.print(this.rank);
			System.out.print("Bing");
			break;
		case TIAO:
			System.out.print(this.rank);
			System.out.print("Tiao");
			break;
		case WAN:
			System.out.print(this.rank);
			System.out.print("Wan");
			break;
		case FENG:
			switch(rank) {
			case 1:
				System.out.print("East");
				break;
			case 2:
				System.out.print("Nan");
				break;
			case 3:
				System.out.print("Xi");
				break;
			case 4:
				System.out.print("Bei");
				break;
			}
			break;
		case JIAN:
			switch(rank) {
			case 1:
				System.out.print("Zhong");
				break;
			case 2:
				System.out.print("Fa");
				break;
			case 3:
				System.out.print("Bai");
				break;
			}
			break;
		case HUA:
			switch(rank) {
			case 1:
				System.out.print("Mei");
				break;
			case 2:
				System.out.print("Lan");
				break;
			case 3:
				System.out.print("Ju");
				break;
			case 4:
				System.out.print("Zhu");
				break;
			case 5:
				System.out.print("Chun");
				break;
			case 6:
				System.out.print("Xia");
				break;
			case 7:
				System.out.print("Qiu");
				break;
			case 8:
				System.out.print("Winter");
				break;
			}
			break;
		}
	}
}

