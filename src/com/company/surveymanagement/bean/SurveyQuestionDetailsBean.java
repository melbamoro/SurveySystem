/**
 * 
 */
package com.company.surveymanagement.bean;

/**
 * @author trgl1
 *
 */
public class SurveyQuestionDetailsBean {

	private int question_id;
	private String question;
	private int survey_id;
	
	public SurveyQuestionDetailsBean(int question_id, String question, int survey_id) {
		super();
		this.question_id = question_id;
		this.question = question;
		this.survey_id = survey_id;
	}
	
	
	/**
	 * 
	 */
	public SurveyQuestionDetailsBean() {
		// TODO Auto-generated constructor stub
	}


	public int getQuestion_id() {
		return question_id;
	}


	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}


	public String getQuestion() {
		return question;
	}


	public void setQuestion(String question) {
		this.question = question;
	}


	public int getSurvey_id() {
		return survey_id;
	}


	public void setSurvey_id(int survey_id) {
		this.survey_id = survey_id;
	}


	@Override
	public String toString() {
		return "AddQuestions [question_id=" + question_id + ", question="
				+ question + ", survey_id=" + survey_id + "]";
	}
	
	
}
