package com.company.surveymanagement.bean;

import java.util.Date;

public class SurveyDistributeBean {

	private int surveyId;
	private Date distributeDate;
	
	
	public SurveyDistributeBean(int surveyId, Date distributeDate) {
		super();
		this.surveyId = surveyId;
		this.distributeDate = distributeDate;
	}


	public int getSurveyId() {
		return surveyId;
	}


	public void setSurveyId(int surveyId) {
		this.surveyId = surveyId;
	}


	public Date getDistributeDate() {
		return distributeDate;
	}


	public void setDistributeDate(Date distributeDate) {
		this.distributeDate = distributeDate;
	}


	@Override
	public String toString() {
		return "SurveyDistribute [surveyId=" + surveyId + ", distributeDate="
				+ distributeDate + "]";
	}
	
	
	
	
}
