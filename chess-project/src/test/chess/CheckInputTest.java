package chess;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CheckInputTest {
	@Test
	public void goodInputFormat() {
		assertTrue(CheckInput.checkCoordinateValidity("1a"));
	}

	@Test
	public void emptyInputSize() {
		assertFalse(CheckInput.checkCoordinateValidity(""));
	}

	@Test
	public void wrongInputSize1() {
		assertFalse(CheckInput.checkCoordinateValidity("1"));
	}

	@Test
	public void wrongInputSize2() {
		assertFalse(CheckInput.checkCoordinateValidity("1aa"));
	}

	@Test
	public void wrongInputSize3() {
		assertFalse(CheckInput.checkCoordinateValidity("1 a"));
	}

	@Test
	public void wrongInputSize4() {
		assertFalse(CheckInput.checkCoordinateValidity("111"));
	}

	@Test
	public void wrongInputSize5() {
		assertFalse(CheckInput.checkCoordinateValidity("1aa1"));
	}

	@Test
	public void wrongInputFormat() {
		assertFalse(CheckInput.checkCoordinateValidity("a1"));
	}

	@Test
	public void wrongInputFormat2() {
		assertFalse(CheckInput.checkCoordinateValidity("bc"));
	}

	@Test
	public void wrongInputFormat3() {
		assertFalse(CheckInput.checkCoordinateValidity("34"));
	}

	@Test
	public void rightInputFormatBeyondBoundaries1() {
		assertFalse(CheckInput.checkCoordinateValidity("8i"));
	}

	@Test
	public void rightInputFormatBeyondBoundaries2() {
		assertFalse(CheckInput.checkCoordinateValidity("9g"));
	}

	@Test
	public void rightInputFormatBeyondBoundaries3() {
		assertFalse(CheckInput.checkCoordinateValidity("9i"));
	}
}
