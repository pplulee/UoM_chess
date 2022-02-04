package chess;

class Rook extends Piece{
	private PieceColour colour;
	private String symbol;

	Rook(PieceColour pc){
		if (pc.equals(PieceColour.WHITE)){
			this.colour=PieceColour.WHITE;
			this.symbol="♖";
		}
		else if (pc.equals(PieceColour.BLACK)){
			this.colour=PieceColour.BLACK;
			this.symbol="♜";
		}
	}

	public String getSymbol(){
		return symbol;
	}
	public PieceColour getColour(){
		return colour;
	}

	boolean isLegitMove(int i0, int j0, int i1, int j1) {
		return true;
	}
}
