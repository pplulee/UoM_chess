package chess;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import java.lang.reflect.Modifier;

public class PawnSpecsTest {

	@Test
	public void pawnConstructorDefinitionTest() {
		try {
			Class <?> cls = Class.forName("chess.Pawn");
			assertEquals(cls.getDeclaredConstructor(PieceColour.class).toString(),"public chess.Pawn(chess.PieceColour)");
			if (cls.getDeclaredConstructor(PieceColour.class).toString().equals("public chess.Pawn(chess.PieceColour)")){
				System.out.println("The Pawn constructor is defined according to the specifications: CORRECT");
			}
			else {
				System.out.println("The Pawn constructor is defined according to the specifications: INCORRECT");
			}
		}
		catch (NoSuchMethodException e) {
			System.out.println("The Pawn constructor is defined according to the specifications: INCORRECT");
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
			Class <?> cls = Class.forName("chess.Pawn");
			Class [] args = new Class[4];
			args[0]= int.class;args[1]= int.class;args[2]= int.class;args[3]= int.class;
			assertEquals(cls.getMethod("isLegitMove",args).toString(),"public boolean chess.Pawn.isLegitMove(int,int,int,int)");
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
	public void pawnPublicTest() {
		try {
			Class <?> cls = Class.forName("chess.Pawn");
			assertTrue(Modifier.isPublic(cls.getModifiers()));
			if (Modifier.isPublic(cls.getModifiers())) {
				System.out.println("The Pawn class is public: CORRECT");
			}
		}
		catch (ClassNotFoundException e) {
			System.out.println("The Pawn class is public: INCORRECT");
			fail();
		}
	}


	@Test
	public void pawnSubclassofPieceTest() {
        try {
        	Class <?> cls = Class.forName("chess.Pawn");
        	assertEquals(cls.getSuperclass().getSimpleName(),"Piece");
        	if (cls.getSuperclass().getSimpleName().equals("Piece")) {
        		System.out.println("Pawn is subclass of Piece: CORRECT");
        	}
        	else {
        		System.out.println("Pawn is subclass of Piece: INCORRECT");
        	}
		}
        catch (ClassNotFoundException e) {
    		System.out.println("Pawn exists: INCORRECT");
    		fail();
        }
        catch (SecurityException e) {e.printStackTrace();}
	}
}
