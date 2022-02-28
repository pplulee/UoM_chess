package chess;

class Bishop extends Piece {
	private PieceColour colour;
	private String symbol;

	Bishop(PieceColour pc) {
		if (pc.equals(PieceColour.WHITE)) {
			this.colour = PieceColour.WHITE;
			this.symbol = "♗";
		} else if (pc.equals(PieceColour.BLACK)) {
			this.colour = PieceColour.BLACK;
			this.symbol = "♝";
		}
	}

	public String getSymbol() {
		return symbol;
	}

	public PieceColour getColour() {
		return colour;
	}

	@Override
	boolean isLegitMove(int i0, int j0, int i1, int j1) {
		if ((Board.hasPiece(i1, j1)) || (Math.abs(i0 - i1) != Math.abs(j0 - j1))) {
			return false;
		} else if (((i0 - i1) > 0) && ((j0 - j1) > 0)) { //Left-Up
			int i = i0;
			int j = j0;
			while ((i > i1) && (j > j1)){
				i--;
				j--;
				if (Board.hasPiece(i, j)) {
					return false;
				}
			}
			return true;
		} else if (((i0 - i1) < 0) && ((j0 - j1) > 0)) { //Right-Up
			int i = i0;
			int j = j0;
			while ((i < i1) && (j > j1)){
				i++;
				j--;
				if (Board.hasPiece(i, j)) {
					return false;
				}
			}
			return true;
		} else if (((i0 - i1) < 0) && ((j0 - j1) < 0)) { //Right-Down
			int i = i0;
			int j = j0;
			while ((i < i1) && (j < j1)){
				i++;
				j++;
				if (Board.hasPiece(i, j)) {
					return false;
				}
			}
			return true;
		} else if (((i0 - i1) > 0) && ((j0 - j1) < 0)) { //Left-Down
			int i = i0;
			int j = j0;
			while ((i > i1) && (j < j1)){
				i--;
				j++;
				if (Board.hasPiece(i, j)) {
					return false;
				}
			}
			return true;
		} else return true;
	}
}
