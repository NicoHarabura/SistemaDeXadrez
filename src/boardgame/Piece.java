package boardgame;

public class Piece {
	
	protected Position position;
	
	private Board board;

	public Piece(Board board) {
		this.board = board;
		board = null;
	}

	public Board getBoard() {
		return board;
	}

	
	

}
