package swemilestone2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.ConferenceContainer;

class ConferenceContainerTest {

	@Test
	void testGetConferences() {
		assertTrue(ConferenceContainer.getConferences().size() > 0);
	}

}
