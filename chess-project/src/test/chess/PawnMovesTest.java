package chess;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PawnMovesTest {

	@Before
	public void initBoard() {
		Board.initialiseBoard();
	}

	public void setUpforPawnA(){
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

	public void setUpforPawnB(){
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
		Board.setPiece(2,1,new Pawn(PieceColour.BLACK));
		Board.setPiece(3,2,new Pawn(PieceColour.BLACK));
		Board.setPiece(1,3,new Pawn(PieceColour.BLACK));
		Board.setPiece(3,4,new Pawn(PieceColour.BLACK));
		Board.setPiece(3,5,new Pawn(PieceColour.BLACK));
		Board.setPiece(1,6,new Pawn(PieceColour.BLACK));
		Board.setPiece(1,7,new Pawn(PieceColour.BLACK));

		//White pieces
		Board.setPiece(6,0,new Pawn(PieceColour.WHITE));
		Board.setPiece(6,1,new Pawn(PieceColour.WHITE));
		Board.setPiece(4,2,new Pawn(PieceColour.WHITE));
		Board.setPiece(5,3,new Pawn(PieceColour.WHITE));
		Board.setPiece(4,4,new Pawn(PieceColour.WHITE));
		Board.setPiece(6,5,new Pawn(PieceColour.WHITE));
		Board.setPiece(6,6,new Pawn(PieceColour.WHITE));
		Board.setPiece(5,7,new Pawn(PieceColour.WHITE));
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
	public void badMoveW1() {
		setUpforPawnB();
		Pawn p = (Pawn) Board.getPiece(4,2);
		assertFalse(p.isLegitMove(4,2,3,2));
	}

	@Test
	public void badMoveW2() {
		setUpforPawnB();
		Pawn p = (Pawn) Board.getPiece(5,3);
		assertFalse(p.isLegitMove(5,3,6,3));
	}

	@Test
	public void badMoveW3() {
		setUpforPawnB();
		Pawn p = (Pawn) Board.getPiece(4,4);
		assertFalse(p.isLegitMove(4,4,5,6));
	}

	@Test
	public void badMoveW4() {
		setUpforPawnB();
		Pawn p = (Pawn) Board.getPiece(4,2);
		assertFalse(p.isLegitMove(4,2,2,2));
	}

	@Test
	public void badMoveW5() {
		setUpforPawnB();
		Pawn p = (Pawn) Board.getPiece(5,3);
		assertFalse(p.isLegitMove(5,3,4,4));
	}

	@Test
	public void badMoveW6() {
		setUpforPawnB();
		Pawn p = (Pawn) Board.getPiece(4,4);
		assertFalse(p.isLegitMove(4,4,3,4));
	}

	@Test
	public void badMoveW7() {
		setUpforPawnB();
		Pawn p = (Pawn) Board.getPiece(4,2);
		assertFalse(p.isLegitMove(4,2,3,3));
	}

	@Test
	public void badMoveW8() {
		setUpforPawnB();
		Pawn p = (Pawn) Board.getPiece(5,3);
		assertFalse(p.isLegitMove(5,3,3,3));
	}

	@Test
	public void badMoveW9() {
		setUpforPawnB();
		Pawn p = (Pawn) Board.getPiece(4,4);
		assertFalse(p.isLegitMove(4,4,2,4));
	}

	@Test
	public void goodMoveB1() {
		setUpforPawnB();
		Pawn p = (Pawn) Board.getPiece(2,1);
		assertTrue(p.isLegitMove(2,1,3,1));
	}

	@Test
	public void goodMoveB2() {
		setUpforPawnB();
		Pawn p = (Pawn) Board.getPiece(3,5);
		assertTrue(p.isLegitMove(3,5,4,5));
	}

	@Test
	public void goodMoveB3() {
		setUpforPawnB();
		Pawn p = (Pawn) Board.getPiece(3,5);
		assertTrue(p.isLegitMove(3,5,4,4));
	}

	@Test
	public void goodMoveW1() {
		setUpforPawnB();
		Pawn p = (Pawn) Board.getPiece(5,3);
		assertTrue(p.isLegitMove(5,3,4,3));
	}

	@Test
	public void goodMoveW2() {
		setUpforPawnB();
		Pawn p = (Pawn) Board.getPiece(4,4);
		assertTrue(p.isLegitMove(4,4,3,5));
	}

	@Test
	public void goodMoveW3() {
		setUpforPawnB();
		Pawn p = (Pawn) Board.getPiece(5,7);
		assertTrue(p.isLegitMove(5,7,4,7));
	}

	@Test
	public void badMoveB1() {
		setUpforPawnB();
		Pawn p = (Pawn) Board.getPiece(3,2);
		assertFalse(p.isLegitMove(3,2,3,2));
	}

	@Test
	public void badMoveB2() {
		setUpforPawnB();
		Pawn p = (Pawn) Board.getPiece(3,4);
		assertFalse(p.isLegitMove(3,4,4,4));
	}

	@Test
	public void badMoveB3() {
		setUpforPawnB();
		Pawn p = (Pawn) Board.getPiece(3,5);
		assertFalse(p.isLegitMove(3,5,3,4));
	}

	@Test
	public void badMoveB4() {
		setUpforPawnB();
		Pawn p = (Pawn) Board.getPiece(3,5);
		assertFalse(p.isLegitMove(3,5,2,5));
	}

	@Test
	public void badMoveB5() {
		setUpforPawnB();
		Pawn p = (Pawn) Board.getPiece(3,4);
		assertFalse(p.isLegitMove(3,4,2,4));
	}

	@Test
	public void badMoveB6() {
		setUpforPawnB();
		Pawn p = (Pawn) Board.getPiece(3,5);
		assertFalse(p.isLegitMove(3,5,5,5));
	}

	@Test
	public void badMoveB7() {
		setUpforPawnB();
		Pawn p = (Pawn) Board.getPiece(2,1);
		assertFalse(p.isLegitMove(2,1,4,1));
	}

	@Test
	public void badMoveB8() {
		setUpforPawnB();
		Pawn p = (Pawn) Board.getPiece(3,4);
		assertFalse(p.isLegitMove(3,4,4,3));
	}


	@Test
	public void badfirstMoveW1() {
		setUpforPawnA();
		Pawn p = (Pawn) Board.getPiece(6,0);
		assertFalse(p.isLegitMove(6,0,6,0));
	}

	@Test
	public void badfirstMoveW2() {
		setUpforPawnA();
		Pawn p = (Pawn) Board.getPiece(6,1);
		assertFalse(p.isLegitMove(6,1,7,1));
	}

	@Test
	public void badfirstMoveW3() {
		setUpforPawnA();
		Pawn p = (Pawn) Board.getPiece(6,2);
		assertFalse(p.isLegitMove(6,2,6,1));
	}

	@Test
	public void badfirstMoveW4() {
		setUpforPawnA();
		Pawn p = (Pawn) Board.getPiece(6,3);
		assertFalse(p.isLegitMove(6,3,6,4));
	}

	@Test
	public void badfirstMoveW5() {
		setUpforPawnA();
		Pawn p = (Pawn) Board.getPiece(6,5);
		assertFalse(p.isLegitMove(6,5,7,5));
	}

	@Test
	public void badfirstMoveW6() {
		setUpforPawnA();
		Pawn p = (Pawn) Board.getPiece(6,6);
		assertFalse(p.isLegitMove(6,6,5,7));
	}

	@Test
	public void badfirstMoveW7() {
		setUpforPawnA();
		Pawn p = (Pawn) Board.getPiece(6,4);
		assertFalse(p.isLegitMove(6,4,3,4));
	}


	@Test
	public void goodfirstMoveW1() {
		setUpforPawnA();
		Pawn p = (Pawn) Board.getPiece(6,0);
		assertTrue(p.isLegitMove(6,0,5,0));
	}

	@Test
	public void goodfirstMoveW2() {
		setUpforPawnA();
		Pawn p = (Pawn) Board.getPiece(6,2);
		assertTrue(p.isLegitMove(6,2,4,2));
	}

	@Test
	public void goodfirstMoveW3() {
		setUpforPawnA();
		Pawn p = (Pawn) Board.getPiece(6,4);
		assertTrue(p.isLegitMove(6,4,5,4));
	}

	@Test
	public void goodfirstMoveW4() {
		setUpforPawnA();
		Pawn p = (Pawn) Board.getPiece(6,7);
		assertTrue(p.isLegitMove(6,7,4,7));
	}

	@Test
	public void badfirstMoveB1() {
		setUpforPawnA();
		Pawn p = (Pawn) Board.getPiece(1,1);
		assertFalse(p.isLegitMove(1,1,1,1));
	}

	@Test
	public void badfirstMoveB2() {
		setUpforPawnA();
		Pawn p = (Pawn) Board.getPiece(1,2);
		assertFalse(p.isLegitMove(1,2,1,5));
	}

	@Test
	public void badfirstMoveB3() {
		setUpforPawnA();
		Pawn p = (Pawn) Board.getPiece(1,3);
		assertFalse(p.isLegitMove(1,3,1,4));
	}

	@Test
	public void badfirstMoveB4() {
		setUpforPawnA();
		Pawn p = (Pawn) Board.getPiece(1,4);
		assertFalse(p.isLegitMove(1,4,1,3));
	}

	@Test
	public void badfirstMoveB5() {
		setUpforPawnA();
		Pawn p = (Pawn) Board.getPiece(1,5);
		assertFalse(p.isLegitMove(1,5,0,5));
	}

	@Test
	public void badfirstMoveB6() {
		setUpforPawnA();
		Pawn p = (Pawn) Board.getPiece(1,6);
		assertFalse(p.isLegitMove(1,6,0,7));
	}

	@Test
	public void badfirstMoveB7() {
		setUpforPawnA();
		Pawn p = (Pawn) Board.getPiece(1,7);
		assertFalse(p.isLegitMove(1,7,0,6));
	}

	@Test
	public void badfirstMoveB8() {
		setUpforPawnA();
		Pawn p = (Pawn) Board.getPiece(1,5);
		assertFalse(p.isLegitMove(1,5,5,1));
	}

	@Test
	public void badfirstMoveB9() {
		setUpforPawnA();
		Pawn p = (Pawn) Board.getPiece(1,4);
		assertFalse(p.isLegitMove(1,4,2,2));
	}


	@Test
	public void goodfirstMoveB2() {
		setUpforPawnA();
		Pawn p = (Pawn) Board.getPiece(1,3);
		assertTrue(p.isLegitMove(1,3,3,3));
	}

	@Test
	public void goodfirstMoveB3() {
		setUpforPawnA();
		Pawn p = (Pawn) Board.getPiece(1,4);
		assertTrue(p.isLegitMove(1,4,2,4));
	}

	@Test
	public void goodfirstMoveB4() {
		setUpforPawnA();
		Pawn p = (Pawn) Board.getPiece(1,5);
		assertTrue(p.isLegitMove(1,5,3,5));
	}

	@Test
	public void goodfirstMoveB5() {
		setUpforPawnA();
		Pawn p = (Pawn) Board.getPiece(1,7);
		assertTrue(p.isLegitMove(1,7,2,7));
	}

	@Test
	public void goodfirstMoveB6() {
		setUpforPawnA();
		Pawn p = (Pawn) Board.getPiece(1,7);
		assertTrue(p.isLegitMove(1,7,3,7));
	}
}
