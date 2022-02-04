package chess;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.Test;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class BoardTest{
    private final static int boardT=8;
    private static int brd=0;//square tests


    	@Test
    	public void boardIsStatic() {
            try {
            	Class <?> cls = Class.forName("chess.Board");
    			Field f=cls.getDeclaredField("board");
            	assertTrue(Modifier.isStatic(f.getModifiers()));
            	if (Modifier.isStatic(f.getModifiers())) {
            		System.out.println("board in Board is static: CORRECT");
    				brd++;
            	}
            	else {
            		System.out.println("board in Board is static: INCORRECT");
            	}

    		}
            catch (ClassNotFoundException e) {
    			e.printStackTrace();
        	}
    		catch (NoSuchFieldException e) {
        		System.out.println("board in Board exists: INCORRECT");
    			fail();
    		}
    		catch (SecurityException e) {
    			e.printStackTrace();
    		}
    	}

    	@Test
    	public void boardStaticMethod_1Test() {
            try {
            	Class <?> cls = Class.forName("chess.Board");
    			Method m=cls.getDeclaredMethod("initialiseBoard");
            	assertTrue(Modifier.isStatic(m.getModifiers()));
    			if (Modifier.isStatic(m.getModifiers())){
    				brd++;
    				System.out.println("initialiseBoard() exists and is static: CORRECT");

    			}
    			else {
    				System.out.println("initialiseBoard() exists and is static: INCORRECT");
    			}
    		}
            catch (ClassNotFoundException e) {e.printStackTrace();}
        	catch (NoSuchMethodException e) {
        		System.out.println("initialiseBoard() exists: INCORRECT");
        		fail();
        	}
    		catch (SecurityException e) {e.printStackTrace();}
    	}

    	@Test
    	public void boardStaticMethod_2Test() {
            try {
            	Class <?> cls = Class.forName("chess.Board");
    			Method m=cls.getDeclaredMethod("initialisePieces");
            	assertTrue(Modifier.isStatic(m.getModifiers()));
            	if (Modifier.isStatic(m.getModifiers())) {
    				brd++;
            		System.out.println("initialisePieces() exists and is static: CORRECT");
            	}
            	else {
            		System.out.println("initialisePieces() exists and is static: INCORRECT");
            	}
    		}
            catch (ClassNotFoundException e) {e.printStackTrace();}
        	catch (NoSuchMethodException e) {
        		System.out.println("initialisePieces() exists: INCORRECT");
        		fail();
        	}
            catch (SecurityException e) {e.printStackTrace();}
    	}

    	@Test
    	public void boardStaticMethod_3Test() {
            try {
            	Class <?> cls = Class.forName("chess.Board");
    			Method m=cls.getDeclaredMethod("printBoard");
            	assertTrue(Modifier.isStatic(m.getModifiers()));
            	if (Modifier.isStatic(m.getModifiers())) {
    				brd++;
            		System.out.println("printBoard() exists and is static: CORRECT");
            	}
            	else {
            		System.out.println("printBoard() exists and is static: INCORRECT");
            	}
    		}
            catch (ClassNotFoundException e) {e.printStackTrace();}
           	catch (NoSuchMethodException e) {
        		System.out.println("printBoard() exists: INCORRECT");
        		fail();
        	}
            catch (SecurityException e) {e.printStackTrace();}
    	}

    	@Test
    	public void boardStaticMethod_4Test() {
            try {
            	Class <?> cls = Class.forName("chess.Board");
    			Method m=cls.getDeclaredMethod("movePiece",int.class,int.class,int.class,int.class,Piece.class);
            	assertTrue(Modifier.isStatic(m.getModifiers()));
            	if (Modifier.isStatic(m.getModifiers())) {
    				brd++;
            		System.out.println("movePiece() exists and is static: CORRECT");
            	}
            	else {
            		System.out.println("movePiece() exists and is static: INCORRECT");
            	}
    		}
            catch (ClassNotFoundException e) {e.printStackTrace();}
         	catch (NoSuchMethodException e) {
        		System.out.println("movePiece exists: INCORRECT");
        		fail();
        	}
            catch (SecurityException e) {e.printStackTrace();}
    	}

    	@Test
    	public void boardStaticMethod_5Test() {
            try {
            	Class <?> cls = Class.forName("chess.Board");
    			Method m=cls.getDeclaredMethod("setPiece",int.class,int.class,Piece.class);
            	assertTrue(Modifier.isStatic(m.getModifiers()));
               	if (Modifier.isStatic(m.getModifiers())) {
    				brd++;
            		System.out.println("setPiece() exists and is static: CORRECT");
            	}
            	else {
            		System.out.println("setPiece() exists and is static: INCORRECT");
            	}
    		}
            catch (ClassNotFoundException e) {e.printStackTrace();}
            catch (NoSuchMethodException e) {
        		System.out.println("setPiece exists: INCORRECT");
        		fail();
        	}
            catch (SecurityException e) {e.printStackTrace();}
    	}

    	@Test
    	public void boardStaticMethod_6Test() {
            try {
            	Class <?> cls = Class.forName("chess.Board");
    			Method m=cls.getDeclaredMethod("getPiece",int.class,int.class);
            	assertTrue(Modifier.isStatic(m.getModifiers()));
            	if (Modifier.isStatic(m.getModifiers())) {
    				brd++;
            		System.out.println("getPiece() exists and is static: CORRECT");
            	}
            	else {
            		System.out.println("getPiece() exists and is static: INCORRECT");
            	}
    		}
            catch (ClassNotFoundException e) {e.printStackTrace();}
            catch (NoSuchMethodException e) {
        		System.out.println("getPiece exists: INCORRECT");
        		fail();
        	}
            catch (SecurityException e) {e.printStackTrace();}
    	}

    	@Test
    	public void boardStaticMethod_7Test() {
            try {
            	Class <?> cls = Class.forName("chess.Board");
    			Method m=cls.getDeclaredMethod("hasPiece",int.class,int.class);
            	assertTrue(Modifier.isStatic(m.getModifiers()));
            	if (Modifier.isStatic(m.getModifiers())) {
    				brd++;
            		System.out.println("hasPiece() exists and is static: CORRECT");
            	}
            	else {
            		System.out.println("hasPiece() exists and is static: INCORRECT");
            	}
    		}
            catch (ClassNotFoundException e) {e.printStackTrace();}
            catch (NoSuchMethodException e) {
        		System.out.println("hasPiece exists: INCORRECT");
        		fail();
        	}
            catch (SecurityException e) {e.printStackTrace();}
    	}
        @AfterClass
        public static void printResults() {
            System.out.println("===========================================");
            int b=boardT-(boardT-brd);
            System.out.println("Board tests passed: "+b+"/"+boardT);
            System.out.println("===========================================");
        }
}
