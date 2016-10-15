package com.company.surveymanagement.bean;

import java.sql.Date;

public class SurveyMasterBean {

	private int surveyId;
	private String surveyTitle;
	private String surveyDesc;
	private int userId;
	private Date surveyDate;
	
	/**
	 * 
	 */
	public SurveyMasterBean() {
		// TODO Auto-generated constructor stub
	}
	
	public SurveyMasterBean(int surveyId, String surveyTitle, String surveyDesc, Date surveyDate, int userId) {
		super();
		this.surveyTitle = surveyTitle;
		this.surveyDesc = surveyDesc;
		this.userId = userId;
	}


	public String getSurveyTitle() {
		return surveyTitle;
	}

	public void setSurveyTitle(String surveyTitle) {
		this.surveyTitle = surveyTitle;
	}

	public String getSurveyDesc() {
		return surveyDesc;
	}

	public void setSurveyDesc(String surveyDesc) {
		this.surveyDesc = surveyDesc;
	}

	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public int getSurveyId() {
		return surveyId;
	}


	public void setSurveyId(int surveyId) {
		this.surveyId = surveyId;
	}


	public Date getSurveyDate() {
		return surveyDate;
	}


	public void setSurveyDate(Date surveyDate) {
		this.surveyDate = surveyDate;
	}


	@Override
	public String toString() {
		return "CreateSurvey [surveyId=" + surveyId + ", surveyTitle="
				+ surveyTitle + ", surveyDesc=" + surveyDesc + ", userId="
				+ userId + ", surveyDate=" + surveyDate + "]";
	}
	
	
}
