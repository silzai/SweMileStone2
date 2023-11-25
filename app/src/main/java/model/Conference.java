package model;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.*;
/**
 * Only the relevant functions to the use-case specification are working
 */
public class Conference implements Serializable{
	
	private static final long serialVersionUID = -4500023823003890590L;
	
	private String name;
	private Calendar conferenceDate;
	private Venue venue;
	private List<Reviewer> reviewersList;
	private String conferenceCode;
	private Calendar paperSubmissionDate;
	private Proceedings conferenceProceedings;
	private List<Paper> acceptedPapersList;
	private Calendar reviewResultDeadline;
	private List<Author> registeredAuthors;
	private List<Paper> rejectedPapersList;
	private List<Paper> initiallySubmittedPapersList = new ArrayList<>();

	/**
	 * @param name
	 * @param conferenceDate
	 * @param paperSubmittionDate
	 * @param venue
	 * @param reviewersList
	 */
	public Conference(String name, Calendar conferenceDate, Calendar paperSubmissionDate, Venue venue, List<Reviewer> reviewersList) {
		
	}
	
	public Conference() {};
	
	public String getVenueName() {
		return venue.getName();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Calendar getConferenceDate() {
		return conferenceDate;
	}
	
	public String getConferenceDateString() {
        SimpleDateFormat sm = new SimpleDateFormat("dd-mm-yyyy");
        
        return sm.format(this.conferenceDate.getTime());
	}

	public void setConferenceDate(Calendar conferenceDate) {
		this.conferenceDate = conferenceDate;
	}

	public Venue getVenue() {
		return venue;
	}

	public void setVenue(Venue venue) {
		this.venue = venue;
	}

	public List<Reviewer> getReviewersList() {
		return reviewersList;
	}

	public void setReviewersList(List<Reviewer> reviewersList) {
		this.reviewersList = reviewersList;
	}

	public String getConferenceCode() {
		return conferenceCode;
	}

	public void setConferenceCode(String conferenceCode) {
		this.conferenceCode = conferenceCode;
	}

	public Calendar getPaperSubmissionDate() {
		return paperSubmissionDate;
	}
	
	public String getPaperSubmissionDateString() {
        SimpleDateFormat sm = new SimpleDateFormat("dd-mm-yyyy");
        
        return sm.format(this.paperSubmissionDate.getTime());
	}

	public void setPaperSubmissionDate(Calendar paperSubmittionDate) {
		this.paperSubmissionDate = paperSubmittionDate;
	}

	public Proceedings getConferenceProceedings() {
		return conferenceProceedings;
	}

	public void setConferenceProceedings(Proceedings conferenceProceedings) {
		this.conferenceProceedings = conferenceProceedings;
	}

	public List<Paper> getAcceptedPapersList() {
		return acceptedPapersList;
	}

	public void setAcceptedPapersList(List<Paper> acceptedPapersList) {
		this.acceptedPapersList = acceptedPapersList;
	}

	public Calendar getReviewResultDeadline() {
		return reviewResultDeadline;
	}

	public void setReviewResultDeadline(Calendar reviewResultDeadline) {
		this.reviewResultDeadline = reviewResultDeadline;
	}

	public List<Author> getRegisteredAuthors() {
		return registeredAuthors;
	}

	public void setRegisteredAuthors(List<Author> registeredAuthors) {
		this.registeredAuthors = registeredAuthors;
	}

	public List<Paper> getRejectedPapersList() {
		return rejectedPapersList;
	}

	public void addRejectedPapersList(Paper rejectedPaper) {
		this.rejectedPapersList.add(rejectedPaper);
	}

	public List<Paper> getInitiallySubmittedPapersList() {
		if(initiallySubmittedPapersList==null) {
			return initiallySubmittedPapersList = new ArrayList<>();
		}
		return initiallySubmittedPapersList;
	}

	public void addInitiallySubmittedPapersList(Paper initiallySubmittedPaper) {
		if(initiallySubmittedPapersList==null) {
			initiallySubmittedPapersList = new ArrayList<>();
		}else {
		this.initiallySubmittedPapersList.add(initiallySubmittedPaper);}
	}

	public Proceedings generateProceedings() {
		// TODO - implement Conference.generateProceedings
		throw new UnsupportedOperationException();
	}

	private String generateConferenceCode() {
		// TODO - implement Conference.generateConferenceCode
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param author
	 */
	public void registerAuthorForConference(Author author) {
		// TODO - implement Conference.registerAuthorForConference
		throw new UnsupportedOperationException();
	}

	public String getAbstract() {
		// TODO - implement Conference.getAbstract
		throw new UnsupportedOperationException();
	}

	public String makeDecisionOnPapers() {
		// TODO - implement Conference.makeDecisionOnPapers
		throw new UnsupportedOperationException();
	}

	public void assignPapersToReviewers() {
		// TODO - implement Conference.assignPapersToReviewers
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param reviewer
	 */
	public void releaseReviewer(Reviewer reviewer) {
		// TODO - implement Conference.releaseReviewer
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param paper
	 */
	public int submitPaperToConference(Paper paper) {
		// TODO - implement Conference.submitPaperToConference
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param conferenceProceedings
	 */
	public void sendProceedingToPress(Proceedings conferenceProceedings) {
		// TODO - implement Conference.sendProceedingToPress
		throw new UnsupportedOperationException();
	}

	@Override
	public String toString() {
		return "Conference [name=" + name + ", reviewersList=" + reviewersList + "]";
	}
	

}

