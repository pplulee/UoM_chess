package chess;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class KnightMovesTest {

	@Before
	public void initBoard() {
		Board.initialiseBoard();
	}

	public void setUpforKnight(){
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

	public void setUpforKnightB(){
		//Black pieces
		Board.setPiece(0,0,new Rook(PieceColour.BLACK));
		Board.setPiece(0,1,new Knight(PieceColour.BLACK));
		Board.setPiece(0,2,new Bishop(PieceColour.BLACK));
		Board.setPiece(0,3,new Queen(PieceColour.BLACK));
		Board.setPiece(0,4,new King(PieceColour.BLACK));
		Board.setPiece(0,5,new Bishop(PieceColour.BLACK));
		Board.setPiece(0,6,new Knight(PieceColour.BLACK));
		Board.setPiece(0,7,new Rook(PieceColour.BLACK));
		Board.setPiece(2,0,new Pawn(PieceColour.BLACK));
		Board.setPiece(1,1,new Pawn(PieceColour.BLACK));
		Board.setPiece(2,2,new Pawn(PieceColour.BLACK));
		Board.setPiece(2,3,new Pawn(PieceColour.BLACK));
		Board.setPiece(2,4,new Pawn(PieceColour.BLACK));
		Board.setPiece(1,5,new Pawn(PieceColour.BLACK));
		Board.setPiece(1,6,new Pawn(PieceColour.BLACK));
		Board.setPiece(1,7,new Pawn(PieceColour.BLACK));

		//White pieces
		Board.setPiece(5,0,new Pawn(PieceColour.WHITE));
		Board.setPiece(6,1,new Pawn(PieceColour.WHITE));
		Board.setPiece(5,2,new Pawn(PieceColour.WHITE));
		Board.setPiece(5,3,new Pawn(PieceColour.WHITE));
		Board.setPiece(5,4,new Pawn(PieceColour.WHITE));
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

	@Test
	public void badMove01() {
		setUpforKnight();
		Knight k = (Knight) Board.getPiece(7,1);
		assertFalse(k.isLegitMove(7,1,7,1));
	}

	@Test
	public void badMove02() {
		setUpforKnight();
		Knight k = (Knight) Board.getPiece(0,6);
		assertFalse(k.isLegitMove(0,6,0,6));
	}

	@Test
	public void badMove1() {//straight up
		setUpforKnight();
		Knight k = (Knight) Board.getPiece(7,1);
		assertFalse(k.isLegitMove(7,1,5,1));
	}

	@Test
	public void badMove2() {//diagonal
		setUpforKnight();
		Knight k = (Knight) Board.getPiece(7,1);
		assertFalse(k.isLegitMove(7,1,5,3));
	}

	@Test
	public void badMove3() {//one right
		setUpforKnight();
		Knight k = (Knight) Board.getPiece(7,1);
		assertFalse(k.isLegitMove(7,1,7,2));
	}

	@Test
	public void badMove4() {//one right
		setUpforKnight();
		Knight k = (Knight) Board.getPiece(7,1);
		assertFalse(k.isLegitMove(7,1,6,0));
	}

	@Test
	public void badMove5() {//one right
		setUpforKnight();
		Knight k = (Knight) Board.getPiece(7,1);
		assertFalse(k.isLegitMove(7,1,0,0));
	}

	//Naming based on the mobility of the clock
	@Test
	public void oneT() {
		setUpforKnight();
		Knight k = (Knight) Board.getPiece(7,1);
		assertTrue(k.isLegitMove(7,1,5,2));
	}

	@Test
	public void oneF() {
		setUpforKnightB();
		Knight k = (Knight) Board.getPiece(7,1);
		assertFalse(k.isLegitMove(7,1,5,2));
	}

	@Test
	public void twoF() {
		setUpforKnight();
		Knight k = (Knight) Board.getPiece(7,1);
		assertFalse(k.isLegitMove(7,1,6,3));
	}

	@Test
	public void twoT() {
		setUpforKnightB();
		Knight k = (Knight) Board.getPiece(7,1);
		assertTrue(k.isLegitMove(7,1,6,3));
	}

	@Test
	public void three() {
		setUpforKnight();
		Knight k = (Knight) Board.getPiece(7,1);
		assertFalse(k.isLegitMove(7,1,7,3));
	}

	@Test
	public void fourF() {
		setUpforKnight();
		Knight k = (Knight) Board.getPiece(0,1);
		assertFalse(k.isLegitMove(0,1,0,3));
	}

	@Test
	public void fourT() {
		setUpforKnightB();
		Knight k = (Knight) Board.getPiece(0,1);
		assertTrue(k.isLegitMove(0,1,1,3));
	}

	@Test
	public void fiveF() {
		setUpforKnightB();
		Knight k = (Knight) Board.getPiece(0,1);
		assertFalse(k.isLegitMove(0,1,1,2));
	}

	@Test
	public void fiveT() {
		setUpforKnight();
		Knight k = (Knight) Board.getPiece(0,6);
		assertTrue(k.isLegitMove(0,6,2,7));
	}

	@Test
	public void six() {
		setUpforKnight();
		Knight k = (Knight) Board.getPiece(0,6);
		assertFalse(k.isLegitMove(0,6,2,6));
	}

	@Test
	public void sevenF() {
		setUpforKnightB();
		Knight k = (Knight) Board.getPiece(0,1);
		assertFalse(k.isLegitMove(0,1,1,0));
	}

	@Test
	public void sevenT() {
		setUpforKnight();
		Knight k = (Knight) Board.getPiece(0,6);
		assertTrue(k.isLegitMove(0,6,2,5));
	}

	@Test
	public void eightF() {
		setUpforKnight();
		Knight k = (Knight) Board.getPiece(0,6);
		assertFalse(k.isLegitMove(0,6,1,4));
	}

	@Test
	public void eightT() {
		setUpforKnightB();
		Knight k = (Knight) Board.getPiece(0,6);
		assertTrue(k.isLegitMove(0,6,1,4));
	}

	@Test
	public void nine() {
		setUpforKnight();
		Knight k = (Knight) Board.getPiece(0,6);
		assertFalse(k.isLegitMove(0,6,0,4));
	}

	@Test
	public void tenF() {
		setUpforKnight();
		Knight k = (Knight) Board.getPiece(7,6);
		assertFalse(k.isLegitMove(7,6,6,4));
	}

	@Test
	public void tenT() {
		setUpforKnightB();
		Knight k = (Knight) Board.getPiece(7,6);
		assertTrue(k.isLegitMove(7,6,6,4));
	}

	@Test
	public void elevenF() {
		setUpforKnightB();
		Knight k = (Knight) Board.getPiece(7,1);
		assertFalse(k.isLegitMove(7,1,5,0));
	}

	@Test
	public void elevenT() {
		setUpforKnight();
		Knight k = (Knight) Board.getPiece(7,1);
		assertTrue(k.isLegitMove(7,1,5,0));
	}

	@Test
	public void twelve() {
		setUpforKnight();
		Knight k = (Knight) Board.getPiece(7,1);
		assertFalse(k.isLegitMove(7,1,5,1));
	}
}
