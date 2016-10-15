package com.company.surveymanagement.service;

import java.util.List;

import com.igate.surveymanagement.bean.SurveyMasterBean;
import com.igate.surveymanagement.bean.SurveyQuestionAnswerBean;
import com.igate.surveymanagement.dao.ISurveyManagementDAO;
import com.igate.surveymanagement.dao.SurveyManagementDAO;



public class SurveyManagementSystemServ implements ISurveyManagementSystemServ{
	ISurveyManagementDAO smd = new SurveyManagementDAO();
	
	public int createSurvry(SurveyMasterBean cr) {
	
		return smd.createSurvry(cr);
	}
	
	@Override
	public List<SurveyMasterBean> getSurveyByUser(int UserId) {
		
		return smd.getSurveyByUser(UserId);
	}

	/* (non-Javadoc)
	 * @see com.igate.surveymanagement.service.ISurveyManagementSystemServ#createQuestion(com.igate.surveymanagement.bean.SurveyQuestionAnswerBean)
	 */
	@Override
	public boolean createQuestion(SurveyQuestionAnswerBean aq) {
		return smd.createQuestion(aq);
	}
	

}
