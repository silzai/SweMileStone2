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
	
	@Test // generatePaperNumber() increments by 1 each time for new paper, so this test is set as follows:
	void testGeneratePaperNumber() {
		assertEquals(paper.getPaperNumber() + 1, new Paper(null, null, null, null).getPaperNumber());
	}

}
