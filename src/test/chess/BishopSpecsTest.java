package chess;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import java.lang.reflect.Modifier;

public class BishopSpecsTest {

	@Test
	public void bishopConstructorDefinitionTest() {
        try {
        	Class <?> cls = Class.forName("chess.Bishop");
			assertEquals(cls.getConstructor(PieceColour.class).toString(),"public chess.Bishop(chess.PieceColour)");
        	if (cls.getConstructor(PieceColour.class).toString().equals("public chess.Bishop(chess.PieceColour)")){
        		System.out.println("The Bishop constructor is defined according to the specifications: CORRECT");
        	}
        	else {
        		System.out.println("The Bishop constructor is defined according to the specifications: INCORRECT");
        	}
		}
   	 	catch (NoSuchMethodException e) {
    		System.out.println("The Bishop constructor is defined according to the specifications: INCORRECT");
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
			Class <?> cls = Class.forName("chess.Bishop");
			Class [] args = new Class[4];
			args[0]= int.class;args[1]= int.class;args[2]= int.class;args[3]= int.class;
			assertEquals(cls.getMethod("isLegitMove",args).toString(),"public boolean chess.Bishop.isLegitMove(int,int,int,int)");
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
	public void bishopPublicTest() {
	    try {
	        Class <?> cls = Class.forName("chess.Bishop");
	        assertTrue(Modifier.isPublic(cls.getModifiers()));
	        if (Modifier.isPublic(cls.getModifiers())) {
	            System.out.println("The Bishop class is public: CORRECT");
	        }
	    }
	    catch (ClassNotFoundException e) {
	        System.out.println("The Bishop class is public: INCORRECT");
	        fail();
	    }
	}

	@Test
	public void bishopSubclassofPieceTest() {
        try {
        	Class <?> cls = Class.forName("chess.Bishop");
        	assertEquals(cls.getSuperclass().getSimpleName(),"Piece");
        	if (cls.getSuperclass().getSimpleName().equals("Piece")) {
        		System.out.println("Bishop is subclass of Piece: CORRECT");
        	}
        	else {
        		System.out.println("Bishop is subclass of Piece: INCORRECT");
        	}
		}
        catch (ClassNotFoundException e) {
    		System.out.println("Bishop exists: INCORRECT");
    		fail();
        }
        catch (SecurityException e) {e.printStackTrace();}
	}
}
