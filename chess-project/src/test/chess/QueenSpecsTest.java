package chess;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import java.lang.reflect.Modifier;

public class QueenSpecsTest {

	@Test
	public void queenConstructorDefinitionTest() {
        try {
        	Class <?> cls = Class.forName("chess.Queen");
			assertEquals(cls.getConstructor(PieceColour.class).toString(),"public chess.Queen(chess.PieceColour)");
        	if (cls.getConstructor(PieceColour.class).toString().equals("public chess.Queen(chess.PieceColour)")){
        		System.out.println("The Queen constructor is defined according to the specifications: CORRECT");
        	}
        	else {
        		System.out.println("The Queen constructor is defined according to the specifications: INCORRECT");
        	}
		}
   	 	catch (NoSuchMethodException e) {
    		System.out.println("The Queen constructor is defined according to the specifications: INCORRECT");
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
			Class <?> cls = Class.forName("chess.Queen");
			Class [] args = new Class[4];
			args[0]= int.class;args[1]= int.class;args[2]= int.class;args[3]= int.class;
			assertEquals(cls.getMethod("isLegitMove",args).toString(),"public boolean chess.Queen.isLegitMove(int,int,int,int)");
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
	public void queenPublicTest() {
		try {
			Class <?> cls = Class.forName("chess.Queen");
			assertTrue(Modifier.isPublic(cls.getModifiers()));
			if (Modifier.isPublic(cls.getModifiers())) {
				System.out.println("The Queen class is public: CORRECT");
			}
		}
		catch (ClassNotFoundException e) {
			System.out.println("The Queen class is public: INCORRECT");
			fail();
		}
	}

	@Test
	public void queenSubclassofPieceTest() {
        try {
        	Class <?> cls = Class.forName("chess.Queen");
        	assertEquals(cls.getSuperclass().getSimpleName(),"Piece");
        	if (cls.getSuperclass().getSimpleName().equals("Piece")) {
        		System.out.println("Queen is subclass of Piece: CORRECT");
        	}
        	else {
        		System.out.println("Queen is subclass of Piece: INCORRECT");
        	}
		}
        catch (ClassNotFoundException e) {
    		System.out.println("Queen exists: INCORRECT");
    		fail();
        }
        catch (SecurityException e) {e.printStackTrace();}
	}
}
