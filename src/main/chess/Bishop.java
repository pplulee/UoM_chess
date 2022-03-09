package chess;

public class Bishop extends Piece {
	private PieceColour colour;
	private String symbol;

	public Bishop(PieceColour pc) {
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
	public boolean isLegitMove(int i0, int j0, int i1, int j1) {
		if (Math.abs(i0-i1)!=Math.abs(j0-j1)){
			return false;
		}else if((i0-i1)<0 && (j0-j1)<0){//SE
			int i = i0+1;
			int j = j0+1;
			while (i<i1 && j<j1){
				if (Board.hasPiece(i,j)){
					return false;
				}
				i++;
				j++;
			}
		}else if((i0-i1)>0 && (j0-j1)<0){//NE
			int i = i0-1;
			int j = j0+1;
			while (i>i1 && j<j1){
				if (Board.hasPiece(i,j)){
					return false;
				}
				i--;
				j++;
			}
		}else if((i0-i1)<0 && (j0-j1)>0){//SW
			int i = i0+1;
			int j = j0-1;
			while (i<i1 && j>j1){
				if (Board.hasPiece(i,j)){
					return false;
				}
				i++;
				j--;
			}
		}else if((i0-i1)>0 && (j0-j1)>0){//NW
			int i = i0-1;
			int j = j0-1;
			while (i>i1 && j>j1){
				i--;
				j--;
				if (Board.hasPiece(i,j)){
					return false;
				}
			}
		}
		return !(Board.hasPiece(i1, j1) && Board.getPiece(i0, j0).getColour() == Board.getPiece(i1, j1).getColour());
	}
}
