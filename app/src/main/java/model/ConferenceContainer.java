package model;

import java.util.ArrayList;
import java.util.List;

public class ConferenceContainer {
	
	private static List<Conference> conferencesList = new ArrayList<>();
	
	public static void addConference(Conference conference) {
		conferencesList.add(conference);
	}
	
	public static List<Conference> getConferences() {
		return conferencesList;
	}

}
