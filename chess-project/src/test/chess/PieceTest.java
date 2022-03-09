package chess;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.Test;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

//------- Piece tests ------------------------//
public class PieceTest{

private final static int absT=3;
private final static int pieceT=10;
private static int piece=0;//piece tests
private static int abs=0;//abstraction tests

@Test
public void pieceAbstractTest() {
    try {
        Class <?> cls = Class.forName("chess.Piece");
        assertTrue(Modifier.isAbstract(cls.getModifiers()));
        if (Modifier.isAbstract(cls.getModifiers())) {
            System.out.println("Piece is abstract: CORRECT");
            piece++;
            abs++;
        }
        else {
            System.out.println("Piece is abstract: INCORRECT");
        }
    }
    catch (ClassNotFoundException e) {
        System.out.println("Piece exists: INCORRECT");
        fail();
    }
}

@Test
public void piecePublicTest() {
    try {
        Class <?> cls = Class.forName("chess.Piece");
        assertTrue(Modifier.isPublic(cls.getModifiers()));
        if (Modifier.isPublic(cls.getModifiers())) {
            System.out.println("Piece exists: CORRECT");
            piece++;
        }
    }
    catch (ClassNotFoundException e) {
        System.out.println("Piece exists: INCORRECT");
        fail();
    }
}

@Test
public void getColourTest() {
    try {
        Class <?> cls = Class.forName("chess.Piece");
        Method m=cls.getDeclaredMethod("getColour");
        System.out.println("getColour() in Piece exists: CORRECT");
        piece++;
        assertTrue(true);
    }
    catch (ClassNotFoundException e) {
        fail();     	}
    catch (NoSuchMethodException e) {
        System.out.println("getColour() in Piece exists: INCORRECT");
        fail();
    }
    catch (SecurityException e) {
        e.printStackTrace();
    }
}

@Test
public void getSymbolTest() {
    try {
        Class <?> cls = Class.forName("chess.Piece");
        Method m=cls.getDeclaredMethod("getSymbol");
        System.out.println("getSymbol() in Piece exists: CORRECT");
        piece++;
        assertTrue(true);
    }
    catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
    catch (NoSuchMethodException e) {
        System.out.println("getSymbol() in Piece exists: INCORRECT");
        fail();
    }
    catch (SecurityException e) {
        e.printStackTrace();
    }
}

@Test
public void setSymbolTest() {
    try {
        Class <?> cls = Class.forName("chess.Piece");
        Method m=cls.getDeclaredMethod("setSymbol",String.class);
        System.out.println("setSymbol() in Piece exists: CORRECT");
        piece++;
        assertTrue(true);
    }
    catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
    catch (NoSuchMethodException e) {
        System.out.println("setSymbol() in Piece exists: INCORRECT");
        fail();
    }
    catch (SecurityException e) {
        e.printStackTrace();
    }
}

@Test
public void isLegitTest() {
    try {
        Class <?> cls = Class.forName("chess.Piece");
        Method m=cls.getDeclaredMethod("isLegitMove",int.class,int.class,int.class,int.class);
        System.out.println("isLegitMove in Piece exists: CORRECT");
        piece++;
        abs++;
        assertTrue(true);
    }
    catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
    catch (NoSuchMethodException e) {
        System.out.println("isLegitMove in Piece exists: INCORRECT");
        fail();
    }
    catch (SecurityException e) {
        e.printStackTrace();
    }
}

@Test
public void isLegitAbstractTest() {
    try {
        Class <?> cls = Class.forName("chess.Piece");
        Method m=cls.getDeclaredMethod("isLegitMove",int.class,int.class,int.class,int.class);
        assertTrue(Modifier.isAbstract(m.getModifiers()));
        if (Modifier.isAbstract(m.getModifiers())) {
            piece++;
            abs++;
            System.out.println("isLegitMove in Piece is abstract: CORRECT");
        }
        else {
            System.out.println("isLegitMove in Piece is abstract: INCORRECT");
        }
    }
    catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
    catch (NoSuchMethodException e) {
        System.out.println("isLegitMove in Piece exists: INCORRECT");
        fail();
    }
    catch (SecurityException e) {
        e.printStackTrace();
    }
}


@Test
public void symbolTest() {
    try {
        Class <?> cls = Class.forName("chess.Piece");
        Field f=cls.getDeclaredField("symbol");
        System.out.println("Symbol in Piece exists: CORRECT");
        piece++;
        assertTrue(true);
    }
    catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
    catch (NoSuchFieldException e) {
        System.out.println("Symbol in Piece exists: INCORRECT");
        fail();
    }
    catch (SecurityException e) {
        e.printStackTrace();
    }
}

@Test
public void symbolIsPrivateTest() {
    try {
        Class <?> cls = Class.forName("chess.Piece");
        Field f=cls.getDeclaredField("symbol");
        assertTrue(Modifier.isPrivate(f.getModifiers()));
        if (Modifier.isPrivate(f.getModifiers())) {
            piece++;
            System.out.println("Symbol in Piece is private: CORRECT");
        }
        else {
            System.out.println("Symbol in Piece is private: INCORRECT");

        }
    }
    catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
    catch (NoSuchFieldException e) {
        System.out.println("Symbol in Piece exists: INCORRECT");
        fail();
    }
    catch (SecurityException e) {
        e.printStackTrace();
    }
}

@Test
public void colourProtectedTest() {
    try {
        Class <?> cls = Class.forName("chess.Piece");
        Field f=cls.getDeclaredField("colour");
        assertTrue(Modifier.isProtected(f.getModifiers()));
        if (Modifier.isProtected(f.getModifiers())) {
            piece++;
            System.out.println("Colour in Piece exists and is protected: CORRECT");
        }
        else {
            System.out.println("Colour in Piece exists and is protected: INCORRECT");
        }
    }
    catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
    catch (NoSuchFieldException e) {
        System.out.println("Colour in Piece exists: INCORRECT");
        fail();
    }
    catch (SecurityException e) {
        e.printStackTrace();
    }
}
@AfterClass
public static void printResults() {
    System.out.println("===========================================");
    int a=absT-(absT-abs);
    int p=pieceT-(pieceT-piece);
    System.out.println("Piece tests passed: "+p+"/"+pieceT);
    System.out.println("Abstract tests passed: "+a+"/"+absT);
    System.out.println("===========================================");

}
}
