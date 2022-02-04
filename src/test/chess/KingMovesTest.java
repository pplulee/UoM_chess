package chess;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class KingMovesTest {

	@Before
	public void initBoard() {
		Board.initialiseBoard();
	}

	public void setUpforKingA(){
		//Black pieces
		Board.setPiece(0,0,new Rook(PieceColour.BLACK));
		Board.setPiece(0,1,new Knight(PieceColour.BLACK));
		Board.setPiece(0,2,new Bishop(PieceColour.BLACK));
		Board.setPiece(0,3,new Queen(PieceColour.BLACK));
		Board.setPiece(0,4,new King(PieceColour.BLACK));
		Board.setPiece(0,5,new Bishop(PieceColour.BLACK));
		Board.setPiece(0,6,new Knight(PieceColour.BLACK));
		Board.setPiece(0,7,new Rook(PieceColour.BLACK));
		Board.setPiece(1,0,new Pawn(PieceColour.BLACK));
		Board.setPiece(1,1,new Pawn(PieceColour.BLACK));
		Board.setPiece(1,2,new Pawn(PieceColour.BLACK));
		Board.setPiece(1,3,new Pawn(PieceColour.BLACK));
		Board.setPiece(1,4,new Pawn(PieceColour.BLACK));
		Board.setPiece(1,5,new Pawn(PieceColour.BLACK));
		Board.setPiece(1,6,new Pawn(PieceColour.BLACK));
		Board.setPiece(1,7,new Pawn(PieceColour.BLACK));

		//White pieces
		Board.setPiece(6,0,new Pawn(PieceColour.WHITE));
		Board.setPiece(6,1,new Pawn(PieceColour.WHITE));
		Board.setPiece(6,2,new Pawn(PieceColour.WHITE));
		Board.setPiece(6,3,new Pawn(PieceColour.WHITE));
		Board.setPiece(6,4,new Pawn(PieceColour.WHITE));
		Board.setPiece(6,5,new Pawn(PieceColour.WHITE));
		Board.setPiece(6,6,new Pawn(PieceColour.WHITE));
		Board.setPiece(6,7,new Pawn(PieceColour.WHITE));
		Board.setPiece(7,0,new Rook(PieceColour.WHITE));
		Board.setPiece(7,1,new Knight(PieceColour.WHITE));
		Board.setPiece(7,2,new Bishop(PieceColour.WHITE));
		Board.setPiece(7,3,new Queen(PieceColour.WHITE));
		Board.setPiece(7,4,new King(PieceColour.WHITE));
		Board.setPiece(7,5,new Bishop(PieceColour.WHITE));
		Board.setPiece(7,6,new Knight(PieceColour.WHITE));
		Board.setPiece(7,7,new Rook(PieceColour.WHITE));
	}

	public void setUpforKingB(){
		//Black pieces
		Board.setPiece(0,0,new Rook(PieceColour.BLACK));
		Board.setPiece(0,1,new Knight(PieceColour.BLACK));
		Board.setPiece(0,2,new Bishop(PieceColour.BLACK));
		Board.setPiece(0,3,new Queen(PieceColour.BLACK));
		Board.setPiece(3,2,new King(PieceColour.BLACK));
		Board.setPiece(0,5,new Bishop(PieceColour.BLACK));
		Board.setPiece(0,6,new Knight(PieceColour.BLACK));
		Board.setPiece(0,7,new Rook(PieceColour.BLACK));
		Board.setPiece(1,0,new Pawn(PieceColour.BLACK));
		Board.setPiece(1,1,new Pawn(PieceColour.BLACK));
		Board.setPiece(1,2,new Pawn(PieceColour.BLACK));
		Board.setPiece(1,3,new Pawn(PieceColour.BLACK));
		Board.setPiece(1,4,new Pawn(PieceColour.BLACK));
		Board.setPiece(1,5,new Pawn(PieceColour.BLACK));
		Board.setPiece(1,6,new Pawn(PieceColour.BLACK));
		Board.setPiece(1,7,new Pawn(PieceColour.BLACK));

		//White pieces
		Board.setPiece(6,0,new Pawn(PieceColour.WHITE));
		Board.setPiece(3,1,new Pawn(PieceColour.WHITE));
		Board.setPiece(6,2,new Pawn(PieceColour.WHITE));
		Board.setPiece(6,3,new Pawn(PieceColour.WHITE));
		Board.setPiece(6,4,new Pawn(PieceColour.WHITE));
		Board.setPiece(3,5,new Pawn(PieceColour.WHITE));
		Board.setPiece(6,6,new Pawn(PieceColour.WHITE));
		Board.setPiece(6,7,new Pawn(PieceColour.WHITE));
		Board.setPiece(7,0,new Rook(PieceColour.WHITE));
		Board.setPiece(7,1,new Knight(PieceColour.WHITE));
		Board.setPiece(7,2,new Bishop(PieceColour.WHITE));
		Board.setPiece(7,3,new Queen(PieceColour.WHITE));
		Board.setPiece(2,6,new King(PieceColour.WHITE));
		Board.setPiece(7,5,new Bishop(PieceColour.WHITE));
		Board.setPiece(7,6,new Knight(PieceColour.WHITE));
		Board.setPiece(7,7,new Rook(PieceColour.WHITE));
	}

	@Test
	public void badMoveW1(){
		setUpforKingA();
		King k = (King) Board.getPiece(7,4);
		assertFalse(k.isLegitMove(7,4,7,4));
	}

	@Test
	public void badMoveW2(){
		setUpforKingA();
		King k = (King) Board.getPiece(7,4);
		assertFalse(k.isLegitMove(7,4,7,3));
	}

	@Test
	public void badMoveW3(){
		setUpforKingA();
		King k = (King) Board.getPiece(7,4);
		assertFalse(k.isLegitMove(7,4,6,3));
	}

	@Test
	public void badMoveW4(){
		setUpforKingA();
		King k = (King) Board.getPiece(7,4);
		assertFalse(k.isLegitMove(7,4,6,4));
	}

	@Test
	public void badMoveW5(){
		setUpforKingA();
		King k = (King) Board.getPiece(7,4);
		assertFalse(k.isLegitMove(7,4,6,5));
	}

	@Test
	public void badMoveW6(){
		setUpforKingA();
		King k = (King) Board.getPiece(7,4);
		assertFalse(k.isLegitMove(7,4,7,5));
	}

	@Test
	public void badMoveW7(){
		setUpforKingB();
		King k = (King) Board.getPiece(2,6);
		assertFalse(k.isLegitMove(2,6,3,5));
	}

	@Test
	public void badMoveB1(){
		setUpforKingA();
		King k = (King) Board.getPiece(0,4);
		assertFalse(k.isLegitMove(0,4,0,4));
	}

	@Test
	public void badMoveB2(){
		setUpforKingA();
		King k = (King) Board.getPiece(0,4);
		assertFalse(k.isLegitMove(0,4,0,5));
	}

	@Test
	public void badMoveB3(){
		setUpforKingA();
		King k = (King) Board.getPiece(0,4);
		assertFalse(k.isLegitMove(0,4,1,5));
	}

	@Test
	public void badMoveB4(){
		setUpforKingA();
		King k = (King) Board.getPiece(0,4);
		assertFalse(k.isLegitMove(0,4,1,4));
	}

	@Test
	public void badMoveB5(){
		setUpforKingA();
		King k = (King) Board.getPiece(0,4);
		assertFalse(k.isLegitMove(0,4,1,3));
	}

	@Test
	public void badMoveB6(){
		setUpforKingA();
		King k = (King) Board.getPiece(0,4);
		assertFalse(k.isLegitMove(0,4,0,3));
	}

	@Test
	public void goodMoveB1(){
		setUpforKingB();
		King k = (King) Board.getPiece(3,2);
		assertTrue(k.isLegitMove(3,2,3,1));
	}

	@Test
	public void goodMoveB2(){
		setUpforKingB();
		King k = (King) Board.getPiece(3,2);
		assertTrue(k.isLegitMove(3,2,2,1));
	}

	@Test
	public void goodMoveB3(){
		setUpforKingB();
		King k = (King) Board.getPiece(3,2);
		assertTrue(k.isLegitMove(3,2,2,2));
	}

	@Test
	public void goodMoveB4(){
		setUpforKingB();
		King k = (King) Board.getPiece(3,2);
		assertTrue(k.isLegitMove(3,2,3,3));
	}

	@Test
	public void goodMoveB5(){
		setUpforKingB();
		King k = (King) Board.getPiece(3,2);
		assertTrue(k.isLegitMove(3,2,4,3));
	}

	@Test
	public void goodMoveB6(){
		setUpforKingB();
		King k = (King) Board.getPiece(3,2);
		assertTrue(k.isLegitMove(3,2,4,2));
	}

	@Test
	public void goodMoveB7(){
		setUpforKingB();
		King k = (King) Board.getPiece(3,2);
		assertTrue(k.isLegitMove(3,2,4,1));
	}

	@Test
	public void goodMoveW1(){
		setUpforKingB();
		King k = (King) Board.getPiece(2,6);
		assertTrue(k.isLegitMove(2,6,1,6));
	}

	@Test
	public void goodMoveW2(){
		setUpforKingB();
		King k = (King) Board.getPiece(2,6);
		assertTrue(k.isLegitMove(2,6,1,7));
	}

	@Test
	public void goodMoveW3(){
		setUpforKingB();
		King k = (King) Board.getPiece(2,6);
		assertTrue(k.isLegitMove(2,6,2,7));
	}

	@Test
	public void goodMoveW4(){
		setUpforKingB();
		King k = (King) Board.getPiece(2,6);
		assertTrue(k.isLegitMove(2,6,3,6));
	}

	@Test
	public void goodMoveW5(){
		setUpforKingB();
		King k = (King) Board.getPiece(2,6);
		assertTrue(k.isLegitMove(2,6,2,5));
	}
}
