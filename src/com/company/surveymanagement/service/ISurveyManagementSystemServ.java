package com.company.surveymanagement.service;

import java.util.List;

import com.igate.surveymanagement.bean.SurveyMasterBean;
import com.igate.surveymanagement.bean.SurveyQuestionAnswerBean;




public interface ISurveyManagementSystemServ {
	

	public int createSurvry(SurveyMasterBean cr);
	public List<SurveyMasterBean> getSurveyByUser(int UserId);
	public boolean createQuestion(SurveyQuestionAnswerBean aq);
}
