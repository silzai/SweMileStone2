package model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataBuffer {
	
	public static List<Conference> conferences = new ArrayList<Conference>();
	public static List<Author> authors = new ArrayList<Author>();
	
	private static void loadConferences() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("data/conferencesContainer.dat"));
		if (!(br.readLine() == null)) {
			ObjectInputStream in;
			try {
				in = new ObjectInputStream(new FileInputStream("data/conferencesContainer.dat"));
				conferences = (ArrayList<Conference>) in.readObject();
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static List<Conference> getConferencesContainer() throws IOException{
		loadConferences();
		return conferences;
	}
	
	public static void createDataForTesting() {
		
		List<Conference> testList = new ArrayList<>();
		
		testList.add(new Conference("conf1", new Date(), new Date(), new Venue(), new ArrayList<Reviewer>()));
		testList.add(new Conference("conf2", new Date(), new Date(), new Venue(), new ArrayList<Reviewer>()));
		testList.add(new Conference("conf3", new Date(), new Date(), new Venue(), new ArrayList<Reviewer>()));
		
		ObjectOutputStream out;
		try {
			out = new ObjectOutputStream(new FileOutputStream("data/conferencesContainer.dat"));
			out.writeObject(testList);
			out.flush();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void storeAuthors() {
		ObjectOutputStream out;
		try {
			out = new ObjectOutputStream(new FileOutputStream("data/authorContainer.dat"));
			out.writeObject(AuthorContainer.Authors);
			out.flush();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static List<Author> loadAuthors() throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("data/authorContainer.dat"));
		if (!(br.readLine() == null)) {
			ObjectInputStream in;
			try {
				in = new ObjectInputStream(new FileInputStream("data/authorContainer.dat"));
				authors = (ArrayList<Author>) in.readObject();
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			System.out.println(authors);
			
			return authors;
		}
		return null;
		
	}
}
