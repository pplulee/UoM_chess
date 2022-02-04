package chess;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.Test;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class SquareTest{
    private final static int squT=6;
    private static int squ=0;//square tests

    @Test
    public void hasPieceIsPrivateTest() {
        try {
            Class <?> cls = Class.forName("chess.Square");
            Field f=cls.getDeclaredField("hasPiece");
            assertTrue(Modifier.isPrivate(f.getModifiers()));
            if (Modifier.isPrivate(f.getModifiers())) {
                squ++;
                System.out.println("hasPiece in Square is private: CORRECT");
            }
            else {
                System.out.println("hasPiece in Square is private: INCORRECT");

            }
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (NoSuchFieldException e) {
            System.out.println("hasPiece in Piece exists: INCORRECT");
        }
        catch (SecurityException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void pieceIsPrivateTest() {
        try {
            Class <?> cls = Class.forName("chess.Square");
            Field f=cls.getDeclaredField("p");
            assertTrue(Modifier.isPrivate(f.getModifiers()));
            if (Modifier.isPrivate(f.getModifiers())) {
                squ++;
                System.out.println("p in Square is private: CORRECT");
            }
            else {
                System.out.println("p in Square is private: INCORRECT");

            }
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (NoSuchFieldException e) {
            System.out.println("p in Piece exists: INCORRECT");
        }
        catch (SecurityException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void getPieceTest() {
        try {
            Class <?> cls = Class.forName("chess.Square");
            Method m=cls.getDeclaredMethod("getPiece");
            assertTrue(Modifier.isPublic(m.getModifiers()));
            if (Modifier.isPublic(m.getModifiers())) {
                squ++;
                System.out.println("getPiece in Square is public: CORRECT");
            }
            else {
                System.out.println("getPiece in Square is public: INCORRECT");
            }
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (NoSuchMethodException e) {
            System.out.println("getPiece in Square exists: INCORRECT");
            fail();
        }
        catch (SecurityException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void setPieceTest() {
        try {
            Class <?> cls = Class.forName("chess.Square");
            Method m=cls.getDeclaredMethod("setPiece",Piece.class);
            assertTrue(Modifier.isPublic(m.getModifiers()));
            if (Modifier.isPublic(m.getModifiers())) {
                squ++;
                System.out.println("setPiece in Square is public: CORRECT");
            }
            else {
                System.out.println("setPiece in Square is public: INCORRECT");

            }
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (NoSuchMethodException e) {
            System.out.println("setPiece in Square exists: INCORRECT");
            fail();
        }
        catch (SecurityException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void removePieceTest() {
        try {
            Class <?> cls = Class.forName("chess.Square");
            Method m=cls.getDeclaredMethod("removePiece");
            assertTrue(Modifier.isPublic(m.getModifiers()));
            if (Modifier.isPublic(m.getModifiers())) {
                squ++;
                System.out.println("removePiece in Square is public: CORRECT");
            }
            else {
                System.out.println("removePiece in Square is public: INCORRECT");

            }
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (NoSuchMethodException e) {
            System.out.println("removePiece in Square exists: INCORRECT");
            fail();
        }
        catch (SecurityException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void hasPieceTest() {
        try {
            Class <?> cls = Class.forName("chess.Square");
            Method m=cls.getDeclaredMethod("hasPiece");
            assertTrue(Modifier.isPublic(m.getModifiers()));
            if (Modifier.isPublic(m.getModifiers())) {
                squ++;
                System.out.println("hasPiece in Square is public: CORRECT");
            }
            else {
                System.out.println("hasPiece in Square is public: INCORRECT");

            }
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (NoSuchMethodException e) {
            System.out.println("hasPiece in Square exists: INCORRECT");
            fail();
        }
        catch (SecurityException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void squarePublicTest() {
        try {
            Class <?> cls = Class.forName("chess.Square");
            assertTrue(Modifier.isPublic(cls.getModifiers()));
            if (Modifier.isPublic(cls.getModifiers())) {
                System.out.println("Square is public: CORRECT");
            }
        }
        catch (ClassNotFoundException e) {
            System.out.println("Square is public: INCORRECT");
            fail();
        }
    }


    @AfterClass
    public static void printResults() {
        System.out.println("===========================================");
        int s=squT-(squT-squ);
        System.out.println("Square tests passed: "+s+"/"+squT);
        System.out.println("===========================================");

    }
}
