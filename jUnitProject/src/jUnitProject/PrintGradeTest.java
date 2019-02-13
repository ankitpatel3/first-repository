package jUnitProject;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;

import org.junit.jupiter.api.Test;

class PrintGradeTest {

	@Test
	void test() {
		PrintGrade pg = new PrintGrade();
		String result = pg.print(94);
		assertEquals("You got an A!", result);
	}

}
