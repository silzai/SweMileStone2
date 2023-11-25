package model;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ConferenceContainer {
	
	public static List<Conference> conferencesList = new ArrayList<>();
	
	public static void addConference(Conference conference) {
		conferencesList.add(conference);
		storeConferenceData();
	}
	
	public static List<Conference> getConferences() {
		conferencesList = loadConferenceData();
		return conferencesList;
		
	}
	
	public static void storeConferenceData() {
		ObjectOutputStream out;
		try {
			out = new ObjectOutputStream(new FileOutputStream("data/conferencesContainer.dat"));
			out.writeObject(conferencesList);
			out.flush();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static List<Conference> loadConferenceData() {
		ObjectInputStream in;
		try {
			in = new ObjectInputStream(new FileInputStream("data/conferencesContainer.dat"));
			conferencesList = (List<Conference>) in.readObject();
			in.close();
		
		}catch (EOFException e) {
		}  
		catch (IOException e) {
			System.out.println("IOException");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException");
			e.printStackTrace();
		}
		return conferencesList;
	}

}
