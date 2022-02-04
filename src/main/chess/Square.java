package chess;

class Square {
	boolean hasPiece;
	Piece p;


	Piece getPiece(){
		return p;
	}

	void setPiece(Piece pIn){
		p=pIn;
		hasPiece=true;
	}

	void removePiece(){
		hasPiece=false;
		p=null;
	}

	boolean hasPiece(){
		return hasPiece;
	}
}
