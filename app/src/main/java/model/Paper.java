package model;

import java.io.Serializable;
import java.util.List;

public class Paper implements Serializable{
	
	private String paperTitle;
	private List<String> listOfAuthors;
	private List<String> keywords;
	private String paperAbstract;
	
	public Paper(String paperTitle, List<String> listOfAuthors, List<String> keywords, String paperAbstract) {
		this.paperTitle = paperTitle;
		this.listOfAuthors = listOfAuthors;
		this.keywords = keywords;
		this.paperAbstract = paperAbstract;
	}
	
	

}
