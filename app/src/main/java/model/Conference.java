package model;
import java.io.Serializable;
import java.util.*;
public class Conference implements Serializable{
	private String name;
	private Date conferenceDate;
	private Venue venue;
	private List<Reviewer> reviewersList;
	private String conferenceCode;
	private Date paperSubmissionDate;
	private Proceedings conferenceProceedings;
	private List<Paper> acceptedPapersList;
	private Date reviewResultDeadline;
	private List<Author> registeredAuthors;
	private List<Paper> rejectedPapersList;
	private List<Paper> initiallySubmittedPapersList;

	/**
	 * 
	 * @param name
	 * @param conferenceDate
	 * @param paperSubmittionDate
	 * @param venue
	 * @param reviewersList
	 */
	
	public Conference(String name, Date conferenceDate, Date paperSubmissionDate, Venue venue, List<Reviewer> reviewersList) {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getConferenceDate() {
		return conferenceDate;
	}

	public void setConferenceDate(Date conferenceDate) {
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

	public Date getPaperSubmissionDate() {
		return paperSubmissionDate;
	}

	public void setPaperSubmissionDate(Date paperSubmittionDate) {
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

	public Date getReviewResultDeadline() {
		return reviewResultDeadline;
	}

	public void setReviewResultDeadline(Date reviewResultDeadline) {
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

	public void setRejectedPapersList(List<Paper> rejectedPapersList) {
		this.rejectedPapersList = rejectedPapersList;
	}

	public List<Paper> getInitiallySubmittedPapersList() {
		return initiallySubmittedPapersList;
	}

	public void setInitiallySubmittedPapersList(List<Paper> initiallySubmittedPapersList) {
		this.initiallySubmittedPapersList = initiallySubmittedPapersList;
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
	}}

