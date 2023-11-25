package swemilestone2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Conference;
import model.Paper;

//Testing with only relevant methods (testing getters and setters are omitted)
class ConferenceTest {
	
	Conference conf = new Conference();
	
	@Test 
	void testConference() {
		testGetName();
		testAddInitiallySubmittedPapersList();
	}
	
	@Test 
	void testGetName() {
		conf.setName("new conference");
		assertEquals("new conference", conf.getName());
	}
	
	@Test
	void testAddInitiallySubmittedPapersList() {
		Paper paper = new Paper("new paper", null, null, null);
		conf.addInitiallySubmittedPapersList(paper);
		assertTrue(conf.getInitiallySubmittedPapersList().contains(paper));
	}

}
