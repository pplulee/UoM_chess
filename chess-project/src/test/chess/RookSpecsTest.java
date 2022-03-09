package chess;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import java.lang.reflect.Modifier;


public class RookSpecsTest {

	@Test
	public void rookConsTest() {
		try {
			Class <?> cls = Class.forName("chess.Rook");
			assertEquals(cls.getConstructor(PieceColour.class).toString(),"public chess.Rook(chess.PieceColour)");
			if (cls.getConstructor(PieceColour.class).toString().equals("public chess.Rook(chess.PieceColour)")){
				System.out.println("The Rook constructor is defined according to the specifications: CORRECT");
			}
			else {
				System.out.println("The Rook constructor is defined according to the specifications: INCORRECT");
			}
		}
		catch (NoSuchMethodException e) {
			System.out.println("The Rook constructor is defined according to the specifications: INCORRECT");
			fail();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SecurityException e) {e.printStackTrace();}
	}

	@Test
	public void isLegitDefinition() {
		try {
			Class <?> cls = Class.forName("chess.Rook");
			Class [] args = new Class[4];
			args[0]= int.class;args[1]= int.class;args[2]= int.class;args[3]= int.class;
			assertEquals(cls.getMethod("isLegitMove",args).toString(),"public boolean chess.Rook.isLegitMove(int,int,int,int)");
		}
		catch (NoSuchMethodException e) {
			System.out.println("The isLegit method is defined according to the specifications: INCORRECT");
			fail();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SecurityException e) {e.printStackTrace();}
	}

	@Test
	public void rookPublicTest() {
	    try {
	        Class <?> cls = Class.forName("chess.Rook");
	        assertTrue(Modifier.isPublic(cls.getModifiers()));
	        if (Modifier.isPublic(cls.getModifiers())) {
	            System.out.println("The Rook class is public: CORRECT");
	        }
	    }
	    catch (ClassNotFoundException e) {
	        System.out.println("The Rook class is public: INCORRECT");
	        fail();
	    }
	}

	@Test
	public void rookSubclassofPieceTest() {
		try {
			Class <?> cls = Class.forName("chess.Rook");
			assertEquals(cls.getSuperclass().getSimpleName(),"Piece");
			if (cls.getSuperclass().getSimpleName().equals("Piece")) {
				System.out.println("Rook is subclass of Piece: CORRECT");
			}
			else {
				System.out.println("Rook is subclass of Piece: INCORRECT");
			}
		}
		catch (ClassNotFoundException e) {
			System.out.println("Rook exists: INCORRECT");
			fail();
		}
		catch (SecurityException e) {e.printStackTrace();}
	}
}
