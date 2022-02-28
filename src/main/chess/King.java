package chess;

class King extends Piece{
	private PieceColour colour;
	private String symbol;

	King(PieceColour pc){
		if (pc.equals(PieceColour.WHITE)){
			this.colour=PieceColour.WHITE;
			this.symbol="♔";
		}
		else if (pc.equals(PieceColour.BLACK)){
			this.colour=PieceColour.BLACK;
			this.symbol="♚";
		}
	}
	public String getSymbol(){
		return symbol;
	}
	public PieceColour getColour(){
		return colour;
	}

	@Override
	boolean isLegitMove(int i0, int j0, int i1, int j1) {
		if ((Board.hasPiece(i1,j1))){
			return false;
		}else return ((j1 == (j0 + 1)) || (j1 == (j0 - 1))) ^ ((i1 == (i0 + 1)) || (i1 == (i0 - 1)));
	}
}
