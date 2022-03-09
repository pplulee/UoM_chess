package chess;

public class Pawn extends Piece{
	private PieceColour colour;
	private String symbol;

	public Pawn(PieceColour pc){
		if (pc.equals(PieceColour.WHITE)){
			this.colour=PieceColour.WHITE;
			this.symbol="♙";
		}
		else if (pc.equals(PieceColour.BLACK)){
			this.colour=PieceColour.BLACK;
			this.symbol="♟";
		}
	}

	public String getSymbol(){
		return symbol;
	}
	public PieceColour getColour(){
		return colour;
	}

	@Override
	public boolean isLegitMove(int i0, int j0, int i1, int j1) {
		if ((Board.hasPiece(i1,j1)) && (Board.getPiece(i0,j0).getColour())==(Board.getPiece(i1,j1).getColour())) {
			return false;
		}
		if ((Math.abs(i0-i1)>2) || (Math.abs(j0-j1)>1) || (Math.abs(i0-i1)==0)){
			return false;
		}
		int direction;
		if (Board.getPiece(i0,j0).getColour()==PieceColour.BLACK){
			direction = 1;
		}else{
			direction = -1;
		}
		//Direction check
		if ((direction+i0!=i1) && (direction*2+i0!=i1)){
			return false;
		}
		if (i0 == 1 || i0 == 6) {//first step
			if (j0!=j1){
				return false;
			}else{
				switch (Math.abs(i0 - i1)){
					case 1:{
						return true;
					}
					case 2:{
						return !Board.hasPiece(i0+direction,j0);
					}
				}
			}
		}else{
			switch (Math.abs(j0 - j1)){
				case 0:{
					if (Math.abs(i0-i1)==2){
						return false;
					}else{
						return !Board.hasPiece(i0+direction,j0);
					}
				}
				case 1:{
					return Board.hasPiece(i1, j1) && Board.getPiece(i0, j0).getColour() != Board.getPiece(i1, j1).getColour();
				}
			}
		}
		return false;
	}
}
