package swemilestone2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Paper;

class PaperTest {
	
	Paper paper = new Paper("new paper", null, null, null);

	@Test
	void testGetPaperTitle() {
		assertEquals("new paper", paper.getPaperTitle());
	}
	
	@Test
	void testGeneratePaperNumber() {
		assertEquals(null, null);
	}

}
