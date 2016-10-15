package com.company.surveymanagement.dao;

import java.sql.ResultSet;
import java.util.List;

import com.igate.surveymanagement.bean.SurveyQuestionAnswerBean;
import com.igate.surveymanagement.bean.SurveyQuestionDetailsBean;
import com.igate.surveymanagement.bean.SurveyMasterBean;


public interface ISurveyManagementDAO {
	
	public int createSurvry(SurveyMasterBean cr);
	public boolean editSurvey(SurveyMasterBean cr);
	public ResultSet getSurveyDetails(int survey_id);
	public boolean deleteSurvey(int survey_id);
	public boolean createQuestion(SurveyQuestionAnswerBean aq);
	public boolean deleteQuestion(int question_id);
	public ResultSet viewQuestionsBySurvey(int survey_id);
	public ResultSet viewAllQuestions();
	public List<SurveyMasterBean> getSurveyByUser(int UserId);
	
	
}
