package model;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class PaperContainer {
	
private static List<Paper> papersList = new ArrayList<>();
	
	public static void addPaper(Paper paper) {
		papersList.add(paper);
	}
	
	public static List<Paper> getPapers() {
		return papersList;
	}
	
	public static void storeData() {
		ObjectOutputStream out;
		try {
			out = new ObjectOutputStream(new FileOutputStream("data/papersContainer.dat"));
			out.writeObject(papersList);
			out.flush();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
