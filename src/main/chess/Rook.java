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
		if ((Board.hasPiece(i1,j1)) || !((i0==i1 && j0!=j1) || (i0!=i1 && j0==j1))){
			return false;
		}else if ((i0-i1)>0){ //Left
			for (int i=i0-1;i>i1;i--){
				if (Board.hasPiece(i,j0)){
					return false;
				}
			}
			return true;
		}else if ((i0-i1)<0){ //Right
			for (int i=i0+1;i<i1;i++){
				if (Board.hasPiece(i,j0)){
					return false;
				}
			}
			return true;
		}else if ((j0-j1)<0){ //Down
			for (int j=j0+1;j<i1;j++){
				if (Board.hasPiece(i0,j)){
					return false;
				}
			}
			return true;
		}else if ((j0-j1)>0){ //Up
			for (int j=j0-1;j>i1;j--){
				if (Board.hasPiece(i0,j)){
					return false;
				}
			}
			return true;
		}
		return true;
	}
}
