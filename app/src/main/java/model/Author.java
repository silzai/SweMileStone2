package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Author extends User implements Serializable{
	
	

	private CreditCard creditCard;
	private  List<Paper> papersList = new ArrayList<>();
	private MealPreference mealPreference;
	private Reciept receipt;
	private boolean decisionOnPaper;
	private Reservation reservationn;
	private Conference selectedConference;

	/**
	 * 
	 * @param String
	 * @param password
	 * @param Paper
	 */
	public Author(String firstName, String lastName, String id){
		super(firstName, lastName, id);
		this.selectedConference = null;
	}

	public CreditCard getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}

	public List<Paper>getPapersList() {
		if(papersList==null) {
			return papersList = new ArrayList<>();
		}
		return papersList;
	}

	public void addPapersList(Paper paper) {
		if(papersList==null) {
			papersList = new ArrayList<>();
		}
		else {
		this.papersList.add(paper);}
	}

	public MealPreference getMealPreference() {
		return mealPreference;
	}

	public void setMealPreference(MealPreference mealPreference) {
		this.mealPreference = mealPreference;
	}

	public Reciept getReceipt() {
		return receipt;
	}

	public void setReceipt(Reciept receipt) {
		this.receipt = receipt;
	}

	public boolean isDecisionOnPaper() {
		return decisionOnPaper;
	}

	public void setDecisionOnPaper(boolean decisionOnPaper) {
		this.decisionOnPaper = decisionOnPaper;
	}

	public Reservation getReservationn() {
		return reservationn;
	}

	public void setReservationn(Reservation reservationn) {
		this.reservationn = reservationn;
	}

	public Conference getSelectedConference() {
		return selectedConference;
	}

	public void setSelectedConference(Conference selectedConference) {
		this.selectedConference = selectedConference;
	}

	public void setMealPreference() {
		// TODO - implement Class.setMealPreference
		throw new UnsupportedOperationException();
	}

	public void setSelectedConference() {
		// TODO - implement Class.setSelectedConference
		throw new UnsupportedOperationException();
	}

	public void notifyDecisionOnPaper() {
		// TODO - implement Class.notifyDecisionOnPaper
		throw new UnsupportedOperationException();
	}

	@Override
	public String toString() {
		return "Author "+super.toString()+ "[reservationn=" + reservationn + ", selectedConference=" + selectedConference + "]"+ "papers: " + papersList;
	}
	
	
}

