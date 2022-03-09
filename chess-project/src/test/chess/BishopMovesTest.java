package chess;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BishopMovesTest {

	@Before
	public void initBoard() {
		Board.initialiseBoard();
	}

	public void setUpforBishopA(){
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
		Board.setPiece(3,3,new Pawn(PieceColour.BLACK));
		Board.setPiece(1,4,new Pawn(PieceColour.BLACK));
		Board.setPiece(1,5,new Pawn(PieceColour.BLACK));
		Board.setPiece(1,6,new Pawn(PieceColour.BLACK));
		Board.setPiece(1,7,new Pawn(PieceColour.BLACK));

		//White pieces
		Board.setPiece(6,0,new Pawn(PieceColour.WHITE));
		Board.setPiece(6,1,new Pawn(PieceColour.WHITE));
		Board.setPiece(6,2,new Pawn(PieceColour.WHITE));
		Board.setPiece(4,3,new Pawn(PieceColour.WHITE));
		Board.setPiece(4,4,new Pawn(PieceColour.WHITE));
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

	public void setUpforBishopB(){
		//Black pieces
		Board.setPiece(0,0,new Rook(PieceColour.BLACK));
		Board.setPiece(0,1,new Knight(PieceColour.BLACK));
		Board.setPiece(2,0,new Bishop(PieceColour.BLACK));
		Board.setPiece(0,3,new Queen(PieceColour.BLACK));
		Board.setPiece(0,4,new King(PieceColour.BLACK));
		Board.setPiece(0,5,new Bishop(PieceColour.BLACK));
		Board.setPiece(0,6,new Knight(PieceColour.BLACK));
		Board.setPiece(0,7,new Rook(PieceColour.BLACK));
		Board.setPiece(1,0,new Pawn(PieceColour.BLACK));
		Board.setPiece(1,1,new Pawn(PieceColour.BLACK));
		Board.setPiece(1,2,new Pawn(PieceColour.BLACK));
		Board.setPiece(3,3,new Pawn(PieceColour.BLACK));
		Board.setPiece(1,4,new Pawn(PieceColour.BLACK));
		Board.setPiece(1,5,new Pawn(PieceColour.BLACK));
		Board.setPiece(1,6,new Pawn(PieceColour.BLACK));
		Board.setPiece(1,7,new Pawn(PieceColour.BLACK));

		//White pieces
		Board.setPiece(6,0,new Pawn(PieceColour.WHITE));
		Board.setPiece(6,1,new Pawn(PieceColour.WHITE));
		Board.setPiece(6,2,new Pawn(PieceColour.WHITE));
		Board.setPiece(4,3,new Pawn(PieceColour.WHITE));
		Board.setPiece(4,4,new Pawn(PieceColour.WHITE));
		Board.setPiece(6,5,new Pawn(PieceColour.WHITE));
		Board.setPiece(6,6,new Pawn(PieceColour.WHITE));
		Board.setPiece(6,7,new Pawn(PieceColour.WHITE));
		Board.setPiece(7,0,new Rook(PieceColour.WHITE));
		Board.setPiece(7,1,new Knight(PieceColour.WHITE));
		Board.setPiece(2,7,new Bishop(PieceColour.WHITE));
		Board.setPiece(7,3,new Queen(PieceColour.WHITE));
		Board.setPiece(7,4,new King(PieceColour.WHITE));
		Board.setPiece(7,5,new Bishop(PieceColour.WHITE));
		Board.setPiece(7,6,new Knight(PieceColour.WHITE));
		Board.setPiece(7,7,new Rook(PieceColour.WHITE));
	}

	@Test
	public void badMoveW0() {
		setUpforBishopA();
		Bishop b1 = (Bishop) Board.getPiece(7,5);
		assertFalse(b1.isLegitMove(7,5,0,0));
	}

	@Test
	public void badMoveW1() {
		setUpforBishopA();
		Bishop b1 = (Bishop) Board.getPiece(7,5);
		assertFalse(b1.isLegitMove(7,5,7,5));
	}

	@Test
	public void badMoveB() {
		setUpforBishopA();
		Bishop b1 = (Bishop) Board.getPiece(0,2);
		assertFalse(b1.isLegitMove(0,2,0,2));
	}

	@Test
	public void badMove2() {//vertical move of more than one to empty space, whites
		setUpforBishopA();
		Bishop b1 = (Bishop) Board.getPiece(7,5);
		assertFalse(b1.isLegitMove(7,5,5,5));
	}

	@Test
	public void badMove3() {//vertical move of more than one to black pieces, whites
		setUpforBishopA();
		Bishop b1 = (Bishop) Board.getPiece(7,5);
		assertFalse(b1.isLegitMove(7,5,0,5));
	}

	@Test
	public void badMove4() {//random move, whites
		setUpforBishopA();
		Bishop b1 = (Bishop) Board.getPiece(7,5);
		assertFalse(b1.isLegitMove(7,5,4,7));
	}

	@Test
	public void badMove5() {//move one right, whites
		setUpforBishopA();
		Bishop b1 = (Bishop) Board.getPiece(7,5);
		assertFalse(b1.isLegitMove(7,5,7,6));
	}

	@Test
	public void badMove6() {//swap whites
		setUpforBishopA();
		Bishop b1 = (Bishop) Board.getPiece(7,5);
		assertFalse(b1.isLegitMove(7,5,7,2));
	}

	@Test
	public void badMove7() {//swap whites
		setUpforBishopA();
		Bishop b1 = (Bishop) Board.getPiece(7,5);
		assertFalse(b1.isLegitMove(7,5,7,6));
	}

	@Test
	public void badMove8() {//swap whites
		setUpforBishopA();
		Bishop b1 = (Bishop) Board.getPiece(7,5);
		assertFalse(b1.isLegitMove(7,5,6,5));
	}

	@Test
	public void goodMoveNW() {
		setUpforBishopA();
		Bishop b1 = (Bishop) Board.getPiece(7,5);
		assertTrue(b1.isLegitMove(7,5,2,0));
	}

	@Test
	public void goodMoveNE() {
		setUpforBishopA();
		Bishop b1 = (Bishop) Board.getPiece(7,2);
		assertTrue(b1.isLegitMove(7,2,2,7));
	}

	@Test
	public void goodMoveSE() {
		setUpforBishopA();
		Bishop b1 = (Bishop) Board.getPiece(0,2);
		assertTrue(b1.isLegitMove(0,2,1,3));
	}

	@Test
	public void badMoveNE() {
		setUpforBishopA();
		Bishop b1 = (Bishop) Board.getPiece(7,5);
		assertFalse(b1.isLegitMove(7,5,6,6));
	}

	@Test
	public void badMoveSE() {
		setUpforBishopA();
		Bishop b1 = (Bishop) Board.getPiece(0,5);
		assertFalse(b1.isLegitMove(0,5,2,7));
	}

	@Test
	public void goodMoveSW() {
		setUpforBishopA();
		Pawn p1 = (Pawn) Board.getPiece(1,4);
		Board.movePiece(1, 4, 3, 4, p1);
		Bishop b1 = (Bishop) Board.getPiece(0,5);
		assertTrue(b1.isLegitMove(0,5,3,2));
	}

	@Test
	public void goodMove1() {
		setUpforBishopB();
		Bishop b1 = (Bishop) Board.getPiece(2,0);
		assertTrue(b1.isLegitMove(2,0,3,1));
	}

	@Test
	public void goodMove2() {
		setUpforBishopB();
		Bishop b1 = (Bishop) Board.getPiece(2,0);
		assertTrue(b1.isLegitMove(2,0,7,5));
	}

	@Test
	public void goodMove3() {
		setUpforBishopB();
		Bishop b1 = (Bishop) Board.getPiece(2,7);
		assertTrue(b1.isLegitMove(2,7,1,6));
	}

	@Test
	public void goodMove4() {
		setUpforBishopB();
		Bishop b1 = (Bishop) Board.getPiece(2,7);
		assertTrue(b1.isLegitMove(2,7,4,5));
	}

	@Test
	public void badMoveSW() {
		setUpforBishopA();
		Bishop b1 = (Bishop) Board.getPiece(0,2);
		assertFalse(b1.isLegitMove(0,2,1,1));
	}

	@Test
	public void badMove9() {
		setUpforBishopB();
		Bishop b1 = (Bishop) Board.getPiece(2,0);
		assertFalse(b1.isLegitMove(2,0,3,2));
	}

	@Test
	public void badMove10() {
		setUpforBishopB();
		Bishop b1 = (Bishop) Board.getPiece(2,0);
		assertFalse(b1.isLegitMove(2,0,2,2));
	}

	@Test
	public void badMove11() {
		setUpforBishopB();
		Bishop b1 = (Bishop) Board.getPiece(2,0);
		assertFalse(b1.isLegitMove(2,0,1,1));
	}

	@Test
	public void badMove12() {
		setUpforBishopB();
		Bishop b1 = (Bishop) Board.getPiece(2,7);
		assertFalse(b1.isLegitMove(2,7,1,7));
	}

	@Test
	public void badMove13() {
		setUpforBishopB();
		Bishop b1 = (Bishop) Board.getPiece(2,7);
		assertFalse(b1.isLegitMove(2,7,0,5));
	}

	@Test
	public void badMove14() {
		setUpforBishopB();
		Bishop b1 = (Bishop) Board.getPiece(2,7);
		assertFalse(b1.isLegitMove(2,7,2,0));
	}
}
