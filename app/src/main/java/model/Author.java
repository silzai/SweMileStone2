package model;

public class Author extends User{

	private CreditCard creditCard;
	private Paper[] papersList;
	private MealPreference mealPreference;
	private Reciept receipt;
	private boolean decisionOnPaper;
	private Reservation reservationn;
	private String authorLastName;
	private Conference selectedConference;

	/**
	 * 
	 * @param String
	 * @param password
	 * @param Paper
	 */
	public Author(String firstName, String lastName, String id) {
		super(firstName, lastName, id);
	}

	public CreditCard getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}

	public Paper[] getPapersList() {
		return papersList;
	}

	public void setPapersList(Paper[] papersList) {
		this.papersList = papersList;
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

	public String getAuthorLastName() {
		return authorLastName;
	}

	public void setAuthorLastName(String authorLastName) {
		this.authorLastName = authorLastName;
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

}

