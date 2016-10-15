/**
 * 
 */
package com.company.surveymanagement.bean;

/**
 * @author trgl1
 *
 */
public class SurveyResponseBean {

	private String resName;
	private String resEmail;
	private int distributionId;
	private int questionId;
	private String option;
	
	public SurveyResponseBean(String resName, String resEmail, int distributionId,
			int questionId, String option) {
		super();
		this.resName = resName;
		this.resEmail = resEmail;
		this.distributionId = distributionId;
		this.questionId = questionId;
		this.option = option;
	}

	public String getResName() {
		return resName;
	}

	public void setResName(String resName) {
		this.resName = resName;
	}

	public String getResEmail() {
		return resEmail;
	}

	public void setResEmail(String resEmail) {
		this.resEmail = resEmail;
	}

	public int getDistributionId() {
		return distributionId;
	}

	public void setDistributionId(int distributionId) {
		this.distributionId = distributionId;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	@Override
	public String toString() {
		return "SurveyResponse [resName=" + resName + ", resEmail=" + resEmail
				+ ", distributionId=" + distributionId + ", questionId="
				+ questionId + ", option=" + option + "]";
	}
	
	
	
}
