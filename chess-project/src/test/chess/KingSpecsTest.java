package chess;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import java.lang.reflect.Modifier;


public class KingSpecsTest{

	@Test
	public void kingConstructorDefinitionTest() {
		try {
			Class <?> cls = Class.forName("chess.King");
			assertEquals(cls.getDeclaredConstructor(PieceColour.class).toString(),"public chess.King(chess.PieceColour)");
			if (cls.getDeclaredConstructor(PieceColour.class).toString().equals("public chess.King(chess.PieceColour)")){
				System.out.println("The King constructor is defined according to the specifications: CORRECT");
			}
			else {
				System.out.println("The King constructor is defined according to the specifications: INCORRECT");
			}
		}
		catch (NoSuchMethodException e) {
			System.out.println("The King constructor is defined according to the specifications: INCORRECT");
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
			Class <?> cls = Class.forName("chess.King");
			Class [] args = new Class[4];
			args[0]= int.class;args[1]= int.class;args[2]= int.class;args[3]= int.class;
			assertEquals(cls.getMethod("isLegitMove",args).toString(),"public boolean chess.King.isLegitMove(int,int,int,int)");
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
	public void kingPublicTest() {
	    try {
	        Class <?> cls = Class.forName("chess.King");
	        assertTrue(Modifier.isPublic(cls.getModifiers()));
	        if (Modifier.isPublic(cls.getModifiers())) {
	            System.out.println("The King class is public: CORRECT");
	        }
	    }
	    catch (ClassNotFoundException e) {
	        System.out.println("The King class is public: INCORRECT");
	        fail();
	    }
	}

	@Test
	public void kingSubclassofPieceTest() {
		try {
			Class <?> cls = Class.forName("chess.King");
			assertEquals(cls.getSuperclass().getSimpleName(),"Piece");
			if (cls.getSuperclass().getSimpleName().equals("Piece")) {
				System.out.println("King is subclass of Piece: CORRECT");
			}
			else {
				System.out.println("King is subclass of Piece: INCORRECT");
			}
		}
		catch (ClassNotFoundException e) {
			System.out.println("King exists: INCORRECT");
			fail();
		}
		catch (SecurityException e) {e.printStackTrace();}
	}
}
